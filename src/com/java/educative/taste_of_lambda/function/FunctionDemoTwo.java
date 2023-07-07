package com.java.educative.taste_of_lambda.function;

import java.util.function.Function;

/*
compose(Function<? super V, ? extends T> before)#
Returns a composed function that first applies the function provided as a parameter on the input,
and then applies the function on which it is called, to the result.
 */
public class FunctionDemoTwo {
    public static void main(String[] args){
        // Function which adds 10 to the given element.
        Function<Integer, Integer> increment = x -> x + 10;
        // Function which doubles the given element.
        Function<Integer, Integer> multiply = y -> y * 2;
        // Since we are using compose(), multiplication will be done first and then increment will be done.
        System.out.println("compose result: " + increment.compose(multiply).apply(3));
    }
}
