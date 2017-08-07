package com.handsonjava.controlstatements;

import java.util.Scanner;

/**
 * Created by adityag on 2/4/17.
 */
public class SwitchCase {

    public static void implementSwitchCase() {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter input");
        String input = scn.next();
//int, byte, short, long, char (Java 5 also allows Integer, Byte, Short, Long, Character, Enum, and String).
        switch (input) {

            case "1":
                System.out.println(input);
                break;
            case "2":
                System.out.println(input);
                break;
            case "":

            case "100":case "101":
            case "110":
                System.out.println(input);
                break;
            default:
                System.out.println("provide correct input");
                break;

        }

    }

    public static void main(String[] args){
        implementSwitchCase();
    }
}
