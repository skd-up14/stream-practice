package com.souvik;

import static org.junit.Assert.assertThat;

import java.util.function.Predicate;

import org.junit.Test;

public class predicate_1 {

	@Test
	public void test() {
		Predicate<String> predicate = s -> s.isEmpty();
		
		Predicate<String> notPredicate;
		
		assertThat(notPredicate.test("")).isFalse();
		assertThat(notPredicate.test("Not Empty!")).isTrue();
	}

}
