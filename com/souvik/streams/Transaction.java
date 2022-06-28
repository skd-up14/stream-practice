/**
 * 
 */
package com.souvik.streams;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * @author Souvik_Das
 *
 */
public class Transaction {

	private Integer transactionId;

	private BigDecimal price;

	private String currency;

	private String city;

	public Transaction(Integer transactionId, BigDecimal price, String currency, String city) {
		super();
		this.transactionId = transactionId;
		this.price = price;
		this.currency = currency;
		this.city = city;
	}

	public Integer getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(Integer transactionId) {
		this.transactionId = transactionId;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Transaction [transactionId=" + transactionId + ", price=" + price + ", currency=" + currency + "]";
	}

}
