package com.java.educative.streamapi.optional;

import org.w3c.dom.ls.LSOutput;

import java.util.Optional;
import java.util.function.BiFunction;

/*
Methods in Optional:
1) isPresent()
2) ifPresent(Consumer<? super T> consumer): When ifPresent() is called, if a value is present,
the specified consumer is invoked with the value. Otherwise, nothing happens.
3) get()
4) orElse(T other): This method returns the value present in the optional.
If no value is present, then a default value provided as a parameter is returned.
5) orElseGet(Supplier<? extends T> other): This method returns the value present in the optional.
If no value is present, then the value calculated from the supplier provided as a parameter is returned.
6) orElseThrow(Supplier<? extends T> other): This method returns the value present in the optional.
If no value is present, then it throws the exception created by the provided supplier.
7) Optional<T> filter(Predicate<? super T> predicate): The filter() method is used to check if the value in our optional matches a particular condition.
If yes, then the optional with the value is returned. Otherwise, an empty optional is returned.
8) map(Function<? super T, ? extends U> mapper): As per Java docs, “if a value is present,
apply the provided mapping function to it, and if the result is non-null,
return an Optional describing the result. Otherwise, return an empty Optional.”
9) flatMap(Function<? super T, Optional<U>> mapper)
 */
public class OptionalDepthOne {

    public static String getDefaultValue(){
        return "Default";
    }

    public Optional<Person> getPerson(){
        BiFunction<Integer,String,Person> biFunction=
                (i,s)->new Person(i,s,s.length());
        return Optional.of(biFunction.apply(1,"TooteyAgarSagarNayaSagarKoiLele"));
    }

    public static void main(String[] args){

        OptionalDepthOne obj= new OptionalDepthOne();
        Optional<Person> optPerson=obj.getPerson();
        //isPresent
        if(optPerson.isPresent()){
            System.out.println("Name: "+optPerson.get().getName());
        }
        //ifPresent
        optPerson.ifPresent(c-> System.out.println("Age: "+c.getAge()));

        //orElse(T other)
        Optional<String> optionalStr=Optional.empty();
        System.out.println(optionalStr.orElse("Default String"));
        Optional<String> optionalS=Optional.ofNullable("Ravi");
        System.out.println(optionalS.orElse("Default String"));

        //orElseGet(Supplier<? extends T> other)
        System.out.println(optionalStr.orElseGet(OptionalDepthOne::getDefaultValue));
        System.out.println(optionalStr.orElseGet(()-> "Default"));

        //orElseThrow(Supplier<? extends T> other)
        try{
            System.out.println(optionalStr.orElseThrow(()->new Exception("Resource Not Found")));
        }catch(Exception e){
            System.out.println(e.getMessage());
        }

        //Optional<T> filter(Predicate<? super T> predicate
        Optional<String> optionalFruit= Optional.ofNullable("Orange");
        System.out.println(optionalFruit.filter(s->s.equals("Orange")));
        System.out.println(optionalFruit.filter(s->s.equals("Apple")));

        //map(Function<? super T, ? extends U> mapper)
        Optional<Person> optionalPerson=obj.getPerson();
        optionalPerson.map(p->p.getName()).
                filter(a->a.length()>5).
                ifPresent(System.out::println);

    }

}
