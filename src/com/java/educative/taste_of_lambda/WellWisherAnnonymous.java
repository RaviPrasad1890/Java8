package com.java.educative.taste_of_lambda;
/*
In the above example, we don’t need to create a class for each language. We can use an anonymous class,
and that does the trick for us in the example above. However,
don’t you think that this code is still cumbersome? Although the class is anonymous, we are still creating a class
 */
public class WellWisherAnnonymous {
    public static void wish(Greeting greeting) {
        greeting.greet();
    }

    public static void main(String args[]) {
        // We are passing an anonymous class object to the wish method.
        wish(new Greeting() {
            @Override
            public void greet() {
                System.out.println("Namaste");
            }
        });
    }
}
