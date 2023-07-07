package com.java.educative.streamapi.methodreference;

import java.util.ArrayList;
import java.util.List;

/*
Let’s say you have a Consumer as defined below:

Consumer<String> consumer = s -> System.out.println(s);
This can be written as:
Consumer<String> consumer = System.out::println;
Let’s see one more example. Consider we have a Function<T,R> functional interface as defined below:

Function<Person, Integer>  function = p  -> p.getAge();
This can be written as:
Function<Person, Integer>  function = Person::getAge;

Four kinds of method references
There are four kinds of method references.

1. Static methods
The syntax to use static methods as method reference is ClassName::MethodName.

In the below example,
we have a method getLength() which returns the length of the String.
We have written a lambda expression using a method reference to fetch the length of the string.
 */
public class StaticMethodReference {

    public static int getLength(String str) {
        return str.length();
    }

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Phero");
        list.add("Na");
        list.add("Nazar");
        list.add("Se");
        list.add("Nazariya");

        System.out.println("Code without using method reference");
        list.stream().
                mapToInt(s -> StaticMethodReference.getLength(s)).
                forEach(c -> System.out.println(c));

        System.out.println("Code using method reference");
        list.stream().
                mapToInt(StaticMethodReference::getLength).
                forEach(System.out::println);

    }
}
