package com.java.educative.streamapi.immutablereduction;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

/*
max() and min()
max() and min() operations are very helpful if we need to get the largest or smallest element from a stream.

Optional<T> max(Comparator<? super T> comparator)

It takes a Comparator as a parameter and returns an Optional.
 */
public class MaxMin {
    public static void main(String[] args){
        List<Integer> list= Arrays.asList(7,3,1,5,4,8,2,9,6);
        Optional<Integer> min=list.stream().min(Comparator.naturalOrder());
        Optional<Integer> max=list.stream().max(Comparator.naturalOrder());
        System.out.println("Minimum "+min.get()+" and Maximum "+max.get());
    }
}
