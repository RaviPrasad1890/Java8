package com.java.educative.streamapi.filter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/*
The filtering operations filters the given stream and returns a new stream,
which contains only those elements that are required for the next operation.

filter() method
The Stream interface has a filter() method to filter a stream. This is an intermediate operation. Below is the method definition of filter() method.

Stream filter(Predicate<? super T> predicate)

Parameter -> A predicate to apply to each element to determine if it should be included.

Return Type -> It returns a stream consisting of the elements of this stream that match the given predicate.
 */
public class StreamFilterDemoOne {
    public static void main(String[] args){
        List<Integer> list= Arrays.asList(12,3,5,13,18,20,7,9);
        Stream<Integer> originalStream=list.stream();
        Stream<Integer> modifiedStream=originalStream.filter(p->p>10);
        //If we Dont comment below section of code we will get :
        //Exception in thread "main" java.lang.IllegalStateException: stream has already been operated upon or closed
/*        System.out.println("Original Stream");
        originalStream.forEach(c-> System.out.print(c+" "));*/

        System.out.println("Modified Stream");
        modifiedStream.forEach(c-> System.out.print(c+" "));
        System.out.println();
        System.out.println("--------------------------------------------");
        System.out.println("More Compact Code");
        list.stream().filter(p->p>10).forEach(c-> System.out.print(c+" "));
        System.out.println();
        System.out.println("--------------------------------------------");
        System.out.println("Or Even More Compact");
        list.stream().filter(p->p>10).forEach(System.out::println);
        System.out.println("Original list is not modified");
        list.stream()
                .forEach(System.out::println);
    }
}
