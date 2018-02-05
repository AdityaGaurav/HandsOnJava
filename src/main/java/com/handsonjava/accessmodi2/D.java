package com.handsonjava.accessmodi2;

import com.handsonjava.accessmodi.A;

public class D {
    public static void main(String[] args) {
        C c = new C();
        System.out.println(c.a);
        A z = new A();
        System.out.println(z.a);
        Integer i =20;
        int i2 =i;
        String s = String.valueOf(4);
        i2 = Integer.valueOf(s);

    }
}
