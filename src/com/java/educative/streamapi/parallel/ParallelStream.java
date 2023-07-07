package com.java.educative.streamapi.parallel;

import java.util.stream.Stream;
/*
A parallel stream has a lot of overhead compared to a sequential one.
Coordinating the threads takes a significant amount of time.
We should always use serial stream and consider using a parallel Stream in the following cases:

>>We have a large amount of data to process.
>>We already have a performance problem in the first place.
>>All the shared resources between threads need to be synchronized properly otherwise it might produce unexpected results.
 */
public class ParallelStream {
    public static void main(String[] args) {
        System.out.println("------------------------------- Serial Stream  ---------------------------------");
        Stream.of(1, 2, 3, 4, 5, 6, 7)
                .forEach(num -> System.out.println(num + " " + Thread.currentThread().getName()));


        System.out.println("-------------------------------- Parallel Stream -----------------------------");
        Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14)
                .parallel()
                .forEach(num -> System.out.println(num + " " + Thread.currentThread().getName()));

    }
}
