package com.java.educative.streamapi.collectors.collection_operation;

import com.java.educative.streamapi.collectors.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
/*
1. Collectors.toList()#
It returns a Collector that collects all of the input elements into a new List.

Suppose we need to get a list of employee names. We can use the toList() method.
 */
public class CollectorsDemoOne {

    public static void main(String[] args){
        List<Employee> employeeList=new ArrayList<>();
        employeeList.add(new Employee("Conway",31,56000,"New Zealand"));
        employeeList.add(new Employee("Gaikwad",26,35000,"Pune-India"));
        employeeList.add(new Employee("Rahane",34,71000,"Mha-India"));
        employeeList.add(new Employee("Dube",29,50000,"Mumbai-India"));
        employeeList.add(new Employee("Jadeja",34,18000,"Saurashtra-India"));
        employeeList.add(new Employee("Dhoni",41,2000,"Ranchi-India"));

        //Using stream and map and consumer, it will not change original list, we can print the salaries though
        employeeList
                .stream()
                .map(e->e.getSalary())
                .forEach(c-> System.out.println(c));
        System.out.println("-----------------------------------------------");

        //Collectors, to collect salaries in new list
        List<Integer> listSalaries=employeeList
                .stream()
                .map(e->e.getSalary())
                .collect(Collectors.toList());

        listSalaries
                .stream()
                .forEach(System.out::println);

    }
}
