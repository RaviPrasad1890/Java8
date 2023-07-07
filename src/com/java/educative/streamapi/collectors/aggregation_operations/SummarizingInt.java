package com.java.educative.streamapi.collectors.aggregation_operations;

import java.util.IntSummaryStatistics;
import java.util.stream.Collectors;
import java.util.stream.Stream;
/*
summarizingInt(ToIntFunction<? super T> mapper)#
It returns a Collector that applies an int-producing mapping
function to each input element and returns summary statistics for the resulting values.
 */
public class SummarizingInt {

    public static void main(String[] args){
        IntSummaryStatistics summarizingInt = Stream.of("1", "2", "3")
                .collect(Collectors.summarizingInt(Integer::parseInt));
        System.out.println(summarizingInt);
    }
}
