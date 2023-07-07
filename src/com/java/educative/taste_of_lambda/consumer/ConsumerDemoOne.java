package com.java.educative.taste_of_lambda.consumer;

import java.util.function.Consumer;

/*
Consumers are functional interfaces that take in a parameter and do not produce anything.
 */
public class ConsumerDemoOne {

    public static void main(String[] args){

        Consumer<String> consumerString=s-> System.out.println(s);

        Consumer<Integer> consumerInteger=i-> System.out.println(i);

        consumerString.accept("Hello !");
        consumerInteger.accept(100);
    }
}
