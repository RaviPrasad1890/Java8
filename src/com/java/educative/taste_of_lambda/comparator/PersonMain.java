package com.java.educative.taste_of_lambda.comparator;

import java.util.ArrayList;
import java.util.List;

public class PersonMain {
    public static void main(String args[]){
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("John" , 23 , "USA",9));
        persons.add(new Person("Carl" , 23 , "Australia",19));
        persons.add(new Person("Amit" , 23 , "India",29));
        persons.add(new Person("Vikram" , 23 , "Bhutan",30));
        persons.add(new Person("Kane" , 23 , "Brazil",18));
        // Calling getPerson() method which will return the List of Person in sorted order.

        List<Person> sortedPersonsLambda = PersonServiceLambda.getPersons(persons);

        //List<Person> sortedPersonsAnonymous = PersonServiceAnonymous.getPersons(persons);

        System.out.println("Persons after sorting");
        for(Person person : sortedPersonsLambda){
            System.out.println("Person Name : " + person.getName());
        }
    }
}
