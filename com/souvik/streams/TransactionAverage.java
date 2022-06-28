/**
 * 
 */
package com.souvik.streams;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Souvik_Das
 *
 */
public class TransactionAverage {
	private BigDecimal average = BigDecimal.ZERO;
	private BigDecimal total = BigDecimal.ZERO;
	private List<Transaction> transactionList = new ArrayList<>();

	public BigDecimal getAverage() {
		return average;
	}

	public void setAverage(BigDecimal average) {
		this.average = average;
	}

	public BigDecimal getTotal() {
		return total;
	}

	public void setTotal(BigDecimal total) {
		this.total = total;
	}

	public List<Transaction> getTransactionList() {
		return transactionList;
	}

	public void setTransactionList(List<Transaction> transactionList) {
		this.transactionList = transactionList;
	}

}
