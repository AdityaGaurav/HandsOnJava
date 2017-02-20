package com.handsonjava.oops;

/**
 * Created by adityag on 2/6/17.
 */
public class Encapsulators {

   private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {

        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printString(){
        String s1 = null;
        System.out.println(s1+" Aditya");
    }


    public static void main(String[] args){
        Encapsulators e1 = new Encapsulators();
        Encapsulators e2 = new Encapsulators();
        e1.setId(1);
        e1.setName("Aditya");
        System.out.println(e1.getId());
        System.out.println(e2.getName());
        e1.printString();

    }
}
