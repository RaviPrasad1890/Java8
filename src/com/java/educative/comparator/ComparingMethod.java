package com.java.educative.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparingMethod {

    public static void main(String[] args){
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Jane", 54));
        personList.add(new Person("Dave", 21));
        personList.add(new Person("Carl", 34));
        Collections.sort(personList, Comparator.comparing(p->p.getAge()));
        personList.forEach(System.out::println);

    }
}
