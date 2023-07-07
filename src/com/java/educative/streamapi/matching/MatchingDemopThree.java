package com.java.educative.streamapi.matching;

import java.util.ArrayList;
import java.util.List;

/*
noneMatch()
Here is the syntax of this method:

boolean noneMatch(Predicate<? super T> predicate)

It takes a predicate as input and returns

true if no elements of the stream match the provided predicate.

true if the stream is empty.

false if even a single element matches the criteria.
 */
public class MatchingDemopThree {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Virat Kohli", 30, "India"));
        persons.add(new Person("Rohit Sharma", 30, "India"));
        persons.add(new Person("Subhman Gill", 30, "India"));
        persons.add(new Person("KL Rahul", 30, "India"));
        persons.add(new Person("Rituraj Gaikwad", 30, "India"));

        boolean allIndians = persons.stream().noneMatch(p->!p.getCountry().equals("India"));
        System.out.println("All Indians: "+allIndians);
    }
}
