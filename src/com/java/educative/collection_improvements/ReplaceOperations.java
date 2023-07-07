package com.java.educative.collection_improvements;

import java.util.HashMap;
import java.util.Map;

/*
Sometimes we are required to change certain values from Hashmap.
Before Java 8, the only way to do this was to iterate over the Map and change each value one by one.

This is a cumbersome process, and it is prone to errors if the logic is not written properly.
To overcome this issue, a few new methods have been introduced in Java 8.

replace(K key, V value)
This method replaces the entry for the specified key only if it is currently mapped to some value.
If the key is not present or if the key is present but the current value is null, then nothing is done.

replace(K key, V oldValue, V newValue)
This method replaces the entry for the specified key only if it iscurrently mapped to the specified value.

replaceAll(BiFunction<? super K, ? super V, ? extends V> function)
This method replaces each entry’s value with the result of invoking the given function on that entry
until all of theentries have been processed or the function throws an exception.
 */
public class ReplaceOperations {
    public static void main(String[] args){
        Map<String,Integer> fruits=new HashMap<>();
        fruits.put("Apple",20);
        fruits.put("Orange",20);

        System.out.println(fruits);
        fruits.replace("Orange",30);
        System.out.println(fruits);
        fruits.replace("Apple",20,30);
        System.out.println(fruits);
        fruits.replace("Apple",35,40);
        System.out.println(fruits);
        fruits.replaceAll((k,v)->50);
        System.out.println(fruits);
        fruits.replaceAll((k,v)->v-10);
        System.out.println(fruits);
        fruits.putIfAbsent("Papaya",30);
        System.out.println(fruits);
        fruits.remove("Papaya");
        System.out.println(fruits);
        fruits.putIfAbsent("Papaya",30);
        fruits.remove("Papaya",20);
        System.out.println(fruits);


    }
}
