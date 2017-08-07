package com.handsonjava.oops.inheritance;

/**
 * Created by adityag on 7/10/2017.
 */
public class C extends P {

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
