package com.java.educative.streamapi.collectors.aggregation_operations;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/*
1) counting()
This function returns a Collector that counts the number of the input elements.

Suppose we have a list of employees, and we need the count of employees with an age more than 30.

In this case, we can use the counting() method as shown below.
 */
public class Counting {

    public static void main(String[] args){
        List<Employee> listEmp=new ArrayList<>();
        listEmp.add(new Employee("Jaiswal",29,50000));
        listEmp.add(new Employee("Buttler",31,60000));
        listEmp.add(new Employee("Samson",32,40000));
        listEmp.add(new Employee("Natrajan",28,80000));
        listEmp.add(new Employee("Markram",33,30000));

        long empMoreThan30=listEmp.
                stream().
                filter(e->e.getAge()>30).
                collect(Collectors.counting());

        System.out.println(empMoreThan30);
    }
}
