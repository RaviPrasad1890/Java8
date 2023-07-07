package com.java.educative.streamapi.filter;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

public class StreamFilterDemoTwo {

    public static void main(String[] args) {
        //Using functional Interface to get person just for learning purpose
        Supplier<Person> supplier = () -> new Person("Ravi", 32);
        BiFunction<String, Integer, Person> biFunction = (name, age) -> new Person(name, age);
        Function<String, Person> function = (name) -> new Person(name, name.length());

        List<Person> list = new ArrayList<>();
        list.add(supplier.get());
        list.add(biFunction.apply("KoiBhi", 19));
        list.add(function.apply("Avul Pakir Jainulabdeen Abdul Kalam"));
        list.add(new Person("DukhDard", 30));
        list.add(new Person("Bachpan", 15));
        list.add(new Person("Budhaapa", 65));

        list.stream().filter(p -> p.age > 18 && p.age < 60).forEach(System.out::println);
        System.out.println("--------Filter Chaining--------");
        list.stream().
                filter(p -> p.age > 18).
                filter(p -> p.age < 60).
                filter(p -> p.name.startsWith("K")).
                forEach(c -> System.out.println(c));


    }
}

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

}