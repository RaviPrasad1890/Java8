package com.java.educative.taste_of_lambda.supplier;

import java.util.function.DoubleSupplier;

/*
The DoubleSupplier interface has a method getAsDouble(),
which applies the given operation on its argument and returns a double value.
It is similar to using an object of type Supplier<Double>.
 */
public class SupplierDoubleDemo {

    public static void main(String[] args){
        DoubleSupplier supplier=()->Math.random() * 10;
        System.out.println(supplier.getAsDouble());
    }
}
