package com.java.educative.date_time;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class DemoFive {
    public static void main(String[] args){
        ZoneId z1=ZoneId.systemDefault();
        System.out.println(z1);

        ZoneId z2=ZoneId.of("America/Los_Angeles");
        ZonedDateTime zt=ZonedDateTime.now(z2);
        System.out.println(zt);
    }
}
