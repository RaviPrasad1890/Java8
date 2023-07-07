package com.java.educative.streamapi.matching;

import java.util.ArrayList;
import java.util.List;

/*
Matching operations are terminal operations that are used to check if elements with certain criteria are present in the stream or not.

There are mainly three matching functions available in Stream. These are:

anyMatch()
allMatch()
noneMatch()

anyMatch()
Here is the syntax of this method:
boolean anyMatch(Predicate<? super T> predicate)

It takes a predicate as input and returns

returns true if at least one element matches the criteria.

returns false if no element matches the criteria.

returns false if the stream is empty.
 */
public class MatchingDemoOne {
    public static void main(String[] args){
        List<Person> persons= new ArrayList<>();
        persons.add(new Person("Virat Kohli",30,"India"));
        persons.add(new Person("AB De Villiars",30,"South Africa"));
        persons.add(new Person("Steve Smith",30,"Australia"));
        persons.add(new Person("Kane Williamson",30,"Newzeland"));
        persons.add(new Person("Ben Stokes",30,"England"));

        boolean anyAustralian=persons.stream().anyMatch(p->p.getCountry()=="Australia");
        System.out.println("Any Person from Australia: "+anyAustralian);
    }
}
