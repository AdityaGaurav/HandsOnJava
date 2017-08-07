package com.handsonjava.innerclasses;

public class InnerClassTest {
    public static void main(String[] args){
        NonStaticInnerClass out = new NonStaticInnerClass();
        NonStaticInnerClass.InnerClass in = out.new InnerClass();
        in.getRollNumber();

        StaticNestedClass.InnerStaticClass innerStaticClass = new StaticNestedClass.InnerStaticClass();
    }
}
