package com.handsonjava.aboutclass;

public class ThisKey extends SuperKey {
    int id;
    int numberOfOffices = 99;
    String address;

    ThisKey(){
        this("","",1);
    }

    ThisKey(String firstName, String lastName, int id) {
        super(firstName, lastName);
        this.id = id;
    }

    public void printDetails() {
        System.out.println(super.numberOfOffices);
        System.out.println(this.numberOfOffices);
        System.out.println(numberOfEmployyees);
        super.printName();
        System.out.println(this.id);
    }


public static void main(String[] args){
        SuperKey superKey =new SuperKey();
        ThisKey thisKey2 = (ThisKey) superKey;
    System.out.println("ThisKey: "+thisKey2.numberOfOffices);
    System.out.println("superKey: "+superKey.numberOfOffices);
        ThisKey thisKey = new ThisKey("Aditya","Gaurav",101);
        thisKey.printDetails();
        ThisKey.printMe();
        System.out.println(ThisKey.numberOfEmployyees);
}
}
