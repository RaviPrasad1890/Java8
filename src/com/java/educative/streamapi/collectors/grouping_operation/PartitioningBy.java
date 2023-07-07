package com.java.educative.streamapi.collectors.grouping_operation;

import com.java.educative.streamapi.collectors.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/*
This method partitions the input elements according to the supplied Predicate and returns a Map<Boolean, List<T>>.

Since the key is a boolean it only takes two values.
Under the true key, we will find elements that match the given Predicate.
Under the false key, we will find the elements which don’t match the given Predicate.

In the given example, we will partition the employees that have an age greater than 33 and less than 30.
 */
public class PartitioningBy {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Dhoni", 35, 70000, "India"));
        employeeList.add(new Employee("Conway", 34, 60000, "NewZeland"));
        employeeList.add(new Employee("DuPlesis", 33, 56000, "South Africa"));
        employeeList.add(new Employee("Philips", 32, 67000, "NewZeland"));
        employeeList.add(new Employee("Jadeja", 31, 54000, "India"));

        Map<Boolean, List<Employee>> empployeeMap =
                employeeList
                        .stream()
                        .collect(Collectors.partitioningBy(e->e.getAge()>=33));
        System.out.println(empployeeMap);
    }
}
