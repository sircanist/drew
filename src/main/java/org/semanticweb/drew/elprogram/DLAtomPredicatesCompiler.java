package org.semanticweb.drew.elprogram;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.lang.model.type.PrimitiveType;

import org.semanticweb.drew.dlprogram.model.CacheManager;
import org.semanticweb.drew.dlprogram.model.Clause;
import org.semanticweb.drew.dlprogram.model.Constant;
import org.semanticweb.drew.dlprogram.model.DLAtomPredicate;
import org.semanticweb.drew.dlprogram.model.DLInputSignature;
import org.semanticweb.drew.dlprogram.model.Literal;
import org.semanticweb.drew.dlprogram.model.NormalPredicate;
import org.semanticweb.drew.dlprogram.model.Term;
import org.semanticweb.drew.dlprogram.model.Variable;
import org.semanticweb.drew.el.SymbolEncoder;
import org.semanticweb.drew.el.reasoner.DReWELManager;
import org.semanticweb.drew.el.reasoner.RewritingVocabulary;
import org.semanticweb.owlapi.model.IRI;

public class DLAtomPredicatesCompiler {

	private SymbolEncoder<DLInputSignature> dlInputSignatureEncoder;
	private SymbolEncoder<IRI> iriEncoder;

	public DLAtomPredicatesCompiler() {
		dlInputSignatureEncoder = DReWELManager.getInstance().getDlInputSignatureEncoder();
		iriEncoder = DReWELManager.getInstance().getIRIEncoder();
	}

	public List<Clause> compile(Collection<DLAtomPredicate> dlAtomPredicates) {
		List<Clause> result = new ArrayList<Clause>();
		for (DLAtomPredicate predicate : dlAtomPredicates) {
			result.add(compile(predicate));
		}
		return result;
	}

	private Clause compile(DLAtomPredicate predicate) {
		DLInputSignature inputSignature = predicate.getInputSignature();

		int input = dlInputSignatureEncoder.encode(inputSignature);
		int query = iriEncoder.encode(predicate.getQuery().getIRI());
		Constant q = CacheManager.getInstance().getConstant(predicate.getQuery().getIRI());
		// DL[\lambda; D](X) ~->
		// D_{\lambda}(X) :- inst_{\lambda}(X, D)

		Clause clause = new Clause();
		String headPredciateName = RewritingVocabulary.DL_ATOM + "_" + query + "_" + input;
		NormalPredicate headPredicate = CacheManager.getInstance().getPredicate(headPredciateName, 1);
		Variable X = CacheManager.getInstance().getVariable("X");
		Literal head = new Literal(headPredicate, X);
		clause.setHead(head);
		String bodyPredicateName = RewritingVocabulary.INST.getName() + "_" + input;
		NormalPredicate bodyPredicate = CacheManager.getInstance().getPredicate(bodyPredicateName, 2);
		Literal body = new Literal(bodyPredicate, X, q);
		clause.getPositiveBody().add(body);

		return clause;
	}
}
