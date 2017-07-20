package com.handsonjava.aboutclass;

/**
 * Created by adityag on 6/26/2017.
 */
public class StaticMember {
    public static int totalCount;
    public static int totalCount1;

    public StaticMember(int num) {
        totalCount1 = num;
    }

    public StaticMember() {

    }

    static {
        System.out.println("Static block : " + totalCount);
        totalCount = 3;
        System.out.println("Static block: Total Count: " + totalCount);
        totalCount = changeTotalCount();
        System.out.println("Static block: Total Count: changeTotalCount : " + totalCount);
    }

    private static int changeTotalCount() {
        return 5 * 3;
    }

    public static void main(String[] args) {
        StaticMember sm = new StaticMember(2);
        System.out.println(totalCount1);
        StaticMember smt = new StaticMember(4);
        System.out.println(totalCount1);
    }
}
