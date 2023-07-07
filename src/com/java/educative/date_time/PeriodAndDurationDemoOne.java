package com.java.educative.date_time;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

/*
A period represents the date-based amount of time in the ISO-8601 calendar system, such as 2 years, 3 months, and 4 days.
This class is used to modify a given date or to find the difference between dates.
 */
public class PeriodAndDurationDemoOne {
    //We can create a period using the of() method. There are multiple overloaded variants of the of() method.
    public static void main(String[] args) {
        Period period1 = Period.ofDays(1);
        Period period2 = Period.ofMonths(1);
        Period period3 = Period.ofWeeks(1);
        Period period4 = Period.ofYears(1);
        System.out.println(period1 +" "+period2+" "+period3+" "+period4);

        Period period5= Period.of(1,12,30);
        System.out.println(period5);
        System.out.println(period5.getYears());
        System.out.println(period5.getMonths());
        System.out.println(period5.getDays());

        Period period6 = Period.between(LocalDate.parse("2020-05-18"),
                LocalDate.parse("2017-04-17"));

        System.out.println(period6);


        //We can create a Duration using the of() method. There are multiple overloaded variants of the of() method.
        Duration duration = Duration.ofDays(1);  // Created a duration of 1 day.
        System.out.println(duration.getSeconds() + " seconds"); // This will return the number of seconds in a day.

        duration = Duration.ofHours(2);  // Created a duration of 2 hours.
        System.out.println(duration.getSeconds() + " seconds"); // This will return the number of seconds in 2 hours.

        duration = Duration.ofMinutes(23);  // Created a duration of 23 minutes.
        System.out.println(duration.getSeconds() + " seconds"); // This will return the number of seconds in 23 minutes.

        duration = Duration.of(1, ChronoUnit.HOURS);
        System.out.println(duration.getSeconds() + " seconds");

        duration = Duration.between(LocalTime.parse("12:14"), LocalTime.parse("13:15"));

        System.out.println("The difference is " + duration.getSeconds() + " Seconds");
    }


}
