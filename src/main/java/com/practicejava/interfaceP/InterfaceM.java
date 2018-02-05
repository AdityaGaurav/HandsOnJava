package com.practicejava.interfaceP;

public interface InterfaceM {
    public static final int i = 20;

    public abstract void printMessage(String s) throws IllegalArgumentException;

    public static String printIt() {
        return "InterfaceM";
    }

    default public String printDefault() {
        return "IntefaceM";
    }
}
