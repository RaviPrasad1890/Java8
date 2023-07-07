package com.java.educative.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
/*
What if we need to sort the person object based on the basis of name?
If the name is the same then we will need to sort on the basis of age.

In this scenario, we will use thenComparing() method.
It is a default method that takes in a function and returns a Comparator.
 */
public class ThenComparing {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Jane", 54));
        personList.add(new Person("Dave", 21));
        personList.add(new Person("Carl", 34));
        personList.add(new Person("Jane", 53));
        Collections.sort(personList, Comparator.comparing(Person::getName).thenComparing(Person::getAge));
        personList.forEach(System.out::println);
    }

}
