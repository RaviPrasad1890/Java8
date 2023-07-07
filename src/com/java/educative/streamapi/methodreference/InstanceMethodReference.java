package com.java.educative.streamapi.methodreference;
/*
2. Instance method of a particular object
The syntax to use the instance method as a method reference is ReferenceVariable::MethodName

We will look at the same example(StaticMethodReference), but, this time, the getLength() method is not static.
 */

import java.util.ArrayList;
import java.util.List;

public class InstanceMethodReference {

    public int getLength(String str){
        return str.length();
    }

    public static void main(String[] args){
        List<String> list= new ArrayList<>();
        list.add("Kagaaz");
        list.add("Ke");
        list.add("Do");
        list.add("Pankh");
        list.add("Leke");
        list.add("Ura");
        list.add("Chla");
        list.add("Jai");
        list.add("Re");

        InstanceMethodReference instanceMethodReference= new InstanceMethodReference();
        System.out.println("Code without using method reference");
        list.stream().mapToInt(s->instanceMethodReference.getLength(s)).forEach(s-> System.out.println(s));
        System.out.println("Code using method reference");
        list.stream().mapToInt(instanceMethodReference::getLength).forEach(System.out::println);

    }
}
