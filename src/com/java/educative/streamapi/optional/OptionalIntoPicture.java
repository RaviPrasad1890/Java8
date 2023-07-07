package com.java.educative.streamapi.optional;


import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Supplier;

public class OptionalIntoPicture {
    Map<Integer, Person> mapPerson = new HashMap<>();

    public Optional<Person> getPerson(int id) {
        return Optional.ofNullable(mapPerson.get(id));
    }

    public static void main(String[] args) {
        //Writing Supplier just for practice
        Supplier<Person> supplier = () -> new Person(1, "Supplier", 32);


        OptionalIntoPicture optionalIntoPicture = new OptionalIntoPicture();
        Optional<Person> personO = optionalIntoPicture.getPerson(1);
        Person person = null;
        if (personO.isPresent()) {
            person = personO.get();
        } else {
            person = supplier.get();
        }
        System.out.println(person.getName());
    }

    /*
    After looking at the above code, you might be wondering what the use of Optional<T>
    is if we need to check whether the value in the optional is null or not,
    using the isPresent() method.
    Why can’t we just use the method directly and do a null check instead of wrapping it into an Optional<T>?

    The benefit of Optional<T> is not that we are saved from applying a null check.
    The benefit is that Optional<T> class provides us lots of utility methods that we can apply to our wrapped objects.
 */
    public void waysOfCreatingOptional() {
        /*
        1) Using empty() method.
            We can create an empty optional using the empty() method.
             The optional created through empty() will contain a null value.
         */
            Optional<Person> optPer=Optional.empty();
        /*
        2) Using of() method
            We can create an Optional object that has a non-null value using of() method.
            If we create an Optional using the of() method and the value is null,
            then it will throw a Null Pointer Exception.
         */
        Person person= new Person(1,"Ravi",32);
        Optional<Person> optPerson=Optional.of(person);

        /*
        3) Using ofNullable() method
            If while creating the Optional, you are not sure if the value is null or not null, then use the ofNullable() method. If a non-null value is passed in Optional.ofNullable(),
            then it will return the Optional, containing the specified value. Otherwise, it will return an empty Optional.
         */

        Optional<Person> op= Optional.ofNullable(mapPerson.get(1));
    }
}
