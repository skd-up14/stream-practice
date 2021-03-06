/**
 * 
 */
package com.souvik.streams;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.OptionalInt;
import java.util.stream.Collectors;

/**
 * @author Souvik_Das
 *
 */
public class StreamTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		List<Transaction> transactionList = new ArrayList<>();
		Transaction t1 = new Transaction(1, new BigDecimal("100000"),"INR", "Mumbai");
		Transaction t2 = new Transaction(23, new BigDecimal("1000"),"EUR","Frankfurt");
		Transaction t3 = new Transaction(108, new BigDecimal("500000"),"USD","New York");
		Transaction t4 = new Transaction(11, new BigDecimal("300"),"JPY","Osaka");
		Transaction t5 = new Transaction(99, new BigDecimal("900000"),"AUD","Sydney");
		Transaction t6 = new Transaction(678, new BigDecimal("2300"),"CAD","Toronto");
		Transaction t7 = new Transaction(56, new BigDecimal("67000"),"USD","New York");
		Transaction t8 = new Transaction(444, new BigDecimal("99"),"INR", "Mumbai");
		Transaction t9 = new Transaction(345, new BigDecimal("600"),"USD","San Francisco");
		Transaction t10 = new Transaction(567, new BigDecimal("2000"),"USD","San Francisco");

		transactionList.add(t1);
		transactionList.add(t2);
		transactionList.add(t3);
		transactionList.add(t4);
		transactionList.add(t5);
		transactionList.add(t6);
		transactionList.add(t7);
		transactionList.add(t8);
		transactionList.add(t9);
		transactionList.add(t10);

		List<Integer> transactionIdList = transactionList.stream().filter(t -> t.getPrice().intValue() > 100000)
				.map(t -> t.getTransactionId()).collect(Collectors.toList());
		System.out.println(transactionIdList);

		Integer sumOfTransactions = transactionList.stream().mapToInt(t -> t.getPrice().intValue()).sum();

		System.out.println(sumOfTransactions);

		Long transactionCount = transactionList.stream().count();

		System.out.println(transactionCount);
		
		OptionalInt highestValTran = transactionList.stream().mapToInt(t -> t.getPrice().intValue()).max();
		
		System.out.println(highestValTran.orElseThrow());
		
		//Group transactions by currency
		
		Map<String,List<Transaction>> groupByCurrency = transactionList.stream().collect(Collectors.groupingBy(Transaction::getCurrency));
		
		System.out.println(groupByCurrency);
		
		Map<String, Map<String, Double>> avgByCurrencyGroup = transactionList.stream().collect(Collectors.groupingBy(Transaction::getCurrency, Collectors.groupingBy(Transaction::getCity,Collectors.averagingInt(t -> t.getPrice().intValue()))));
		
		System.out.println(avgByCurrencyGroup);
		
		TransactionAverage average = transactionList.stream().collect(new CustomCollector());
		
		System.out.println(average.getAverage());

	}

}
