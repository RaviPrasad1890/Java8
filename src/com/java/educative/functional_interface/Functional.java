package com.java.educative.functional_interface;
/*
An interface that has a single abstract method is called a functional interface.

While an interface can have one or more default methods,
it should have only one abstract method to be called a functional interface.

Java 8 has defined the java.util.function package, containing lots of functional interfaces.
Some of the functional interfaces defined in Java 8 are Predicate, Consumer, Supplier, Function, etc.
 */
@FunctionalInterface
public interface Functional {
    void doSomething();

    default void foo() {
        System.out.println("foo");
    }
}
