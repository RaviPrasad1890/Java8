package com.java.educative.default_methods;
/*
/*
Before Java 8, if a new method was introduced in an interface then all the implementing classes used to break.
We would need to provide the implementation of that method in all the implementing classes.

However, sometimes methods have only single implementation and there is no need to provide their implementation in each class.
In that case, we can declare that method as a default in the interface and provide its implementation in the interface itself.

 */
public interface Vehicle {

    void cleanVehicle();

    default void startVehicle(){
        System.out.println("Vehicle is Starting");
    }
}
