package com.java.educative.comparator;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class NullsFirstAndNullsLast {
    public static void main(String[] args){
        List<Integer> list= Arrays.asList(3,5,2,7,1,8,null,6,9,4);
        Collections.sort(list, Comparator.nullsFirst(Comparator.naturalOrder()));
        list.forEach(System.out::println);
        Collections.sort(list, Comparator.nullsLast(Comparator.naturalOrder()));
        list.forEach(System.out::println);
    }
}
