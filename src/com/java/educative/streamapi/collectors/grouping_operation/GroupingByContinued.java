package com.java.educative.streamapi.collectors.grouping_operation;

import com.java.educative.streamapi.collectors.Employee;

import java.util.*;
import java.util.concurrent.ConcurrentMap;
import java.util.stream.Collectors;

public class GroupingByContinued {
    public static void main(String[] args){
        /*
        groupingBy(Function<? super T,? extends K> classifier, Supplier<M> mapFactory, Collector<? super T,A,D> downstream)
        The third variant of groupingBy() takes a supplier as an additional parameter.

        This method is used, if we need to provide the implementation of the Map we need.
         */
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Dhoni", 35, 70000, "India"));
        employeeList.add(new Employee("Conway", 34, 60000, "NewZeland"));
        employeeList.add(new Employee("DuPlesis", 33, 56000, "South Africa"));
        employeeList.add(new Employee("Philips", 32, 67000, "NewZeland"));
        employeeList.add(new Employee("Jadeja", 31, 54000, "India"));

        Map<String, Set<Employee>> empMap=employeeList
                .stream()
                .collect(Collectors.
                        groupingBy(Employee::getCountry, HashMap::new, Collectors.toSet()));
        System.out.println(empMap);
        System.out.println("-----------------------------");

        /*
        groupingByConcurrent(Function<? super T,? extends K> classifier)
        The groupingByConcurrent() collector is similar to the groupingBy() collector;
        the only difference is that this method returns an instance of ConcurrentMap.

        This collector also has three overloaded methods that take the exact same arguments
        as the respective overloaded methods of the groupingBy collector.
         */
        ConcurrentMap<String,List<Employee>> employeeMap = employeeList.parallelStream()
                .collect(Collectors.groupingByConcurrent(Employee::getCountry));

        System.out.println(employeeMap);
    }
}
