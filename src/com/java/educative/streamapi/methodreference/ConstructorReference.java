package com.java.educative.streamapi.methodreference;

import java.util.ArrayList;
import java.util.List;

/*
4. Constructor references#
We can refer to a constructor in the same way we reference a static method.
The only difference is that we need to use a new keyword.
 */
public class ConstructorReference {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Dave");
        list.add("Joe");
        list.add("Ryan");
        list.add("Iyan");
        list.add("Ray");

        System.out.println("Code without constructor reference");
        list.stream()
                .map(name -> new Employeee(name))
                .forEach(System.out::println);

        System.out.println("Code with constructor reference");
        list.stream()
                .map(Employeee::new)
                .forEach(System.out::println);
    }
}
class Employeee {
    String name;
    int age;
    int salary;

    Employeee(String name) {
        this.name = name;
    }

    Employeee(String name, int age, int salary) {
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
