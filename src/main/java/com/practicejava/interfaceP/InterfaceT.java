package com.practicejava.interfaceP;

public class InterfaceT implements InterfaceM, InterfaceMM {
    public static void main(String[] args){
        System.out.println(InterfaceM.printIt());
    }

    @Override
    public void printMessage(String s) throws IllegalArgumentException {

    }

    @Override
    public String printDefault() {
        return "IntefaceT";
    }


}
