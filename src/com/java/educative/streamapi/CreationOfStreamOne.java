package com.java.educative.streamapi;

import java.util.stream.Stream;
/*
A few important points about streams are:

A stream is not a data structure itself.
It is a bunch of operations applied to a source.
The source can be collections, arrays or I/O channels.

Streams don’t change the original data structure.

There can be zero or more intermediate operations that transform a stream into another stream.

Each intermediate operation is lazily executed (This will be discussed later).

Terminal operations produce the result of the stream.
 */
public class CreationOfStreamOne {

    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        //void forEach(Consumer<? super T> action);
        stream.forEach(p -> System.out.println(p));
    }
}
