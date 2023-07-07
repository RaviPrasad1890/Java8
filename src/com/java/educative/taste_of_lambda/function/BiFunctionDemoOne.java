package com.java.educative.taste_of_lambda.function;

import java.util.function.BiFunction;

/*
The BiFunction<T, U, R> is similar to Function<T, R> interface;
the only difference is that the BiFunction interface takes in two parameters and returns an output.
*/
public class BiFunctionDemoOne {
    public static void main(String[] args){
        BiFunction<String,String,Integer> biFunction=(s1,s2)->s1.length()+s2.length();
        int result=biFunction.apply("Hello","Ravi");
        System.out.println(result);
    }
}
