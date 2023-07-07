package com.java.educative.taste_of_lambda.supplier;

import com.java.educative.taste_of_lambda.comparator.Person;

import java.util.function.Predicate;
import java.util.function.Supplier;

/*
Supplier is an interface that does not take in any argument but produces a value when the get() function is invoked.
Suppliers are useful when we don’t need to supply any value and obtain a result at the same time.
 */
public class SupplierTestOne {

    static boolean isPersonEligibleForVoting(Predicate<Person> predicate, Supplier<Person> supplier) {
        return predicate.test(supplier.get());
    }

    public static void main(String[] args) {
        Supplier<Person> supplier = () -> new Person("Ravi", 32, "India", 9);
        Predicate<Person> predicate = (p) -> p.getAge() > 18;

        boolean result = isPersonEligibleForVoting(predicate, supplier);
        System.out.println(result);
    }
}
