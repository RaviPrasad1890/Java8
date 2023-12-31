package com.java.educative.default_methods;

public class ImplClass implements InterfaceA,InterfaceB{
    @Override
    public void printSomething() {
        //Option 1 -> Provide our own implementation.
        System.out.println("I am inside Main class");

        //Option 2 -> Use existing implementation from interfaceA or interfaceB or both.
        InterfaceA.super.printSomething();
        InterfaceB.super.printSomething();
    }

    public static void main(String[] args){
        ImplClass implClass= new ImplClass();
        implClass.printSomething();
    }
}
