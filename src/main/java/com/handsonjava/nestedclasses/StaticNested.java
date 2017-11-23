package com.handsonjava.nestedclasses;



public class StaticNested {
    private static int count;
    private int number;
    public String name;

    private void m1() {

    }

    private static void m2() {

    }

    static class StaticNested2 {
        int totalNumber;

        //Constructor
        StaticNested2(int n) {
            this.totalNumber = n;
        }

        private static void m6() {
            int n = count;
        }
         static void m7() {
            int n = count;
        }

        public void m3() {
            System.out.println("m3");
        }
    }

    class NonStaticInner{

    }

    public static void main(String[] args){
        StaticNested2 staticNested2 = new StaticNested2(5);
        staticNested2.m3();
        StaticNested2.m7();
    }

}
