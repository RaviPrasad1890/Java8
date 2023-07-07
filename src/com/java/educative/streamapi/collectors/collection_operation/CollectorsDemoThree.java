package com.java.educative.streamapi.collectors.collection_operation;

import com.java.educative.streamapi.collectors.Employee;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

/*
3. Collectors.toCollection(Supplier<C> collectionFactory)#
This method returns a Collector that collects all of the input elements into a new Collection.
This method takes a Supplier as a parameter. The Supplier supplies the collection of our choice.

Below is an example of collecting the first three employees in a LinkedList.
 */
public class CollectorsDemoThree {

    public static void main(String[] args){
        List<Employee> employeeList=new ArrayList<>();
        employeeList.add(new Employee("Conway",31,56000,"New Zealand"));
        employeeList.add(new Employee("Gaikwad",26,35000,"Pune-India"));
        employeeList.add(new Employee("Rahane",34,71000,"Mha-India"));
        employeeList.add(new Employee("Dube",29,50000,"Mumbai-India"));
        employeeList.add(new Employee("Jadeja",34,18000,"Saurashtra-India"));
        employeeList.add(new Employee("Dhoni",41,2000,"Ranchi-India"));

        System.out.println("Different way of storing names in a new List/Collection");
        List<String> empNameListOne=employeeList
                .stream()
                .map(e->e.getName())
                .collect(Collectors.toList());

        List<String> empNameListTwo=employeeList
                .stream()
                .map(e->e.getName())
                .collect(Collectors.toCollection(LinkedList::new));

        List<String> empNameListThree=employeeList
                .stream()
                .map(e->e.getName())
                .collect(Collectors.toCollection(()->new LinkedList<>()));

        empNameListOne.stream().forEach(System.out::println);
        System.out.println("----------------------------");
        empNameListTwo.stream().forEach(System.out::println);
        System.out.println("----------------------------");
        empNameListThree.stream().forEach(System.out::println);

    }
}
