package com.java.educative.streamapi.matching;

import java.util.ArrayList;
import java.util.List;
/*
allMatch()
Here is the syntax of this method:

boolean allMatch(Predicate<? super T> predicate)

It takes a predicate as input and returns

true if all elements match the criteria.

true if the stream is empty.

false if even a single element does not match the criteria.
 */
public class MatchingDemopTwo {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Virat Kohli", 30, "India"));
        persons.add(new Person("Rohit Sharma", 30, "India"));
        persons.add(new Person("Subhman Gill", 30, "India"));
        persons.add(new Person("KL Rahul", 30, "India"));
        persons.add(new Person("Rituraj Gaikwad", 30, "India"));

        boolean allIndians = persons.stream().allMatch(p->p.getCountry().equals("India"));
        System.out.println("All Indian: "+allIndians);
    }
}
