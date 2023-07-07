package com.java.educative.roughwork;

import java.util.*;
import java.util.stream.Collectors;

public class CollectorsRoughTwo {

    public static void main(String[] args){
        List<Employee> employeeList= new ArrayList<>();
        employeeList.add(new Employee(1,"Abc",3000));
        employeeList.add(new Employee(2,"Def",4000));
        employeeList.add(new Employee(3,"Ghi",5000));
        employeeList.add(new Employee(4,"Jkl",6000));
        employeeList.add(new Employee(5,"Mno",7000));
        employeeList.add(new Employee(6,"Pqr",8000));

        Optional<Employee> employeeWithMinSalary= employeeList
                .stream()
                .collect(Collectors.minBy(Comparator.comparing(emp->emp.getSalary())));

        employeeWithMinSalary.ifPresent(System.out::println);

        Optional<Employee> employeeWithMaxSalary= employeeList
                .stream()
                .collect(Collectors.maxBy(Comparator.comparing(emp->emp.getSalary())));

        employeeWithMaxSalary.ifPresent(System.out::println);

        OptionalInt minSal=employeeList.stream().mapToInt(e->e.getSalary()).min();

        minSal.ifPresent(System.out::println);
    }
}
