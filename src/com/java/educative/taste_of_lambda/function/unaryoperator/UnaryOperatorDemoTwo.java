package com.java.educative.taste_of_lambda.function.unaryoperator;

import com.java.educative.taste_of_lambda.comparator.Person;

import java.util.function.UnaryOperator;

public class UnaryOperatorDemoTwo {

    public static Person getPersonViaUnaryOperator(Person person){
        UnaryOperator<Person> unaryOperator=p->new Person("Ravi",32,"India",9);
        return unaryOperator.apply(person);
    }
    public static void main(String[] args){
        Person person=new Person();
        person=getPersonViaUnaryOperator(person);
        System.out.println(person);
    }
}
