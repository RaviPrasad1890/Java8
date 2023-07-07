package com.java.educative.streamapi.immutablereduction;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;

/*
Optional<T> reduce(BinaryOperator<T> accumulator)
As we can see, this method takes a binary operator as an input and returns an Optional that describes the reduced value.

The reduce() method iteratively applies the accumulator function on the current input element.

In the below example, we need to find the total salaries of all the employees in an organization.

For this, we are going to use the reduce(BinaryOperator<T> accumulator) operation.
 */
public class ReduceDemoOne {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee("Dave", 23, 20000));
        list.add(new Employee("Joe", 18, 40000));
        list.add(new Employee("Ryan", 54, 100000));
        list.add(new Employee("Iyan", 5, 34000));
        list.add(new Employee("Ray", 63, 54000));

        //Binary Operator refresher--Start
        BinaryOperator<Integer> b = (i1, i2) -> i1 + i2;
        BinaryOperator<Integer> bMethodRefStyle = Integer::sum;
        System.out.println("BinaryOperator refresher " +b.apply(1, 2));
        System.out.println("BinaryOperator refresher " + bMethodRefStyle.apply(1, 2));
        //Binary Operator refresher--Start

        Optional<Integer> totalSalaryUsingReduce = list.stream()
                .map(p -> p.getSalary())//We are converting the Stream of Employees to Stream of salaries.
                .reduce((i1, i2) -> i1 + i2);

        Optional<Integer> totalSalaryUsingReduceMethodRefStyle =
                list.stream()
                        .map(Employee::getSalary)
                        .reduce(Integer::sum);

        if (totalSalaryUsingReduce.isPresent()) {
            System.out.println("The total salary is " + totalSalaryUsingReduce.get());
        }

        //Using ifPresent instead of isPresent
        totalSalaryUsingReduceMethodRefStyle.ifPresent(integer -> System.out.println("The total salary is(ifPresent) " + integer));

        /*
        we can use a sum() operation instead of reduce(), but the sum() operation is available in IntStream.
        So, if we need to get the sum of all the elements in our stream,
        we should convert it into IntStream and then directly use sum().
         */
        int totalSalry = list.stream().mapToInt(p -> p.getSalary()).sum();
        System.out.println("Total Salary using Map To Int " + totalSalry);


    }
}

class Employee {
    String name;
    int age;
    int salary;

    Employee(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}
