package com.java.educative.taste_of_lambda.predicate;

import com.java.educative.taste_of_lambda.comparator.Person;

import java.util.function.Predicate;

public class PredicateDemoSimple {

    static boolean isPersonEligibleForVoting(Person person, Predicate<Person> predicate) {
        return predicate.test(person);
    }

    public static void main(String[] args) {
        Person person = new Person("Ravi", 32, "India",9);
        Predicate<Person> predicate = (p) -> p.getAge() > 18;

        boolean isEligible = isPersonEligibleForVoting(person, predicate);
        System.out.println(isEligible);


    }
}
