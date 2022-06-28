package com.souvik;

import static org.junit.Assert.assertThat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

import org.junit.Test;

class consumer_2 {

	@Test
	public void consumer_2() {
		Consumer<List<String>> c1 = list -> list.add("first");
		Consumer<List<String>> c2 = list -> list.add("second");
		
		Consumer<List<String>> consumer = c1.andThen(c2);
		
		List<String> list = new ArrayList<>(Arrays.asList("a","b","c"));
		
		consumer.accept(list);
		///assertThat(list).containsExactly("a","b","c","first","second");
	}

}
