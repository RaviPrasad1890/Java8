package com.java.educative.streamapi.immutablereduction;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;

/*
<U> U reduce(U identity, BiFunction<U, ? super T,U> accumulator, BinaryOperator<U> combiner)#
As per Java Docs, this method performs a reduction on the elements of this stream,
using the provided identity, accumulation and combining functions.
If we are using a parallel stream, then the Java runtime splits the stream into multiple substreams.
In such cases, we need to use a function to combine the results of the substreams into a single one.
This is done by a combiner.

We will use a parallel stream in the example shown above to see how a combiner works.
 */
public class ReduceDemoThree {

    public static void main(String[] args){
        //BiFunction Refresher--Start
        BiFunction<String,String,Integer> biFunction=(s1,s2)->s1.length()+s2.length();
        int length=biFunction.apply("Hello ","Ravi");
        System.out.println(length);
        //BiFunction Refresher--End

        List<Integer> list= Arrays.asList(2,5,3,7,4,8,1,9,6);
        int totalSum=list.
                parallelStream().reduce(0,(i1,i2)->i1+i2,(i1,i2)->i1+i2);

        int totalSumMethodRef=list.
                parallelStream().reduce(0, Integer::sum, Integer::sum);
        System.out.println(totalSum);
        System.out.println(totalSumMethodRef);

    }
}
