package com.handsonjava.lambdas;

import com.sun.istack.internal.NotNull;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class LambdaExcercise {

    public static void printConditionally(List<Person> people , Predicate<Person> predicate, Consumer<Person> consumer){
        for(Person p: people){
            if(predicate.test(p))
                consumer.accept(p);
        }
    }

    public static void doAllUsingPredefinedInterface(){
        List<Person> people = Arrays.asList(
                new Person("Charles", "Dickenes", 60),
                new Person("Lewis", "Carroll", 60),
                new Person("Thomas", "Carlyle", 60),
                new Person("Charlotte", "Bronte", 60),
                new Person("Matthew", "Arnold", 60)
        );
//        people.sort((p1,p2)-> p1.getLastName().compareTo(p2.getLastName()));
//        printConditionally(people,p -> true, p -> System.out.println(p.getFirstName()+" " + p.getLastName()+" " + p.getAge()));
        printConditionally(people,p -> p.getLastName().startsWith("C"),p -> System.out.println(p.getFirstName()+" " + p.getLastName()+" " + p.getAge()));

    }
    public static void main(String[] args) {
     doAllUsingPredefinedInterface();
    }
}

