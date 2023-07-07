package com.java.educative.taste_of_lambda;

public class WellWisherLambda {
    public static void wish(Greeting greeting) {
        greeting.greet();
    }

    public static void main(String[] args){
        wish(()->{
            System.out.println("My first Lambda");
        });
    }
}
