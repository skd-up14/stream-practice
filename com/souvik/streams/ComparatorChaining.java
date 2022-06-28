/**
 * 
 */
package com.souvik.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author Souvik_Das
 *
 */
public class ComparatorChaining {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		List<Student> studentList = new ArrayList<>();
		studentList.add(new Student(3456L, "Andy", "Pennsylvania","A"));
		studentList.add(new Student(5623L, "Adrian", "Boston","B"));
		studentList.add(new Student(2053L, "Timothy", "Pennsylvania","C"));
		studentList.add(new Student(7546L, "Bob", "Michigan","D"));
		studentList.add(new Student(4523L, "Francis", "Pennsylvania","E"));
		studentList.add(new Student(5623L, "Jack", "Boston","F"));
		studentList.add(new Student(2053L, "Rupert", "Michigan","G"));
		studentList.add(new Student(1836L, "Bob", "Boston","H"));
		
		Comparator<Student> addressComparator = Comparator.comparing(Student::getStudentAddress);
		Comparator<Student> gradeComparator = Comparator.comparing(Student::getStudentGrade);
		List<Student> sortedList = studentList.stream().sorted(addressComparator.thenComparing(gradeComparator)).collect(Collectors.toList());
		
		sortedList.forEach(System.out::println);
		
		//Group By
		
		Map<String,Map<String,Long>> map = sortedList.stream().collect(Collectors.groupingBy(Student::getStudentAddress, Collectors.groupingBy(Student::getStudentGrade,Collectors.counting())));
		
		map.entrySet().forEach(System.out::println);
		
	}

}
