package com.java.educative.taste_of_lambda.function.unaryoperator;

import java.util.function.IntUnaryOperator;

/*
This is the primitive flavor of the UnaryOperator. It takes an int as an argument and returns int as a result.
We should always prefer using the primitive flavors of functional interfaces as boxing and unboxing are not good
for performance.
 */
public class IntUnaryOperatorDemo {
    public static void main(String[] args){
        IntUnaryOperator unaryOperator=num->num*num;
        System.out.println(unaryOperator.applyAsInt(2));
    }
}
