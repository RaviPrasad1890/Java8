package com.java.educative.taste_of_lambda.predicate;

import com.java.educative.taste_of_lambda.comparator.Person;

import java.util.function.Predicate;

public class PredicateDemoOr {

    static boolean isEligibleForRetirement(Person person, Predicate<Person> predicate) {
        return predicate.test(person);
    }

    public static void main(String[] args) {
        Person person = new Person("Ravi", 32, "India", 9);
        Predicate<Person> serviceYearGreaterThanThirty = (p) -> p.getYearOfService() > 30;
        Predicate<Person> greaterThanSixty = (p) -> p.getAge() > 60;
        Predicate<Person> predicate = serviceYearGreaterThanThirty.and(greaterThanSixty);
        boolean result = isEligibleForRetirement(person, predicate);
        System.out.println(result);
    }
}
