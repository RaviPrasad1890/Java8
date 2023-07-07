package com.java.educative.taste_of_lambda.supplier;
import java.util.function.IntSupplier;
public class SupplierIntDemo {

    /*
    The IntSupplier interface has a method getAsInt(),
    which applies the given operation on its argument and returns an int value.
    It is similar to using an object of type Supplier<Integer>.
     */
    public static void main(String[] args){
        IntSupplier supplier=()->(int)(Math.random() * 10);
        System.out.println(supplier.getAsInt());
    }
}
