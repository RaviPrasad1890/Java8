package com.java.educative.taste_of_lambda.function.unaryoperator;

import java.util.function.UnaryOperator;

/*
UnaryOperator<T>#
The UnaryOperator<T> interface represents a function that takes one argument of type T and returns a value of the same type.
This is similar to the Function interface, which is a parent to the UnaryOperator interface.
 */
public class UnaryOperatorDemoOne {
    public static void main(String[] args){
        UnaryOperator<String> unaryOperator=s->"Hello "+s;
        System.out.println(unaryOperator.apply("Ravi"));
    }
}
