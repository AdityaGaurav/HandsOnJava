package com.handsonjava.bitwiseopmanipulation;

public class BinaryConversion {
    public static void convertToBinary(int n) {
        int v = 1;
        while (v <= n / 2) {
            v *= 2;
        }
        while (v > 0) {
            if (v > n) {
                System.out.print("0");
            } else {
                System.out.print("1");
                n -= v;
            }
            v /= 2;
        }
    }
    public static void main(String[] args){
        convertToBinary(127);
    }
}
