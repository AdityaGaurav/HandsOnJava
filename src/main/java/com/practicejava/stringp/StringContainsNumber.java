package com.practicejava.stringp;

import java.util.Objects;

public class StringContainsNumber {
    static boolean isStringContainsNumber(String input) {
        Objects.requireNonNull(input);
        if (input.trim().length() == 0) {
            return false;
        }
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) >= 48 & input.charAt(i) <= 57) {
                return true;
            }
        }
        return false;
    }

    private static String getTheNumberFromTheString(String input) {
        Objects.requireNonNull(input);
        if (input.trim().length() == 0) {
            throw new IllegalArgumentException("");
        }
        StringBuilder stringBuilder = new StringBuilder("");
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) >= 48 & input.charAt(i) <= 57) {
                stringBuilder.append(input.charAt(i));
            }
        }
        return stringBuilder.toString();
    }

    private static int getTheSumOfNumber(String input) {
        Objects.requireNonNull(input);
        if (input.trim().length() == 0) {
            throw new IllegalArgumentException("");
        }
        StringBuilder stringBuilder = new StringBuilder("");
        int sumOfTheDigit = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) >= 48 & input.charAt(i) <= 57) {
                stringBuilder.append(input.charAt(i));
            } else {
                if (stringBuilder.toString().length() != 0) {
                    sumOfTheDigit = sumOfTheDigit + Integer.parseInt(stringBuilder.toString());
                    stringBuilder.setLength(0);
                }
            }
        }
        return sumOfTheDigit + Integer.parseInt(stringBuilder.toString());
    }

    public static void main(String[] args) {
        System.out.println(isStringContainsNumber("adi"));
        System.out.println(getTheNumberFromTheString("Adi123hj786"));
        System.out.println(getTheSumOfNumber("Ad12t34y77--7"));
    }
}
