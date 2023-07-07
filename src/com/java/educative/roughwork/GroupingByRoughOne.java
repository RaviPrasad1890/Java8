package com.java.educative.roughwork;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class GroupingByRoughOne {

    public static void main(String[] args){
        List<Player> listPlayer=new ArrayList<>();
        listPlayer.add(new Player(1,"Kholi","India",999));
        listPlayer.add(new Player(2,"Smith","Australia",898));
        listPlayer.add(new Player(3,"Williamson","New Zealand",890));
        listPlayer.add(new Player(4,"Root","England",800));
        listPlayer.add(new Player(5,"Rohit","India",990));
        listPlayer.add(new Player(6,"Warner","Australia",800));
        listPlayer.add(new Player(7,"Head","Australia",650));
        listPlayer.add(new Player(8,"Buttler","England",750));

        Map<String,List<Player>> byCountry=listPlayer
                .stream()
                .collect(Collectors.groupingBy(p-> p.getCountry()));
        System.out.println(byCountry);

        Map<String, Set<Player>> byCountrySet=listPlayer
                .stream()
                .collect(Collectors.groupingBy(p-> p.getCountry(),Collectors.toSet()));

        System.out.println(byCountrySet);

    }
}
