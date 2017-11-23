package com.handsonjava.iproblems.interview1;

import java.util.ArrayList;
import java.util.List;

public class UniqueString {

    public static boolean isUniqueChars(String str) {
        int checker = 0;
        for (int i = 0; i < str.length(); ++i) {
            int val = str.charAt(i) - 'a';
            if ((checker & (1 << val)) > 0)
                return false;
            checker |= (1 << val);
        }
        return true;
    }
    //for the asccii character set you can represent the 256bits in 4 longs:
    public static boolean isUniqueCharsInString(String str) {
        long checker1 = 0;
        long checker2 = 0;
        long checker3 = 0;
        long checker4 = 0;
        for (int i = 0; i < str.length(); ++i) {
            int val = str.charAt(i);
            int toCheck = val / 64;
            val %= 64;
            switch (toCheck) {
                case 0:
                    if ((checker1 & (1L << val)) > 0) {
                        return false;
                    }
                    checker1 |= (1L << val);
                    break;
                case 1:
                    if ((checker2 & (1L << val)) > 0) {
                        return false;
                    }
                    checker2 |= (1L << val);
                    break;
                case 2:
                    if ((checker3 & (1L << val)) > 0) {
                        return false;
                    }
                    checker3 |= (1L << val);
                    break;
                case 3:
                    if ((checker4 & (1L << val)) > 0) {
                        return false;
                    }
                    checker4 |= (1L << val);
                    break;
            }
        }
        return true;
    }

    //following code to generate the body of a similar method for unicode characters
    static void generate() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 1024; i++) {
            sb.append(String.format("long checker%d = 0;%n", i));
        }
        sb.append("for (int i = 0; i < str.length(); ++i) {\n"
                + "int val = str.charAt(i);\n"
                + "int toCheck = val / 64;\n"
                + "val %= 64;\n"
                + "switch (toCheck) {\n");
        for (int i = 0; i < 1024; i++) {
            sb.append(String.format("case %d:\n"
                    + "if ((checker%d & (1L << val)) > 0) {\n"
                    + "return false;\n"
                    + "}\n"
                    + "checker%d |= (1L << val);\n"
                    + "break;\n", i, i, i));
        }
        sb.append("}\n"
                + "}\n"
                + "return true;");
        System.out.println(sb);
    }

    public static void main(String[] args) {
        List<int[]> arg = new ArrayList<>();
        int[] ints = new int[4];
        ints[3] =4;
        System.out.println(ints[3]);
        System.out.println(isUniqueChars("nadcvxsidtya"));
    }
}
