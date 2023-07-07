package com.java.educative.streamapi.collectors.collection_operation;

import com.java.educative.streamapi.collectors.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/*
2. Collectors.toSet()#
It returns a Collector that collects all input elements into a new Set.

Suppose we have a list of employees,
and we need to get a set of countries to which our employees belong then we can use toSet() method.
 */
public class CollectorsDemoTwo {

    public static void main(String[] args){
        List<Employee> employeeList=new ArrayList<>();
        employeeList.add(new Employee("Conway",31,56000,"New Zealand"));
        employeeList.add(new Employee("Gaikwad",26,35000,"Pune-India"));
        employeeList.add(new Employee("Rahane",34,71000,"Mha-India"));
        employeeList.add(new Employee("Dube",29,50000,"Mumbai-India"));
        employeeList.add(new Employee("Jadeja",34,18000,"Saurashtra-India"));
        employeeList.add(new Employee("Dhoni",41,2000,"Ranchi-India"));

        Set<Integer> setSalaries=employeeList
                .stream()
                .map(e->e.getSalary())
                .collect(Collectors.toSet());

        System.out.println(setSalaries);

    }
}
