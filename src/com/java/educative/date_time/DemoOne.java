package com.java.educative.date_time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DemoOne {

    public static void main(String[] args){
        LocalDate localDate= LocalDate.now();
        System.out.println(localDate);

        LocalTime localTime= LocalTime.now();
        System.out.println(localTime);

        LocalDateTime localDateTime= LocalDateTime.now();
        System.out.println(localDateTime);

        System.out.println(localDate.getDayOfMonth());
        System.out.println(localDate.getMonth());
        System.out.println(localDate.getEra());

        int dd=localDateTime.getDayOfMonth();
        int mm= localDateTime.getMonthValue();
        int yy=localDateTime.getYear();
        System.out.printf("%s-%s-%s",dd,mm,yy);
    }
}
