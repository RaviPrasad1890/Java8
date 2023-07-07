package com.java.educative.streamapi.mapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
Stream flatMap() method is used to flatten a stream of collections to a stream of elements combined from all collections.

Basically, flatMap() is used to do following operation:

Stream<String[]> -> flatMap -> Stream<String>

Stream<Set<String>> -> flatMap -> Stream<String>

Stream<List<String>> -> flatMap -> Stream<String>

Now, the question is why do we need to flatten our stream?
The reason is that intermediate methods such as filter() and distinct() do not work on streams of Collections.

These methods only work on streams of primitives or objects.
So, we need to flatten our stream before using these intermediate functions.

Let’s see an example of flatMap(). In the below code we have a List<List<String>>.

 */
public class StreaMappingDemoThree {
    public static void main(String[] args) {
        List<List<String>> listOfListOfString = new ArrayList<>();
        listOfListOfString.add(Arrays.asList("a","b","c"));
        listOfListOfString.add(Arrays.asList("d","e","f"));
        listOfListOfString.add(Arrays.asList("g","h","i"));
        listOfListOfString.add(Arrays.asList("j","k","l"));

        System.out.println("Below line will not print anything");
        listOfListOfString.stream().filter(p-> p.equals("a")).forEach(System.out::println);
        System.out.println("Below code will become effective");
        listOfListOfString.stream().
                flatMap(s->s.stream()).
                filter(p->p.equals("a")).
                forEach(System.out::println);

        System.out.println("Without flat map");
        listOfListOfString.stream().forEach(System.out::println);
        System.out.println("With flat map");
        listOfListOfString.stream().flatMap(s->s.stream()).forEach(System.out::println);
    }
}
