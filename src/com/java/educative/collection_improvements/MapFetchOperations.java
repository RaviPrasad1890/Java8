package com.java.educative.collection_improvements;

import java.util.HashMap;
import java.util.Map;

/*
If you have used Map then you must have faced a challenge where you needed to update the value of a key in the Map.
Now, before updating, you must first check if the value is present in the Map, get the current value, update it,
and again put the value in the Map. This is quite a cumbersome process, and it involves using lots of if/else statements.
This kind of code is difficult to understand and fix if any issues occur.
 */
public class MapFetchOperations {

    public static void main(String[] args){
        Map<String,Integer> fruits=new HashMap<>();
        fruits.put("Apple",20);
        if(fruits.containsKey("Banana")){
            fruits.put("Banana",fruits.get("Banana")+20);
        }else{
            fruits.put("Banana",20);
        }
        //After getOrDefault
        fruits.put("Grapes",fruits.getOrDefault("Grapes",0)+20);
        System.out.println(fruits);

        //putIfAbsent
        fruits.putIfAbsent("Apple",30);
        System.out.println(fruits);

        //compute()
        int val=fruits.compute("Apple",(key,value)->value+10);
        System.out.println(fruits);
        System.out.println(val);
        // Below line will throw Null Pointer Exception.
        //int val = fruits.compute("Papaya", (k, v) -> v + 10);

        //computeIfAbsent
        int val1 = fruits.computeIfAbsent("Papaya", k->10);
        System.out.println(val1);
        System.out.println(fruits);

        int val2=fruits.computeIfAbsent("Apple",k->10);
        System.out.println(val2);
        System.out.println(fruits);

        //computeIfPresent
        int val3=fruits.computeIfPresent("Papaya",(k,v)->v+10);
        fruits.computeIfPresent("Dragon Fruit",(k,v)->v+10);
        System.out.println(val3);
        System.out.println(fruits);


    }

}
