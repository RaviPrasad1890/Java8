package com.java.educative.collection_improvements;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ForEachRemaining {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Grapes");
        list.add("Orange");

        Iterator<String> itr1 = list.iterator();
        Iterator<String> itr2 = list.iterator();

        while (itr1.hasNext()) {
            System.out.println(itr1.next());
        }
        System.out.println("After ForEachRemaining");
        itr2.forEachRemaining(System.out::println);
    }
}
