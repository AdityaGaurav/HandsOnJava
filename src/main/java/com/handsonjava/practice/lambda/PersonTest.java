package com.handsonjava.practice.lambda;

import java.util.Map;
import java.util.TreeMap;

public class PersonTest {
    static void sortOnFirstName() {
        FirstNameComparator firstNameComparator =new FirstNameComparator();
        Map<Person, Integer> personIntegerMap = new TreeMap<>(firstNameComparator);
        personIntegerMap.put(new Person("ya","Gaurav","T"),101);
        personIntegerMap.put(new Person("tya","Gaurav","T"),101);
        personIntegerMap.put(new Person("itya","Gaurav","T"),101);
        personIntegerMap.put(new Person("itya","Gaurav","T"),102);
        for(Person p : personIntegerMap.keySet()){
            System.out.println(p.getFirstName()+" : "+personIntegerMap.get(p));
        }
    }
    static void sortOnLastName() {
        LastNameComparator lastNameComparator = new LastNameComparator();
        Map<Person, Integer> personIntegerMap = new TreeMap<>(lastNameComparator);
        personIntegerMap.put(new Person("ya","xGaurav","xGaurav"),101);
        personIntegerMap.put(new Person("tya","bGaurav","bGaurav"),101);
        personIntegerMap.put(new Person("itya","BGaurav","BGaurav"),101);
        personIntegerMap.put(new Person("itya","kGaurav","kGaurav"),102);
        for(Person p : personIntegerMap.keySet()){
            System.out.println(p.getLastName()+" : "+personIntegerMap.get(p));
        }
    }
    static void sortOnNormal() {
        Map<Person, Integer> personIntegerMap = new TreeMap<>();
        personIntegerMap.put(new Person("ya","xGaurav","xGaurav"),101);
        personIntegerMap.put(new Person("tya","bGaurav","bGaurav"),101);
        personIntegerMap.put(new Person("itya","BGaurav","BGaurav"),101);
        personIntegerMap.put(new Person("itya","kGaurav","kGaurav"),102);
        for(Person p : personIntegerMap.keySet()){
            System.out.println(p.getLastName()+" : "+personIntegerMap.get(p));
        }
    }
    public static void main(String[] args){
        sortOnNormal();
    }

}
