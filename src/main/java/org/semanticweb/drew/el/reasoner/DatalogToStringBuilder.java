package org.semanticweb.drew.el.reasoner;

import java.sql.Types;

import org.semanticweb.drew.dlprogram.model.Clause;
import org.semanticweb.drew.dlprogram.model.Constant;
import org.semanticweb.drew.dlprogram.model.DLProgram;
import org.semanticweb.drew.dlprogram.model.Literal;
import org.semanticweb.drew.dlprogram.model.NormalPredicate;
import org.semanticweb.drew.dlprogram.model.Predicate;
import org.semanticweb.drew.dlprogram.model.Term;

public class DatalogToStringBuilder {

	StringBuilder sb;

	public DatalogToStringBuilder() {

	}

	public String toString(DLProgram program) {
		sb = new StringBuilder();
		for (Clause r : program.getClauses()) {
			toString(r);
			sb.append("\n");
		}

		return sb.toString();
	}

	private void toString(Clause r) {
		toString(r.getHead());

		if (r.getBody().size() > 0) {
			sb.append(" :- ");
			boolean firstLiteral = true;
			for (Literal literal : r.getPositiveBody()) {
				if (!firstLiteral) {
					sb.append(", ");
				}
				firstLiteral = false;
				toString(literal);
			}

			for (Literal literal : r.getNegativeBody()) {
				if (!firstLiteral) {
					sb.append(", ");
				}
				firstLiteral = false;
				sb.append("not ");
				toString(literal);
			}
		}

		sb.append(".");
	}

	private void toString(Literal lit) {
		final Predicate predicate = lit.getPredicate();
		if (predicate instanceof NormalPredicate) {
			sb.append(((NormalPredicate) predicate).getName());
		} else {
			sb.append(predicate);
		}

		if (lit.getTerms().size() > 0) {

			sb.append("(");
			boolean first = true;
			for (Term t : lit.getTerms()) {
				if (!first) {
					sb.append(", ");
				}
				first = false;
				if (t instanceof Constant && ((Constant) t).getType() == Types.INTEGER) {
					int i = Integer.parseInt(t.getName());
					switch (DReWELManager.getInstance().getNamingStrategy()) {
					case IntEncoding:
						sb.append(i);
						break;
					case IRIFragment:
						sb.append("\"").append(DReWELManager.getInstance().getIriEncoder().decode(i).getFragment())
								.append("\"");
						break;
					case IRIFull:
						sb.append("\"").append(DReWELManager.getInstance().getIriEncoder().decode(i)).append("\"");
						break;
					default:
						break;
					}

				} else {
					sb.append(t);
				}
			}
			sb.append(")");
		}
	}

}