package com.java.educative.streamapi.finding;

import com.java.educative.streamapi.matching.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/*
In the matching lesson, we looked at matching operations.
Those operations check whether the elements in the stream match particular criteria, and they return true or false.

However, sometimes we need to get the matched element instead of just verifying if it is present or not.
The finding operations are used for this purpose.
There are two basic finding operations in streams, i.e., findFirst() and findAny().

These operations are typically used with a filter() operation,
but it is not necessary that they are used only with a filter() operation.


Optional<T> findFirst()
It returns an Optional describing the first element of this stream, or an empty Optional if the stream is empty.


Optional<T> findAny()
It returns an Optional describing some element of this stream,
or an empty Optional if the stream is empty. Now you might be wondering why
we need this method if we already have the findFirst() operation.

This operation is particularly useful in the case of parallel streams.
We have not discussed parallel streams yet but we will discuss them in future lessons.
For now, just imagine that we can create a parallel stream so that
the intermediate operations can be applied in parallel.

Now if we use the findFirst() method in the parallel stream,
it can be very slow. Instead, findAny() is used if we are not concerned about which element is returned.
 */
public class FindingOperationDemoOne {

    public static void main(String[] args){
        List<Fruit> fruits=new ArrayList<>();
        fruits.add(new Fruit("Apple","Sweet"));
        fruits.add(new Fruit("Orange","Sour"));
        fruits.add(new Fruit("Grapes","Sweet"));
        fruits.add(new Fruit("Banana","Sweet"));
        fruits.add(new Fruit("Kiwi","Sour"));

        Optional<Fruit> fruitOne=fruits.stream().filter(f->f.taste.equals("Sweet")).findFirst();
        if(fruitOne.isPresent()){
            System.out.println(fruitOne.get());
        }

        Optional<Fruit> fruitTwo=fruits.stream().filter(f->f.taste.equals("Sour")).findAny();
        if(fruitTwo.isPresent()){
            System.out.println(fruitTwo.get());
        }
    }
}
class Fruit{
    String name;
    String taste;

    Fruit(String name,String taste){
        this.name=name;
        this.taste=taste;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "name='" + name + '\'' +
                ", taste='" + taste + '\'' +
                '}';
    }
}
