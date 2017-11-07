package com.handsonjava.datatypes;

public class Child2 extends Parent {
    public void print1(){
        System.out.println("Child");
    }

    public static void main(String[] args){
        Parent parent1 = new Child();
        Parent parent = new Child2();
        parent = (Child)parent;
        ((Child) parent).print();


    }
}
