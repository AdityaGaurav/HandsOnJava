package com.handsonjava.oops.inheritance;

/**
 * Created by adityag on 7/17/2017.
 */
public class C2 extends P {
    public C2() throws Exception {
    }

    public String draw(){
        return "Draw Using C";
    }
    public String pattern(){
        return "pattern C";
    }

    String draw(String s){
        return s+" C";
    }
}
