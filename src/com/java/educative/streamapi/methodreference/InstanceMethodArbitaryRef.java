package com.java.educative.streamapi.methodreference;

import java.util.ArrayList;
import java.util.List;

/*
3. Instance method of an arbitrary object
This type of method reference does not require the object of the referenced class.
We can directly use the class name in the method reference.
 */
public class InstanceMethodArbitaryRef {

    public static void main(String[] args){
        List<Employeee> employees= new ArrayList<>();
        employees.add(new Employeee("Tomar",32,20000));
        employees.add(new Employeee("Ghorey",33,30000));
        employees.add(new Employeee("Bosot",34,40000));
        employees.add(new Employeee("Korey",35,50000));
        employees.add(new Employeee("KoJona",36,60000));

        System.out.println("Code without using method reference");
        int totalSalary1=employees.stream().mapToInt(e-> e.getSalary()).sum();
        System.out.println(totalSalary1);
        System.out.println("Code using method reference");
        int totalSalary2=employees.stream().mapToInt(Employeee::getSalary).sum();
        System.out.println(totalSalary2);
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
