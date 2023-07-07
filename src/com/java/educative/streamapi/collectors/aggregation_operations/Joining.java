package com.java.educative.streamapi.collectors.aggregation_operations;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Joining {

    public static void main(String[] args){

        String joinedString= Stream.of("Ye","Kaisa","Tera","Ishq","Hai")
                .collect(Collectors.joining());

        System.out.println(joinedString);

        String joinedStringWithSpace= Stream.of("Hai","Nahi","Mere","Lakiro","Me")
                .collect(Collectors.joining(" "));

        System.out.println(joinedStringWithSpace);

        String joinedStringWithPrefixSuffix= Stream.of("Tu","Hai","Mujhse","Bekhabar")
                .collect(Collectors.joining(" ","prefix "," suffix"));

        System.out.println(joinedStringWithPrefixSuffix);

    }
}
