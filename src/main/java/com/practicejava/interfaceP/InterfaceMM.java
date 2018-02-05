package com.practicejava.interfaceP;

public interface InterfaceMM {
    default String printDefault(){
      return "IntefaceMM";
    }
    public static String printIt() {
        return "InterfaceM";
    }
}
