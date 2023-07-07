package com.java.educative.static_methods;
/*
The static methods in interfaces are similar to default methods but the only difference is that you can’t override them.
Now, why do we need static methods in interfaces if we already have default methods?

Suppose you want to provide some implementation in your interface and you don’t want this implementation to be
overridden in the implementing class, then you can declare the method as static.
 */
public class Car implements Vehicle{
    /*@Override
    public void cleanVehicle() {
        System.out.println("Cleaning the vehicle");
    }*/

    public void cleanVehicle() {
        System.out.println("Cleaning the vehicle-Inside Car");
    }

    public static void main(String args[]) {
        Car car = new Car();
        car.cleanVehicle();
        Vehicle.cleanVehicle();

    }
}
