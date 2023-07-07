package com.java.educative.taste_of_lambda.predicate;

import com.java.educative.taste_of_lambda.comparator.Person;

import java.util.function.BiPredicate;


/*
The Predicate<T> takes only one parameter and returns the result.
Now suppose we have a requirement where we need to send two parameters (i.e person object and min age to vote)
and then return the result. Here, we can use BiPredicate<T, T>.

The BiPredicate<T, T> has a functional method test(Object, Object) .
It takes in two parameters and returns a boolean value.
Below is the list of methods in the BiPredicate<T, T> interface.
 */
public class BiPredicateDemoSimple {

    static boolean isPersonEligibleForVoting(Person person, int minAge, BiPredicate<Person,Integer> biPredicate){
       return biPredicate.test(person,minAge);
    }

    public static void main(String[] args){
        Person person = new Person("Ravi",32,"India",9);
        BiPredicate<Person,Integer> biPredicate=(p,m)->p.getAge()>m;
        boolean result=isPersonEligibleForVoting(person,18,biPredicate);
        System.out.println(result);
    }
}
