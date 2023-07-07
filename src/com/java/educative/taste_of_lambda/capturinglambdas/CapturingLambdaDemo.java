package com.java.educative.taste_of_lambda.capturinglambdas;

import java.util.function.Function;

/*

-->https://www.educative.io/courses/java-8-lambdas-stream-api-beyond/x1MKw2Y30WB
Why should local variables be final or effectively final?

When a local variable is used in a lambda expression, the lambda makes a copy of that variable.
This occurs because the scope of a lambda expression is only until the method is in the stack.
If the lambda does not make a copy of the variable, then the variable is lost after the method is removed from the stack.

Now, if the variable is not final or effectively final,
it is possible that the value of the variable is changed after using it in the lambda as shown below.
 */
public class CapturingLambdaDemo {

    public static void main(String args[]){

        Function<Integer, Integer> multiplier = getMultiplier();

        System.out.println(multiplier.apply(10));
    }

    public static Function<Integer,Integer> getMultiplier(){

        int i = 5;
        // The below lambda has copied the value of i.
        Function<Integer, Integer> multiplier = t -> t * i;
        // If you change the value of i here, then the lambda will have old value.
        // So this is not allowed and code will not compile if we uncomment the below line.
       // i = 7;
        return multiplier;

    }
}
