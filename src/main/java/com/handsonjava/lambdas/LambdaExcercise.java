package com.handsonjava.lambdas;

import com.sun.istack.internal.NotNull;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class LambdaExcercise {
//    public static void printConditionally(List<Person> people ,Condition condition){
//        for(Person p: people){
//            if(condition.test(p))
//                System.out.println(p.getFirstName()+" " + p.getLastName()+" " + p.getAge());
//        }
//    }
    public static void printConditionally(@NotNull List<Person> people , Predicate<Person> predicate, Consumer<Person> consumer){
        for(Person p: people){
            if(predicate.test(p))
//                System.out.println(p.getFirstName()+" " + p.getLastName()+" " + p.getAge());
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
        people.sort((p1,p2)-> p1.getLastName().compareTo(p2.getLastName()));
        printConditionally(people,p -> true, p -> System.out.println(p.getFirstName()+" " + p.getLastName()+" " + p.getAge()));
        printConditionally(people,p -> p.getLastName().startsWith("C"),p -> System.out.println(p.getFirstName()+" " + p.getLastName()+" " + p.getAge()));

    }
    public static void main(String[] args) {
//        List<Person> people = Arrays.asList(
//                new Person("Charles", "Dickenes", 60),
//                new Person("Lewis", "Carroll", 60),
//                new Person("Thomas", "Carlyle", 60),
//                new Person("Charlotte", "Bronte", 60),
//                new Person("Matthew", "Arnold", 60)
//        );
        // Step 1: Sort list by last name
//        people.sort((o1, o2) -> {
//           @NotNull Person p1 =null , p2 = null;
//            if ( o1 instanceof Person)
//                p1 = (Person) o1;
//            if (o2 instanceof Person)
//                p2 = (Person) o2;
//            if (p1.getLastName().equalsIgnoreCase(p2.getLastName())) {
//                return p1.getLastName().compareTo(p2.getLastName());
//            }
//            return p1.getLastName().compareTo(p2.getLastName()
//            );});

//        people.sort((o1,o2)-> o1.getLastName().compareTo(o2.getLastName()));
//        System.out.println(people+"\n");

        //Step 2: Create a method that prints all element in the list
//        printConditionally(people, p -> true);
//        for(Person p: people){
//            System.out.println(p.getFirstName()+" " + p.getLastName()+" " + p.getAge());
//        }
        // Step 3: Create a method that prints all people that have last name beginning with C
//        printConditionally(people,p -> p.getLastName().startsWith("C"));
//        for(Person p: people){
//            if(p.getLastName().startsWith("C"))
//            System.out.println(p.getFirstName()+" " + p.getLastName()+" " + p.getAge());
//        }
     doAllUsingPredefinedInterface();
    }
}

interface Condition{
    boolean test(Person p);
}
