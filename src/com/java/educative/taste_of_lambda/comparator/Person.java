package com.java.educative.taste_of_lambda.comparator;

/*
If you’ve been working with Java for some time,
then you’ve probably encountered a scenario where you need to sort the elements in a collection.

If your collection contains a wrapper class object then the sorting is very easy.
Since all the wrapper classes implement the Comparable interface,
you can directly use Collections.sort() to sort your collection.

However, if your collection contains a custom class object then you need to provide the logic to sort your object.
In this lesson, we will look at an example in which we will sort a list of Person class objects using a comparator.
Then, we will write a program to do the same task using lambdas.
 */
public class Person {
    private String name;
    private int age;
    private String country;

    private int yearOfService;

    public Person(String name, int age, String country, int yearOfService) {
        this.name = name;
        this.age = age;
        this.country = country;
        this.yearOfService = yearOfService;
    }

    public Person() {

    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCountry() {
        return country;
    }

    public int getYearOfService() {
        return yearOfService;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", country='" + country + '\'' +
                ", yearOfService=" + yearOfService +
                '}';
    }
}
