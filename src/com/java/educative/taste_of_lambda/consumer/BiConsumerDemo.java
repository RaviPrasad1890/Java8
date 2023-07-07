package com.java.educative.taste_of_lambda.consumer;

import java.util.function.BiConsumer;

/*
BiConsumer<T,U>
This interface takes two parameters and returns nothing.

T - the type of the first argument to the operation
U - the type of the second argument to the operation.
This interface has the same methods as present in the Consumer<T> interface.
 */
public class BiConsumerDemo {

    public static void main(String[] args){
        BiConsumer<String,Integer> biConsumer=(s,i)-> System.out.println("Hello "+s+", You scored "+i);
        biConsumer.accept("Ravi",100);
    }
}
