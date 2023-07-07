package com.java.educative.roughwork;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ReduceMethod {
    public static void main(String[] args){
        List<Employee> employeeList= new ArrayList<>();
        employeeList.add(new Employee(1,"Abc",3000));
        employeeList.add(new Employee(2,"Def",4000));
        employeeList.add(new Employee(3,"Ghi",5000));
        employeeList.add(new Employee(4,"Jkl",6000));
        employeeList.add(new Employee(5,"Mno",7000));
        employeeList.add(new Employee(6,"Pqr",8000));

        Optional<Integer> totalSalary=employeeList.
                stream().
                map(e->e.getSalary()).
                reduce((i1, i2)->i1+i2);

        if(totalSalary.isPresent()){
            System.out.println(totalSalary.get());
        }

       // we can use sum() instead of reduce(), but then we need to convert it into IntStream
        int totSal=employeeList.stream().
                mapToInt(e-> e.getSalary()).sum();
        System.out.println(totSal);


        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        int totalSum = list.parallelStream()
                .reduce(0, Integer::sum, Integer::sum);

        System.out.println("Total Sum is " + totalSum);
    }
}
