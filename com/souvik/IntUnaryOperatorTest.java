package com.souvik;

import java.util.List;
import java.util.function.IntUnaryOperator;

public class IntUnaryOperatorTest {
	
	IntUnaryOperator combine(List<IntUnaryOperator> operators) {
		return operators.stream().reduce(IntUnaryOperator.identity(),IntUnaryOperator:: andThen );
	}
	
	sonnet.stream().collect(Collectors.toMap(line -> line.substring(0,1),line -> line,(line1,line2) -> line1 + "\n" + line2));

}
