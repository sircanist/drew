package org.semanticweb.drew.el;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

import junit.framework.TestSuite;

import org.junit.Test;
import org.semanticweb.drew.dlprogram.format.DLProgramStorer;
import org.semanticweb.drew.dlprogram.format.DLProgramStorerImpl;
import org.semanticweb.drew.dlprogram.model.DLProgram;
import org.semanticweb.drew.dlprogram.model.DLProgramKB;
import org.semanticweb.drew.dlprogram.parser.DLProgramParser;
import org.semanticweb.drew.dlprogram.parser.ParseException;
import org.semanticweb.drew.el.profile.SROELProfile;
import org.semanticweb.drew.el.reasoner.DReWELManager;
import org.semanticweb.drew.el.reasoner.DatalogFormat;
import org.semanticweb.drew.el.reasoner.NamingStrategy;
import org.semanticweb.drew.el.reasoner.SROEL2DatalogRewriter;
import org.semanticweb.drew.elprogram.ELProgramKBRewriter;
import org.semanticweb.owlapi.apibinding.OWLManager;
import org.semanticweb.owlapi.model.OWLOntology;
import org.semanticweb.owlapi.model.OWLOntologyCreationException;
import org.semanticweb.owlapi.model.OWLOntologyManager;
import org.semanticweb.owlapi.model.OWLOntologyStorageException;
import org.semanticweb.owlapi.profiles.OWLProfileReport;

/**
 * Unit test for simple App.
 */
public class AppTest {

	/**
	 * @return the suite of tests being tested
	 */
	public static TestSuite suite() {
		return new TestSuite(AppTest.class);
	}

	/**
	 * Rigourous Test :-)
	 * 
	 * @throws OWLOntologyCreationException
	 */
	@Test
    public void testApp() throws OWLOntologyCreationException {
		DReWELManager.getInstance().setNamingStrategy(NamingStrategy.IRIFragment);
		final String owlFileName = "testcase/Test01.owl";

		File file = new File(owlFileName);
		OWLOntologyManager man = OWLManager.createOWLOntologyManager();
		OWLOntology ontology = man.loadOntologyFromOntologyDocument(file);

		SROELProfile sroelProfile = new SROELProfile();
		OWLProfileReport report = sroelProfile.checkOntology(ontology);

		System.out.println(report);

		System.out.println("---------------------------------------");

		SROEL2DatalogRewriter rewriter = new SROEL2DatalogRewriter();
		DLProgram datalog = rewriter.rewrite(ontology);

		rewriter.saveToFile("testcase/test01.owl.dl");

		DLProgramStorer storer = new DLProgramStorerImpl();
		storer.store(datalog, System.out);
		System.out.println();
		
//		DatalogToStringHelper builder = new DatalogToStringHelper();
//		String strDatalog = builder.toString(datalog);
//
//		System.out.println(strDatalog);
		System.out.println("---------------------------------------");

	}

	@Test
    public void testTopBot() throws OWLOntologyCreationException {
		DReWELManager.getInstance().setNamingStrategy(NamingStrategy.IRIFragment);
		final String owlFileName = "testcase/testTopBot.owl";

		File file = new File(owlFileName);
		OWLOntologyManager man = OWLManager.createOWLOntologyManager();
		OWLOntology ontology = man.loadOntologyFromOntologyDocument(file);

		SROELProfile sroelProfile = new SROELProfile();
		OWLProfileReport report = sroelProfile.checkOntology(ontology);

		System.out.println(report);

		System.out.println("---------------------------------------");

		SROEL2DatalogRewriter rewriter = new SROEL2DatalogRewriter();
		DLProgram datalog = rewriter.rewrite(ontology);

		DLProgramStorer storer = new DLProgramStorerImpl();
		storer.store(datalog, System.out);
		System.out.println();
//		DatalogToStringHelper builder = new DatalogToStringHelper();
//		String strDatalog = builder.toString(datalog);
//
//		System.out.println(strDatalog);
		System.out.println("---------------------------------------");
	}

	@Test
    public void testSubRole() throws OWLOntologyCreationException {
		DReWELManager.getInstance().setNamingStrategy(NamingStrategy.IRIFragment);
		final String owlFileName = "testcase/testSubRole.owl";

		File file = new File(owlFileName);
		OWLOntologyManager man = OWLManager.createOWLOntologyManager();
		OWLOntology ontology = man.loadOntologyFromOntologyDocument(file);

		SROELProfile sroelProfile = new SROELProfile();
		OWLProfileReport report = sroelProfile.checkOntology(ontology);

		System.out.println(report);

		System.out.println("---------------------------------------");

		SROEL2DatalogRewriter rewriter = new SROEL2DatalogRewriter();
		DLProgram datalog = rewriter.rewrite(ontology);

		DLProgramStorer storer = new DLProgramStorerImpl();
		storer.store(datalog, System.out);
		System.out.println();
		
//		DatalogToStringHelper builder = new DatalogToStringHelper();
//		String strDatalog = builder.toString(datalog);
//
//		System.out.println(strDatalog);
		System.out.println("---------------------------------------");
	}

	@Test
    public void testNom() throws OWLOntologyCreationException {
		DReWELManager.getInstance().setNamingStrategy(NamingStrategy.IRIFragment);
		final String owlFileName = "testcase/testNom.owl";

		File file = new File(owlFileName);
		OWLOntologyManager man = OWLManager.createOWLOntologyManager();
		OWLOntology ontology = man.loadOntologyFromOntologyDocument(file);

		SROELProfile sroelProfile = new SROELProfile();
		OWLProfileReport report = sroelProfile.checkOntology(ontology);

		System.out.println(report);

		System.out.println("---------------------------------------");

		SROEL2DatalogRewriter rewriter = new SROEL2DatalogRewriter();
		DLProgram datalog = rewriter.rewrite(ontology);

		DLProgramStorer storer = new DLProgramStorerImpl();
		storer.store(datalog, System.out);
		System.out.println();
		
//		DatalogToStringHelper builder = new DatalogToStringHelper();
//		String strDatalog = builder.toString(datalog);
//
//		System.out.println(strDatalog);
		System.out.println("---------------------------------------");
	}

	@Test
    public void testSelf() throws OWLOntologyCreationException {
		DReWELManager.getInstance().setNamingStrategy(NamingStrategy.IRIFragment);
		final String owlFileName = "testcase/testSelf.owl";

		File file = new File(owlFileName);
		OWLOntologyManager man = OWLManager.createOWLOntologyManager();
		OWLOntology ontology = man.loadOntologyFromOntologyDocument(file);

		SROELProfile sroelProfile = new SROELProfile();
		OWLProfileReport report = sroelProfile.checkOntology(ontology);

		System.out.println(report);

		System.out.println("---------------------------------------");

		SROEL2DatalogRewriter rewriter = new SROEL2DatalogRewriter();
		DLProgram datalog = rewriter.rewrite(ontology);

		DLProgramStorer storer = new DLProgramStorerImpl();
		storer.store(datalog, System.out);
		System.out.println();
		
//		DatalogToStringHelper builder = new DatalogToStringHelper();
//		String strDatalog = builder.toString(datalog);
//
//		System.out.println(strDatalog);
	}

	@Test
    public void testRoleChain() throws OWLOntologyCreationException, OWLOntologyStorageException, IOException {
		OWLOntologyManager man = OWLManager.createOWLOntologyManager();
		// OWLDataFactory factory = man.getOWLDataFactory();
		//
		// OWLObjectProperty r1 =
		// factory.getOWLObjectProperty(IRI.create("http://www.semanticweb.org/ontologies/Test01.owl#R1"));
		// OWLObjectProperty r2 =
		// factory.getOWLObjectProperty(IRI.create("http://www.semanticweb.org/ontologies/Test01.owl#R2"));
		// OWLObjectProperty r =
		// factory.getOWLObjectProperty(IRI.create("http://www.semanticweb.org/ontologies/Test01.owl#R"));
		//
		// List<OWLObjectPropertyExpression> chain = new
		// ArrayList<OWLObjectPropertyExpression>();
		// chain.add(r1);
		// chain.add(r2);
		// OWLSubPropertyChainOfAxiom axiom =
		// factory.getOWLSubPropertyChainOfAxiom(chain , r);
		//
		// OWLOntology ontology = man.createOntology();
		// man.addAxiom(ontology, axiom);

		DReWELManager.getInstance().setNamingStrategy(NamingStrategy.IRIFragment);
		final String owlFileName = "testcase/testRoleChain.owl";
		final String prologFileName = "testcase/testRoleChain.pl";
		File file = new File(owlFileName);
		OWLOntology ontology = man.loadOntologyFromOntologyDocument(file);

		man.saveOntology(ontology, new FileOutputStream(owlFileName));
		SROELProfile sroelProfile = new SROELProfile();
		OWLProfileReport report = sroelProfile.checkOntology(ontology);

		System.out.println(report);

		System.out.println("---------------------------------------");

		SROEL2DatalogRewriter rewriter = new SROEL2DatalogRewriter();
		DLProgram datalog = rewriter.rewrite(ontology);

		DLProgramStorer storer = new DLProgramStorerImpl();
		storer.store(datalog, System.out);
		System.out.println();
		
//		DatalogToStringHelper builder = new DatalogToStringHelper();
//		builder.saveToFile(datalog, prologFileName);
//		// String strDatalog = builder.toString(datalog);
		//
		// FileWriter writer = new FileWriter(prologFileName);
		//
		// writer.append(strDatalog);
		// writer.close();

		// System.out.println(strDatalog);
	}

	@Test
	public void testELProgram() throws OWLOntologyCreationException, FileNotFoundException, ParseException {
		DReWELManager.getInstance().setNamingStrategy(NamingStrategy.IRIFragment);
		//DReWELManager.getInstance().setDatalogFormat(DatalogFormat.XSB);
		final String owlFileName = "testcase/test02.owl";
		// final String dlpFileName = "testcase/test01.dlp";
		final String dlpFileName = "testcase/test01.dlp";
		File file = new File(owlFileName);
		OWLOntologyManager man = OWLManager.createOWLOntologyManager();
		OWLOntology ontology = man.loadOntologyFromOntologyDocument(file);
		DLProgramParser parser = new DLProgramParser(new FileReader(dlpFileName));
		DLProgram elprogram = parser.program();
		DLProgramKB kb = new DLProgramKB();
		kb.setOntology(ontology);
		kb.setProgram(elprogram);

		ELProgramKBRewriter compiler = new ELProgramKBRewriter();
		DLProgram datalog = compiler.rewrite(kb);
		// System.out.println(datalog);
		DLProgramStorer storer = new DLProgramStorerImpl();
		storer.store(datalog, System.out);
		System.out.println();
//		DatalogToStringHelper builder = new DatalogToStringHelper();
//		String prologFileName = "testcase/testELProgram.pl";
//		builder.saveToFile(datalog, prologFileName);
//		// System.out.println(new DatalogToStringHelper().toString(datalog));
	}

	@Test
	public void testLUBMProfile() throws OWLOntologyCreationException {
		DReWELManager.getInstance().setNamingStrategy(NamingStrategy.IRIFragment);
		DReWELManager.getInstance().setDatalogFormat(DatalogFormat.XSB);
		SROELProfile profile = new SROELProfile();
		final String owlFileName = "testcase/univ-bench.owl";
		String prologFileName = "testcase/univbench.pl";
		File file = new File(owlFileName);
		OWLOntologyManager man = OWLManager.createOWLOntologyManager();
		OWLOntology ontology = man.loadOntologyFromOntologyDocument(file);
		OWLProfileReport report = profile.checkOntology(ontology);
		System.out.println(report);
		
		SROEL2DatalogRewriter rewriter = new SROEL2DatalogRewriter();
		DLProgram datalog = rewriter.rewrite(ontology);

		DLProgramStorer storer = new DLProgramStorerImpl();
		storer.store(datalog, System.out);
		System.out.println();
		
//		DatalogToStringHelper builder = new DatalogToStringHelper();
//		builder.saveToFile(datalog, prologFileName);

	}
	
	@Test
	public void testU00() throws OWLOntologyCreationException {
		DReWELManager.getInstance().setNamingStrategy(NamingStrategy.IRIFragment);
		//DReWELManager.getInstance().setDatalogFormat(DatalogFormat.XSB);
		SROELProfile profile = new SROELProfile();
		final String owlFileName = "testcase/U0_0.owl";
		String prologFileName = "testcase/U00.dl";
		//String prologFileName = "testcase/U00.pl";
		File file = new File(owlFileName);
		OWLOntologyManager man = OWLManager.createOWLOntologyManager();
		OWLOntology ontology = man.loadOntologyFromOntologyDocument(file);
//		System.out.println("axioms: " + ontology.getAxiomCount());
//		System.out.println("individuals: "+ontology.getIndividualsInSignature().size());
//		System.out.println("concepts: "+ontology.getClassesInSignature().size());
//		System.out.println("object roles: "+ontology.getObjectPropertiesInSignature().size());
//		System.out.println("data roles: "+ontology.getDataPropertiesInSignature().size());
//

		OWLProfileReport report = profile.checkOntology(ontology);
		System.out.println(report);
		
		SROEL2DatalogRewriter rewriter = new SROEL2DatalogRewriter();
		DLProgram datalog = rewriter.rewrite(ontology);

		DLProgramStorer storer = new DLProgramStorerImpl();
		storer.store(datalog, System.out);
		System.out.println();
//		DatalogToStringHelper builder = new DatalogToStringHelper();
//		builder.saveToFile(datalog, prologFileName);

	}
	
	@Test
	public void testELGalen() throws OWLOntologyCreationException {
		DReWELManager.getInstance().setNamingStrategy(NamingStrategy.IRIFragment);
		//DReWELManager.getInstance().setDatalogFormat(DatalogFormat.XSB);
		SROELProfile profile = new SROELProfile();
		final String owlFileName = "testcase/EL-GALEN.owl";
		String prologFileName = "testcase/EL-GALEN.dl";
		//String prologFileName = "testcase/U00.pl";
		File file = new File(owlFileName);
		OWLOntologyManager man = OWLManager.createOWLOntologyManager();
		OWLOntology ontology = man.loadOntologyFromOntologyDocument(file);
//		System.out.println("axioms: " + ontology.getAxiomCount());
//		System.out.println("individuals: "+ontology.getIndividualsInSignature().size());
//		System.out.println("concepts: "+ontology.getClassesInSignature().size());
//		System.out.println("object roles: "+ontology.getObjectPropertiesInSignature().size());
//		System.out.println("data roles: "+ontology.getDataPropertiesInSignature().size());
//

		OWLProfileReport report = profile.checkOntology(ontology);
		System.out.println(report);
		
		SROEL2DatalogRewriter rewriter = new SROEL2DatalogRewriter();
		DLProgram datalog = rewriter.rewrite(ontology);

		DLProgramStorer storer = new DLProgramStorerImpl();
		storer.store(datalog, System.out);
		System.out.println();
		
//		DatalogToStringHelper builder = new DatalogToStringHelper();
//		builder.saveToFile(datalog, prologFileName);

	}
}
