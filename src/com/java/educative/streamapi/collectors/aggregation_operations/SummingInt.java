package com.java.educative.streamapi.collectors.aggregation_operations;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
/*
Collectors.summingInt(ToIntFunction<? super T> mapper)
This method returns a Collector that produces the sum of an integer-valued function applied to the input elements.
 */
public class SummingInt {
    public static void main(String[] args){
        List<Employee> listEmp=new ArrayList<>();
        listEmp.add(new Employee("Jaiswal",29,50000));
        listEmp.add(new Employee("Buttler",31,60000));
        listEmp.add(new Employee("Samson",32,40000));
        listEmp.add(new Employee("Natrajan",28,80000));
        listEmp.add(new Employee("Markram",33,30000));

        int totalSalary=listEmp.
                stream().
                collect(Collectors.summingInt(e->e.getSalary()));

        System.out.println(totalSalary);
    }
}
