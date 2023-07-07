package com.java.educative.date_time;

import java.time.LocalDate;
import java.time.Period;

public class DemoThree {
    public static void main(String[] args){
        LocalDate birthDate=LocalDate.of(1991,06,18);
        LocalDate now= LocalDate.now();
        Period age= Period.between(birthDate,now);
        System.out.println(age);

        System.out.println(age.getYears());
        System.out.println(age.getDays());
        System.out.println(age.getMonths());

    }
}
