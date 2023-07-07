package com.java.educative.streamapi.collectors.collection_operation;

import com.java.educative.streamapi.collectors.Employee;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

/*
4. Collectors.toMap()#
toMap() is used to collect stream elements into a Map instance.
This method takes two parameters

keyMapper - used for extracting a Map key from a stream element
valueMapper - used for extracting a value associated with a given key

Suppose we have a list of strings, and we need to create a map where the key is the string
and the value is the length of the string. In this case, we can use the toMap() method.
 */
public class CollectorsDemoFour {

    public static void main(String[] args){
        List<Employee> employeeList=new ArrayList<>();
        employeeList.add(new Employee("Conway",31,56000,"New Zealand"));
        employeeList.add(new Employee("Gaikwad",26,35000,"Pune-India"));
        employeeList.add(new Employee("Rahane",34,71000,"Mha-India"));
        employeeList.add(new Employee("Dube",29,50000,"Mumbai-India"));
        employeeList.add(new Employee("Jadeja",34,18000,"Saurashtra-India"));
        employeeList.add(new Employee("Dhoni",41,2000,"Ranchi-India"));

        List<String> listName=employeeList
                .stream()
                .map(e->e.getName())
                .collect(Collectors.toList());

        Map<String,Integer> mapOne=listName
                .stream()
                .collect(Collectors.toMap(s->s,s->s.length()));

        System.out.println(mapOne);

        /*
        The problem with the above example is that,
        if the list has duplicate elements, toMap() will throw an exception.

        To solve this problem, there is an overloaded version of toMap()
        that takes an additional BinaryOperator as a parameter.
        This is used to decide which element should be considered in case of duplicates.
         */


        System.out.println("Binary Operator Refresher");
        BinaryOperator<String> binaryOperatorRefresher=(s1,s2)->{
            if(s1.compareTo(s2)>0){
                return s1;
            }else{
                return s2;
            }
        };
        System.out.println(binaryOperatorRefresher.apply("Udtey","Panchi"));

        Map<String,Integer> mapTwo=listName
                .stream()
                .collect(Collectors.toMap(s->s,s->s.length(),(s1,s2)->s1));

        System.out.println(mapTwo);

        /*
        There is one more overloaded version of toMap() method,
        which allows us to provide the implementation of Map that you want to use.
         */

        Map<String,Integer> mapThree=listName
                .stream()
                .collect(Collectors.toMap(s->s,s->s.length(),(s1,s2)->s1, HashMap::new));

        System.out.println(mapThree);

    }
}
