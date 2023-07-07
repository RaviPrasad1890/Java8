package com.java.educative.streamapi.immutablereduction;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

/*
2. T reduce(T identity, BinaryOperator<T> accumulator)
As per Java docs, this method “performs a reduction on the elements of this stream,
using the provided identity value and an associative accumulation function, and returns the reduced value.”

This method has an extra ‘identity’ parameter. It is the initial value of reduction.
It is the default result of reduction if there are no elements in the stream.
That’s the reason, this version of the reduce method doesn’t return Optional because it would at least return the identity element.

In the below example, we provide five as an identity.
If the stream is empty, five will be returned. If the stream is not empty, five will be added to the sum.
 */
public class ReduceDemoTwoWithIdentity {
    public static void main(String[] args){
        //BinaryOperator refresher
        BinaryOperator<String> binaryOperator=(s1,s2)->s1.concat(s2);
        binaryOperator.apply("Dil Hai Ki ","Nai");

        List<Integer> list= Arrays.asList(6,2,8,4,9,2,4,7);
        int total=list.stream().reduce(5,(i1,i2)->i1+i2);//5+42-->47
        System.out.println(total);
    }
}
