package com.souvik.streams;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Sorting of Map
 * @author Souvik_Das
 *
 */
public class StreamAPI {

	public static void main(String[] args) {

		Map<Integer, Employee> empMap = new LinkedHashMap<>();
		empMap.put(924, new Employee(924, "Philip", "Admin"));
		empMap.put(593, new Employee(593, "Robert", "Sales"));
		empMap.put(305, new Employee(305, "George", "HR"));
		empMap.put(618, new Employee(618, "Alice", "PR"));
		empMap.put(123, new Employee(123, "John", "IT"));

		System.out.println("Order of map before sorting::");

		empMap.entrySet().forEach(System.out::println);

		System.out.println("Order of map after sorting::");

		empMap = empMap.entrySet().stream().sorted(Map.Entry.comparingByKey()).collect(Collectors.toMap(Map.Entry::getKey,
				Map.Entry::getValue, (oldkey, newkey) -> newkey, LinkedHashMap::new));
		
		empMap.entrySet().forEach(System.out::println);
	}

}
