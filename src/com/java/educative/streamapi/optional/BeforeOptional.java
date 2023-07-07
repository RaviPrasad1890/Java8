package com.java.educative.streamapi.optional;


import java.util.HashMap;
import java.util.Map;

public class BeforeOptional {
    Map<Integer,Person> mapPerson=new HashMap<>();

    public Person getPerson(int id){
        return mapPerson.get(id);
    }

    public static void main(String[] args){
        BeforeOptional beforeOptional= new BeforeOptional();
        Person person= beforeOptional.getPerson(1);
        //Null Pointer Exception
        System.out.println(person.getAge());
    }
}
