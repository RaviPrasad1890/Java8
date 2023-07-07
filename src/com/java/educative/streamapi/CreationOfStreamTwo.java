package com.java.educative.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/*
The Stream API defines a few interfaces such as Stream, IntStream, LongStream, etc.

The Stream<T> interface is for object elements. For primitives, it defines IntStream,
LongStream and DoubleStream interfaces.

It is a good practice to use primitive streams if you are dealing with primitives
because wrapping primitives to objects and auto-boxing is a costly process.
 */

public class CreationOfStreamTwo {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        Stream<Integer> stream = intList.stream();
        stream.forEach(p -> System.out.println(p * 2));

        System.out.println("----------------------------------------------------------");
        IntStream intStreamOne=IntStream.of(1,2,3,4,5);
        intStreamOne.forEach(p -> System.out.println(p * 2));
    }
}
