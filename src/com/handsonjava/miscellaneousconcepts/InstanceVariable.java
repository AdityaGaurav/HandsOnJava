package com.handsonjava.miscellaneousconcepts;

/**
 * Created by adityag on 2/9/17.
 */
public class InstanceVariable {

    int a;
    InstanceVariable[] ary;
    InstanceVariable ary1;

    public static void main(String[] args){
        InstanceVariable i =new InstanceVariable();
        System.out.println(i.ary);
        System.out.println(i.ary1);
    }

}
