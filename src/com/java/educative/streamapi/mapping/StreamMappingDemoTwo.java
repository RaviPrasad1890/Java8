package com.java.educative.streamapi.mapping;

import java.util.ArrayList;
import java.util.List;

/*
Given a list of words, we need to print the length of each word.

To solve this problem, we can use a map(), which takes
s -> s.length() lambda expression as input. However, have you noticed anything here?

The input is a string and output is an integer.
If we use map(s -> s.length()) , then it will return a stream of integers.

However, in the first lesson, we discussed that if we are dealing with
primitives then we should use primitive flavors of stream.

The mapToInt() method comes into the picture here.
If we use the mapToInt() method instead of map(), it will return IntStream instead of Stream.

So, if we are sure that our function is going to return a primitive,
instead of using map() use mapToInt(), mapToLong() or mapToDouble().
 */
public class StreamMappingDemoTwo {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Ravi");
        names.add("Dukhi");
        names.add("Dard-E-Dil");
        names.add("Laziness");
        names.add("Koibhi");
        names.stream().mapToInt(s->s.length()).forEach(System.out::println);
    }
}
