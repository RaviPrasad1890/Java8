package com.java.educative.taste_of_lambda.consumer;

import java.util.function.Consumer;
/*
The andThen() method, which is a default method in the Consumer
interface is used for chaining. Here is the syntax of this method.

Consumer<T> andThen(Consumer<? super T> after)
 */
public class ConsumerAndThen {

    public static void main(String[] args){
        Consumer<String> consumer1 = (arg) -> System.out.println(arg + "My name is Jane.");

        Consumer<String> consumer2 = (arg) -> System.out.println(arg + "I am from Canada.");

        consumer1.andThen(consumer2).accept("Hello. ");

    }
}
