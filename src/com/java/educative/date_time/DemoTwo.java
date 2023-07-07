package com.java.educative.date_time;

import java.time.LocalDateTime;
import java.time.Month;

public class DemoTwo  {
    public static void main(String[] args){
        LocalDateTime localDateTime=LocalDateTime.of(1995, Month.MAY,28,12,25);
        System.out.println(localDateTime);

        System.out.println(localDateTime.plusMonths(6));
        System.out.println(localDateTime.minusMonths(6));
    }
}
