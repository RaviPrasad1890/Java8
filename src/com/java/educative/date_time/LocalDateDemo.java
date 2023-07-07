package com.java.educative.date_time;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class LocalDateDemo {

    public static void main(String[] args){

        LocalDate date1 = LocalDate.now();
        System.out.println(date1);
        // of(int year, int month, int dayOfMonth)
        LocalDate date2 = LocalDate.of(2019, 05, 03);
        System.out.println(date2);

        // of(int year, Month month, int dayOfMonth)
        date2 = LocalDate.of(2019, Month.AUGUST, 03);
        System.out.println(date2);

        LocalDate date3=LocalDate.parse("2015-05-05");
        System.out.println(date3);

        LocalDate date4=LocalDate.parse("01/01/2023", DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        System.out.println(date4);

        LocalDate date5=date1.plusDays(10);
        System.out.println(date5);
        LocalDate date6=date1.plus(1, ChronoUnit.MONTHS);
        System.out.println(date6);

        DayOfWeek dayOfWeek=LocalDate.parse("2023-07-07").getDayOfWeek();
        System.out.println(dayOfWeek);

        // Using isBefore() to check if the date is before a given date.
        boolean isBefore = LocalDate.parse("2020-03-12")
                .isBefore(LocalDate.parse("2018-06-14"));
        System.out.println(isBefore);

        // Using isAfter() to check if the date is after a given date.
        boolean isAfter = LocalDate.parse("2020-03-12")
                .isAfter(LocalDate.parse("2018-06-14"));
        System.out.println(isAfter);
    }
}
