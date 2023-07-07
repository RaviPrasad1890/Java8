package com.java.educative.collection_improvements;

import java.util.HashMap;
import java.util.Map;

public class IteratingOverMap {
    public static void main(String[] args) {
        Map<String, Integer> fruits = new HashMap<>();
        fruits.put("Apple", 10);
        fruits.put("Orange", 20);
        fruits.put("Grape",30);

        fruits.forEach((key,value)->{
            System.out.println(key+" --- "+value);
        });
    }
}
