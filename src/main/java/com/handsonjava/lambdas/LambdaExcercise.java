package com.handsonjava.lambdas;

import java.util.Arrays;
import java.util.List;

public class LambdaExcercise {

    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Charles", "Dickenes", 60),
                new Person("Lewis", "Carroll", 60),
                new Person("Thomas", "Carlyle", 60),
                new Person("Charlotte", "Bronte", 60),
                new Person("Matthew", "Arnold", 60)
        );
        // Step 1: Sort list by last name
        //Step 2: Create a method that prints all element in the list
        // Step 3: Create a method that prints all people that have last name beginning with C
    }
}
