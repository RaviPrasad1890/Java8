package com.java.educative.taste_of_lambda.comparator;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PersonServiceLambda {
    public static List<Person> getPersons(List<Person> persons) {

/*        Comparator<Person> myCompartor = (p1, p2) -> p1.getName().compareTo(p2.getName());
        Collections.sort(persons, myCompartor);*/
        Collections.sort(persons, (p1, p2) -> p1.getName().compareTo(p2.getName()));
        return persons;
    }
}
