package com.handsonjava.operators;

public class BranchingStatement {
    public static void main(String[] args) {
        for (int i = 0; i < 19; i++) {
            if (i == 8) {
                System.out.println(i);
                continue;
            }
            if (i < 9) {
                System.out.println(i);
            }
        }
    }
}
