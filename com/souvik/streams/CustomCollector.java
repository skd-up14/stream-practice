/**
 * 
 */
package com.souvik.streams;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Collections;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;

/**
 * @author Souvik_Das
 *
 */
public class CustomCollector implements Collector<Transaction, TransactionAverage, TransactionAverage> {

	@Override
	public Supplier<TransactionAverage> supplier() {
		return () -> new TransactionAverage();
	}

	@Override
	public BiConsumer<TransactionAverage, Transaction> accumulator() {
		return (ta, t) -> {

			if(t.getPrice().intValue() > (new BigDecimal("100000").intValue())) {
				ta.getTransactionList().add(t);
				ta.setTotal(t.getPrice().add(ta.getTotal()));
				ta.setAverage(ta.getTotal().divide(new BigDecimal(ta.getTransactionList().size()),2, RoundingMode.HALF_UP));
			}

		};
	}

	@Override
	public BinaryOperator<TransactionAverage> combiner() {
		return null;
	}

	@Override
	public Function<TransactionAverage, TransactionAverage> finisher() {
		return Function.identity();
	}

	@Override
	public Set<Characteristics> characteristics() {
		return Collections.emptySet();
	}

}
