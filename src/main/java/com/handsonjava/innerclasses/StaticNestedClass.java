package com.handsonjava.innerclasses;

public class StaticNestedClass {
    static class InnerStaticClass{
        static String fullName ="Aditya Gaurav";
        int mobNumber;
        public InnerStaticClass(){
            mobNumber = 999999;
        }
        public InnerStaticClass(int mobNumber){
            this.mobNumber = mobNumber;
        }
    }
}
