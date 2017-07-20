package com.handsonjava.oops.inheritance;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by adityag on 7/17/2017.
 */
public class Test {

    public static void main(String[] arfgs) {
        P p1 = new C(),
                p2 = new C(),
                p3 = new C2(),
                p4 = new C2();
        List<P> pObj = new ArrayList<P>();
        pObj.add(p1);
        pObj.add(p2);
        pObj.add(p3);
        pObj.add(p4);

        for (P p : pObj) {
            if (p instanceof C) {
                C a = (C) p;
                System.out.println(a.draw());
                System.out.println(a.draw("Adi"));
                System.out.println(a.pattern());
                System.out.println("====================");
            }
        }
    }
}
