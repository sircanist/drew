package org.semanticweb.drew.default_logic;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.semanticweb.drew.dlprogram.model.CacheManager;
import org.semanticweb.drew.dlprogram.model.Literal;
import org.semanticweb.drew.dlprogram.model.NormalPredicate;
import org.semanticweb.drew.dlprogram.model.Variable;

import com.google.common.base.Function;
import com.google.common.base.Joiner;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;

public class DefaultRuleTest {

	@Test
	public void test() {
		NormalPredicate bird = CacheManager.getInstance().getPredicate("Bird", 1);
		NormalPredicate flier = CacheManager.getInstance().getPredicate("Flier", 1);
		DefaultRule rule = new DefaultRule();
		Variable X = CacheManager.getInstance().getVariable("X");
		Literal bird_X = new Literal(bird, X);
		Literal flier_X = new Literal(flier, X);
		List<Literal> pre = new ArrayList<Literal>();
		pre.add(bird_X);
		List<Literal> just = new ArrayList<Literal>();
		just.add(flier_X);
		List<List<Literal>> justs = new ArrayList<List<Literal>>();
		justs.add(just);
		List<Literal> conc = just;
		rule.setPrerequisite(pre);
		rule.setJustifications(justs);
		rule.setConclusion(conc);
		System.out.println(rule);

	}

	@Test
	public void testNestingJoiner() {

		StringBuilder sb = new StringBuilder();

		List<ArrayList<Integer>> matrix = Lists.newArrayList( //
				Lists.newArrayList(1, 2, 3), //
				Lists.newArrayList(4, 5, 6), //
				Lists.newArrayList(7, 8, 9));

		// Joiner.on('\n').appendTo(sb, parts)

		String string = Joiner.on('\n').appendTo(sb, Iterables.transform(matrix, joinFunction(Joiner.on(", "), sb))).toString();

		// String string = Joiner.on('\n').join(Iterables.transform(matrix,
		// joinFunction(Joiner.on(", "))));

		System.out.println(string);
	}

	public static Function<Iterable<?>, StringBuilder> joinFunction(final Joiner joiner, final StringBuilder sb) {
		return new Function<Iterable<?>, StringBuilder>() {

			@Override
			public StringBuilder apply(Iterable<?> input) {
				return joiner.appendTo(sb, input);
				// return joiner.join(input);
			}
		};
	}

	public static Function<Iterable<?>, String> joinFunction(final Joiner joiner) {
		return new Function<Iterable<?>, String>() {

			@Override
			public String apply(Iterable<?> input) {

				return joiner.join(input);
			}
		};
	}

}
