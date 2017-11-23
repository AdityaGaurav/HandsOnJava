package com.handsonjava.innerclasses;

public class StaticNestedClass {
    int contactNum = 0;
    private static int age;

    public void access() {
        InnerStaticClass innerStaticClass = new InnerStaticClass();
        innerStaticClass.getDetails();
        InnerStaticClass.printDetails();
    }

    public static void justAccsess() {

    }

    //Static class
    static class InnerStaticClass {
        static String fullName = "Aditya Gaurav";
        int mobNumber;
        StaticNestedClass staticNestedClass = new StaticNestedClass();

        public InnerStaticClass() {
            mobNumber = 999999;
        }

        public InnerStaticClass(int mobNumber) {
            this.mobNumber = mobNumber;
        }

        public static void printDetails() {
            justAccsess();
        }

        public void getDetails() {
            System.out.println(staticNestedClass.contactNum);
            System.out.println(age);
        }
    }

    public static void main(String[] args) {
        StaticNestedClass.InnerStaticClass innerStaticClass = new StaticNestedClass.InnerStaticClass();
        innerStaticClass.getDetails();
    }
}
