package com.java.educative.streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
["HELLO","WORLD"]->["H","E","L","O","W","R","D"]
 */
public class MiscOne {
    public static void main(String[] args){
        List<String> input= new ArrayList<>();
        input.add("HELLO");
        input.add("WORLD");

        List<String> output=input
                .stream()
                .map(w->w.split(""))
                .flatMap(Arrays::stream)
                .distinct()
                .collect(Collectors.toList());
        System.out.println(output);
    }
}
