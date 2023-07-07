package com.java.educative.taste_of_lambda.function;

import java.util.function.Function;

/*
Function is a category of functional interfaces that takes an object of type T and returns an object of type R.

Until now, the functional interfaces that we’ve discussed have either not taken any argument(Supplier),
not returned any value(Consumer), or returned only a boolean(Predicate).

Function interfaces are very useful as we can specify the type of input and output.

R apply(T t)
This is the abstract method of the Function interface.
It takes one argument of type T as input and returns a value of type R.


 */
public class FunctionDemoOne {

    public static void main(String[] args){
        Function<String,Integer> function=s->s.length();
        String str="Hello Ravi";
        System.out.println("Length of given string is "+function.apply(str));
    }
}
