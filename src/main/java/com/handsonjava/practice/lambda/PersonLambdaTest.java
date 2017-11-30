package com.handsonjava.practice.lambda;

import java.util.Map;
import java.util.TreeMap;

public class PersonLambdaTest {
    static void sortByGivenCondition(){

    }
    static void sortOnFirstName() {
        Map<Person, Integer> personIntegerMap = new TreeMap<>(
                (o1,o2)-> o1.getFirstName().compareTo(o2.getFirstName()));
        personIntegerMap.put(new Person("ya","Gaurav","T"),101);
        personIntegerMap.put(new Person("tya","Gaurav","T"),101);
        personIntegerMap.put(new Person("itya","Gaurav","T"),101);
        personIntegerMap.put(new Person("itya","Gaurav","T"),102);
        for(Person p : personIntegerMap.keySet()){
            System.out.println(p.getFirstName()+" : "+personIntegerMap.get(p));
        }
    }
    public static void main(String[] args){
        sortOnFirstName();
    }
}