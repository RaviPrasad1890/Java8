package com.java.educative.streamapi.collectors.grouping_operation;

import com.java.educative.streamapi.collectors.Employee;

import java.util.*;
import java.util.stream.Collectors;

/*
Grouping operations are one of the most important features of streams because they can help you complete a task,
which otherwise would have taken a lot of coding, in just 2-3 lines of code.

Let’s say, for example, we have a list of Employee objects.
 We need to group all our employees based on their countries of residence.
 Or, say we need to find the average age/salary of all employees in a particular country.
These kinds of operations can be done very easily with grouping APIs provided in the Collectors class.
 */
/*
Collectors.groupingBy()
This method groups the input elements according to the supplied classifier and returns the results in a Map.

This method is similar to the group by clause of SQL, which can group data on some parameters.

There are three overloaded versions of this method. We will discuss each one of them.

 */
public class GroupingBy {

    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Dhoni", 35, 70000, "India"));
        employeeList.add(new Employee("Conway", 34, 60000, "NewZeland"));
        employeeList.add(new Employee("DuPlesis", 33, 56000, "South Africa"));
        employeeList.add(new Employee("Philips", 32, 67000, "NewZeland"));
        employeeList.add(new Employee("Jadeja", 31, 54000, "India"));
        /*
        groupingBy(Function<? super T, ? extends K> classifier)#
        This method takes only an instance of a Function interface as a parameter.

        In the below example, we use groupingby() to group the Employee objects based on countries of residence.
         */

        Map<String,List<Employee>> employeeMap=employeeList.
                stream().
                collect(Collectors.groupingBy(e->e.getCountry()));

        Map<String,List<Employee>> employeeMapMethodRef=employeeList.
                stream().
                collect(Collectors.groupingBy(Employee::getCountry));

        System.out.println(employeeMap);
        System.out.println(employeeMapMethodRef);
        System.out.println("------------------------------------");

        /*
        groupingBy(Function<? super T,? extends K> classifier, Collector<? super T,A,D> downstream)
        This method takes an additional second collector, which is applied to the results of the first collector.
        In the previous example, the value of Map was a List of employees.
        However, what if we need a Set of employees?
         */

        Map<String, Set<Employee>> employeeMapSet=employeeList.
                stream().
                collect(Collectors.groupingBy(Employee::getCountry,Collectors.toSet()));
        System.out.println(employeeMapSet);
        System.out.println("------------------------------------");

        // The employees are grouped by country and age by using the groupingBy() method twice.
        Map<String, Map<Integer,List<Employee>>> doubleGrouping=
                employeeList.stream()
                        .collect(Collectors.
                                groupingBy(Employee::getCountry,Collectors.groupingBy(Employee::getAge))
                        );
        System.out.println(doubleGrouping);
        System.out.println("------------------------------------");

        /*
        Suppose we need to get a Map where the key is the name of the country and the value is the sum of salaries
        of all of the employees of that country.
        This can be easily done by providing a summingInt() as the downstream Collector.
         */
        Map<String,Integer> countrySalary=employeeList.
                stream().
                collect(Collectors.
                        groupingBy(Employee::getCountry,Collectors.summingInt(Employee::getSalary))
                );
        System.out.println(countrySalary);
        System.out.println("------------------------------------");
        /*
        Next, suppose we need to get a Map where the key is the name of the country and the value is
        the Employee object that has the max salary in that country.
        This can be easily done by providing a maxBy() as the downstream Collector.
         */
        Map<String, Optional<Employee>> countryMaxSalaryOne=employeeList
                .stream()
                .collect(Collectors.
                        groupingBy(Employee::getCountry,
                                Collectors.maxBy((e1,e2)->e1.getSalary().compareTo(e2.getSalary())))
                );

        Map<String, Optional<Employee>> countryMaxSalaryTwo=employeeList
                .stream()
                .collect(Collectors.
                        groupingBy(Employee::getCountry,
                                Collectors.maxBy(Comparator.comparing(Employee::getSalary)))
                );

        System.out.println(countryMaxSalaryOne);
        System.out.println(countryMaxSalaryTwo);
    }
}
