/**
 * 
 */
package com.souvik.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * StreamAPIByFunction
 * 
 * @author Souvik_Das
 *
 */
public class StreamAPIByFunction {

	/**
	 * @param args
	 */
	static List<String> list1 = Arrays.asList("a", "b", "c", "d");

	static List<Integer> list2 = Arrays.asList(1, 2, 3, 4);

	static List<Integer> list3 = Arrays.asList(10, 20, 30, 40);

	static List<Integer> list4 = Arrays.asList(5, 5, 5, 5);

	public static void main(String[] args) {

		StreamAPIByFunction sf = new StreamAPIByFunction();

		System.out.println(sf.combine("+", list1, list2));

		System.out.println(sf.combine("-", list3, list4));

		System.out.println(sf.combine("+", list2, list1));
	}

	private List<Object> combine(String operator, List<? extends Object> l1, List<? extends Object> l2) {

		TriFunction<Object, Object, Object, Object> triFunctionConcat = (a, b, c) -> {
			if (a.getClass().equals(String.class) && b.getClass().equals(Integer.class) && c.equals("+")) {
				return ((String) a).concat(b.toString());
			} else if (a.getClass().equals(Integer.class) && b.getClass().equals(Integer.class) && c.equals("-")) {
				return (Integer) a - (Integer) b;
			} else if (a.getClass().equals(Integer.class) && b.getClass().equals(String.class) && c.equals("+")) {
				return a.toString() + "+" + (String) b;
			}
			return null;
		};

		List<Object> resultList = IntStream.range(0, l1.size())
				.mapToObj(i -> triFunctionConcat.apply(l1.get(i), l2.get(i), operator)).collect(Collectors.toList());

		return resultList;

	}

}
