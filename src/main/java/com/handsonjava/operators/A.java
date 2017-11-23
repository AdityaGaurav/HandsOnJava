package com.handsonjava.operators;

public class A implements X {
}
interface X{

}
class B extends A{

}
class C extends A{

}

class Test{
    public static void main(String[] args){
        A a = new A();
        B b = new B();
        C c = new C();
        System.out.println(a instanceof A);
        System.out.println(b instanceof A);
        System.out.println(c instanceof A);
        System.out.println(c instanceof X);
    }
}
