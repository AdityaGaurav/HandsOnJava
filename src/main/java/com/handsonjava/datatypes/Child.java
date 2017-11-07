package com.handsonjava.datatypes;

import com.handsonjava.constructor.ParentCons;

public class Child extends Parent {

    public void print(){
        System.out.println("Child");
    }
    public static void main(String[] args){
        Parent parent = new Child();
        Child child = (Child) parent;
        Parent parent1 = child;
        Parent parent2 = new Parent();
        Child child1 = (Child) parent2;
    }
}
