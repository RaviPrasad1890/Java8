package com.java.educative.roughwork;

import java.util.*;
import java.util.stream.Collectors;

public class CollectorsRoughOne {
    public static void main(String[] args){

        List<Employee> employeeList= new ArrayList<>();
        employeeList.add(new Employee(1,"Abc",3000));
        employeeList.add(new Employee(2,"Def",4000));
        employeeList.add(new Employee(3,"Ghi",5000));
        employeeList.add(new Employee(4,"Jkl",6000));
        employeeList.add(new Employee(5,"Mno",7000));
        employeeList.add(new Employee(6,"Pqr",8000));

        List<Integer> salaries= employeeList
                .stream()
                .map(e->e.getSalary())
                .collect(Collectors.toList());
        System.out.println(salaries);

        Set<String> names= employeeList
                .stream()
                .map(e->e.getName())
                .collect(Collectors.toSet());
        System.out.println(names);

        List<Employee> newEmployeeList = new ArrayList<>();
        newEmployeeList.add(new Employee(23,"Alex", 23000));
        newEmployeeList.add(new Employee( 63,"Ben", 25000));
        newEmployeeList.add(new Employee( 34,"Dave", 56000));
        newEmployeeList.add(new Employee( 43,"Jodi", 67000));
        newEmployeeList.add(new Employee( 53,"Ryan", 54000));

        LinkedList<String> empName = newEmployeeList.stream()
                .map(emp -> emp.getName())
                .collect(Collectors.toCollection(()->new LinkedList<>()));
        System.out.println(empName);

        List<String> list = new ArrayList<>();
        list.add("done");
        list.add("far");
        list.add("away");
        list.add("again");

        Map<String,Integer> map=list
                .stream()
                .collect(Collectors.toMap(s->s,s->s.length()));
        System.out.println(map);

        Map<String,Integer> nameMap = list.stream()
                .collect(Collectors.toMap(s -> s , s -> s.length(), (s1,s2) -> s1));

        Map<String,Integer> nameMapp = list.stream()
                .collect(Collectors.toMap(s -> s , s -> s.length(), (s1,s2) -> s1, ()->new HashMap<>()));
    }
}
