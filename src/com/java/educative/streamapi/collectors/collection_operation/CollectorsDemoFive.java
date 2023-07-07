package com.java.educative.streamapi.collectors.collection_operation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/*
collectingAndThen(Collector<T,A,R> downstream, Function<R,RR> finisher)
This method returns a Collector that accumulates the input elements into the given Collector
and then performs an additional finishing function.
 */
public class CollectorsDemoFive {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("done");
        list.add("far");
        list.add("away");
        list.add("done");

        List<String> unmodifiableListOne = list
                .stream()
                .collect(Collectors.collectingAndThen(Collectors.toList(), Collections::unmodifiableList));

        List<String> unmodifiableListTwo = list
                .stream()
                .collect(Collectors.collectingAndThen(Collectors.toList(), (l) -> Collections.unmodifiableList(l)));

        unmodifiableListOne
                .stream()
                .forEach(System.out::println);
        System.out.println("--------------------------");
        unmodifiableListTwo
                .stream()
                .forEach(System.out::println);

    }
}
