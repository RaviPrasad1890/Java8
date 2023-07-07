package com.java.educative.taste_of_lambda;

public class WellWisher {
    public static void wish(Greeting greeting) {
        greeting.greet();
    }

    public static void main(String args[]) {
        Greeting hindiGreeting = new HindiGreeting();
        wish(hindiGreeting);  // Passing an object of HindiGreeting.

        Greeting englishGreeting = new EnglishGreeting();
        wish(englishGreeting);  // Passing an object of EnglishGreeting.
    }
}

/*
This is a classic object-oriented programming example. Now, what if we want our WellWisher class
to greet in all the languages available?

Do we need to create a class for each language, e.g.,
SpanishGreeting, FrenchGreeting, etc?

Isn’t it possible that we don’t create any class and
just send a function to the wish(Greeting greeting) method?
 */