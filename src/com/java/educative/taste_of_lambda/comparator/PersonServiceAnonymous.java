package com.java.educative.taste_of_lambda.comparator;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PersonServiceAnonymous {

    public static List<Person> getPersons(List<Person> persons){

        Collections.sort(persons, new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                return p1.getName().compareTo(p2.getName());
            }
        });
        return persons;
    }
}
