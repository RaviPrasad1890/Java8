package com.java.educative.date_time;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class LocalTimeDemo {
    public static void main(String[] args){
        LocalTime time1= LocalTime.now();
        System.out.println(time1);

        LocalTime time2=LocalTime.parse("08:30");
        System.out.println(time2);

        time2=LocalTime.parse("10:10", DateTimeFormatter.ofPattern("HH:mm"));
        System.out.println(time2);

        LocalTime time3=LocalTime.of(8,30);
        System.out.println(time3);

        LocalTime time4=LocalTime.of(10,10,10);
        System.out.println(time4);

        LocalTime time5= LocalTime.of(10,10,10,10);
        System.out.println(time5);

        LocalTime time6=LocalTime.parse("23:12:12").plusHours(1);
        System.out.println(time6);
        time6=time6.plusMinutes(1);
        System.out.println(time6);
        time6=time6.plusSeconds(1);
        System.out.println(time6);
        time6=time6.plusNanos(1);
        System.out.println(time6);
        time6=time6.plus(1, ChronoUnit.HOURS);
        System.out.println(time6);

        System.out.println(time6.getMinute());

        boolean isBefore = LocalTime.parse("06:23")
                .isBefore(LocalTime.parse("07:50"));
        System.out.println(isBefore);

        boolean isAfter = LocalTime.parse("06:23")
                .isAfter(LocalTime.parse("07:50"));
        System.out.println(isAfter);

    }
}
