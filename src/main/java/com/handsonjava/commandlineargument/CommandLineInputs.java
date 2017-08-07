package com.handsonjava.commandlineargument;

/**
 * Created by adityag on 2/26/17.
 */
public class CommandLineInputs {

    public static void main(String[] args){
        System.out.println("Enter First Number");
        int first = Integer.parseInt(args[0]);
        System.out.println("Enter second Number");
        int second = Integer.parseInt(args[1]);

        for(String s : args){
            System.out.println(s);
        }
    }
}
