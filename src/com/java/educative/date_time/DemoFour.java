package com.java.educative.date_time;

import java.time.Year;
import java.util.Scanner;

public class DemoFour {
    public static void main(String[] args){
        Year year= Year.now();
        System.out.println(year);

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Year");
        int n=sc.nextInt();

        Year y=Year.of(n);
        if(y.isLeap()){
            System.out.println("It's a Leap Year");
        }else{
            System.out.println("It's not a Leap Year");
        }
    }
}
