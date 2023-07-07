package com.java.educative.taste_of_lambda.predicate;

import com.java.educative.taste_of_lambda.comparator.Person;

import java.util.function.Predicate;

public class PredicateDemoAnd {

    static boolean isEligibleForMembership(Person person, Predicate<Person> predicate) {
        return predicate.test(person);
    }

    public static void main(String[] args) {
        Person person = new Person("Ravi", 32, "India", 9);
        Predicate<Person> greaterThanEighteen = (p) -> p.getAge() > 18;
        Predicate<Person> lessThanSixty = (p) -> p.getAge() < 60;
        Predicate<Person> predicate = greaterThanEighteen.and(lessThanSixty);
        boolean result = isEligibleForMembership(person, predicate);
        System.out.println(result);


    }
}
