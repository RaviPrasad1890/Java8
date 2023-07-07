package com.java.educative.taste_of_lambda.predicate;

import java.util.function.Predicate;

public class PredicateDemoEqual {

    public static void main(String[] args) {
        Predicate<String> predicate = Predicate.isEqual("Hello");
        // The same thing can be achieved by below lambda.
        // Predicate<String> predicate  = p -> p.equals("Hello");
        System.out.println(predicate.test("Welcome"));
    }
}
