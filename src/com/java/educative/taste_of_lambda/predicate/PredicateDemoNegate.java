package com.java.educative.taste_of_lambda.predicate;

import java.util.function.Predicate;

public class PredicateDemoNegate {

    static boolean isNumberLessThanTen(int number, Predicate<Integer> predicate) {
        return predicate.negate().test(number);
    }

    public static void main(String[] args) {
        Predicate<Integer> predicate = (i) -> i > 10;
        boolean result = isNumberLessThanTen(14, predicate);
        System.out.println(result);
    }
}
