package com.handsonjava.patterns;

public class TrianglePattern {
    public static void drawPattern(int numberOfRow) {
        for (int i = 0; i < numberOfRow; i++) {
            for (int j = 0; j < numberOfRow; j++) {
                if (i == 0 || i == numberOfRow - 1) {
                    System.out.print("*");
                } else {
                    if (j == 0 || j == numberOfRow - 1) {
                        System.out.print("*");
                    } else{
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }

    public static void drawTriangle(){
//        for(int i= 0 )
    }
    public static void main(String[] args) {
        drawPattern(15);
    }
}
