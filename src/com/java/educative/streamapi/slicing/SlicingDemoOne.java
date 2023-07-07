package com.java.educative.streamapi.slicing;

import java.util.ArrayList;
import java.util.List;

/*
Slicing Operations:

distinct()
It returns a stream consisting of the distinct elements (according to Object.equals(Object)) of this stream.

So, if you have a stream of custom objects then your custom class should override equals() and hashcode() methods.

limit()
This is also an intermediate function.
It returns a stream consisting of the elements of this stream, truncated to be no longer than maxSize in length.

Like distinct() and limit(), skip() is also an intermediate method.
It returns a stream consisting of the remaining elements of this stream after discarding the first
n elements of the stream.
 */
public class SlicingDemoOne {

    public static void main(String[] args){
        List<String> countries = new ArrayList<>();
        countries.add("India");
        countries.add("USA");
        countries.add("China");
        countries.add("India");
        countries.add("UK");
        countries.add("China");
        countries.add("US");
        countries.add("Canada");
        countries.add("Australia");
        countries.add("India");

        System.out.println("<-----------------Using Distinct----------------->");
        countries.stream().
                distinct().
                forEach(System.out::println);

        System.out.println("<-----------------Using Limit----------------->");
        countries.stream()
                .limit(3).
                forEach(System.out::println);

        System.out.println("<-----------------Using Skip----------------->");
        countries.stream()
                .skip(6).
                forEach(System.out::println);
    }
}
