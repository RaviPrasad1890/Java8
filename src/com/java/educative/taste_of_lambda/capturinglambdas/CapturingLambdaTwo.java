package com.java.educative.taste_of_lambda.capturinglambdas;

import java.util.function.Function;

public class CapturingLambdaTwo {
    int instnaceVar=10;
    static int staticVar=20;

    public static Function<Integer,Integer> getMultiplierWithLocalVar(){
        int localVar = 5;
        Function<Integer, Integer> multiplierOne = t -> t * localVar;
        //localVar=7;
        return multiplierOne;
    }
    public  Function<Integer,Integer> getMultiplierWithInstanceVar(){
        Function<Integer, Integer> multiplierOne = t -> t * instnaceVar;
        return multiplierOne;
    }
    public static Function<Integer,Integer> getMultiplierWithStaticVar(){
        Function<Integer, Integer> multiplierOne = t -> t * staticVar;
        return multiplierOne;
    }

    public static void main(String args[]){
        System.out.println("A lambda can capture instance variables");
        System.out.println("A lambda can capture static variables");
    }


}
