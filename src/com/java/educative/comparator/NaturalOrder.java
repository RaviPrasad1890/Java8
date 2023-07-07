package com.java.educative.comparator;

import java.util.*;

public class NaturalOrder {
    public static void main(String[] args){
        List<Integer> list= Arrays.asList(3,5,2,7,1,8,4,6,9);
        Collections.sort(list, Comparator.naturalOrder());
        list.forEach(System.out::println);
    }
}
