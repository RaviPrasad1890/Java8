package com.java.educative.streamapi.collectors.aggregation_operations;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

/*
minBy(Comparator<? super T> comparator)
It returns a Collector that returns the minimum element based on the given comparator.

Let’s say, we have an ArrayList of Employee objects and we need to find the Employee object with a minimum salary.
In this case, we first need to create a Comparator that compares two Employee objects on the basis of salary.

Then we will use this Comparator in the minBy() method. The returned value is wrapped in an Optional instance.
The reason for this is that, it is possible that the Employee list is empty.
 */
public class MinByMaxBy {

    public static void main(String[] args){
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Alex", 23, 23000));
        employeeList.add(new Employee("Ben", 63, 25000));
        employeeList.add(new Employee("Dave", 34, 56000));
        employeeList.add(new Employee("Jodi", 43, 67000));
        employeeList.add(new Employee("Ryan", 53, 54000));

        //This way we can do by Immutable Reduction
        Optional<Integer> minSalaryByImmutableReduction=employeeList.
                stream().
                map(e->e.getSalary())
                .min(Comparator.naturalOrder());
        minSalaryByImmutableReduction.ifPresent(System.out::println);

        //This way we can do using collectors
        Function<Employee,Integer> function=e->e.getSalary();
        Optional<Employee> minSalaryByMutableReduction=employeeList.stream().
                collect(Collectors.minBy(Comparator.comparing(e->e.getSalary())));

        Optional<Employee> minSalaryByMutableReductionMethodRef=employeeList.stream().
                collect(Collectors.minBy(Comparator.comparing(Employee::getSalary)));

        minSalaryByMutableReduction.ifPresent((c)->System.out.println(c.getSalary()));
        if(minSalaryByMutableReductionMethodRef.isPresent()){
            System.out.println(minSalaryByMutableReductionMethodRef.get().getSalary());
        }

        /*
        maxBy(Comparator<? super T> comparator)#
        It returns a Collector that returns the maximum element based on the given comparator.

        The returned value is wrapped in an Optional instance.
         */

        Optional<Employee> maxSalaryByMutableReductionMethodRef=employeeList.stream().
                collect(Collectors.maxBy(Comparator.comparing(Employee::getSalary)));
        maxSalaryByMutableReductionMethodRef.ifPresent((c)->System.out.println(c.getSalary()));

    }
}
