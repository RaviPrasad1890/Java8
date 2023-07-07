package com.java.educative.taste_of_lambda.function;

import java.util.function.Function;

/*
andThen(Function<? super R,? extends V> after)#
        This method returns a composed function that first applies the function on which it is called on the input,
        and then applies the function provided as parameter, to the result.

 */
public class FunctionDemoThree {
    public static void main(String[] args) {
        Function<Integer, Integer> increment = x -> x + 10;
        Function<Integer, Integer> multiply = y -> y * 2;
        // Since we are using andThen(), increment will be done first and then multiplication will be done.
        System.out.println("andThen result: " + increment.andThen(multiply).apply(3));
        System.out.println("andThen result: " + multiply.andThen(increment).apply(3));
    }
}
