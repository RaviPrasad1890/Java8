package com.java.educative.streamapi.mapping;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/*
Mapping operations are those operations that transform the elements of a stream and
return a new stream with transformed elements.

We can use a variety of methods to transform a stream into another stream object.
The two most common methods used are map() and flatMap().

The map() method takes a lambda expression as its only argument and uses
it to change every individual element in the stream.
Its return value is a new stream object containing the changed elements.

In the below example, we have a list of names. We need to print all the names on the list in the upper case.
 */
public class StreamMappingDemoOne {
    public static void main(String[] args){
        List<String> names=new ArrayList<>();
        names.add("Ravi");
        names.add("Dukh");
        names.add("Dard");
        names.add("Lazy");
        names.add("Koibhi");
        names.stream().
                map(s->s.toUpperCase()).// map() takes an input of Function<T, R> type.
                forEach(System.out::println);// forEach() takes an input of Consumer type.
    }
}
