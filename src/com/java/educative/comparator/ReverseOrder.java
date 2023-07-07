package com.java.educative.comparator;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ReverseOrder {
    public static void main(String[] args){
        List<Integer> list= Arrays.asList(3,5,2,7,1,8,4,6,9);
        Collections.sort(list, Comparator.reverseOrder());
        list.forEach(System.out::println);
    }
}
