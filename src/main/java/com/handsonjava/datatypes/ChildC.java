package com.handsonjava.datatypes;

public class ChildC extends ParentC {
    public void print(){
        System.out.println("CHILDC class");
    }
    public static void main(String[] args){
        PInterface pInterface = new ChildC();
        P2Inteface p2Inteface=null;
        if(pInterface instanceof ChildC) {
             p2Inteface = (P2Inteface) pInterface;
        }
        p2Inteface.print();
    }
}
