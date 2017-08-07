package com.handsonjava.innerclasses;

public class NonStaticInnerClass {
    private int[] subjectCode;
    String classTeacher;

    public NonStaticInnerClass() {
        subjectCode = new int[]{101,102,103,104};
    }

    class InnerClass {
        int subCode;
        String name;
        int rollNumber;

        public InnerClass() {

        }

        public void setRollNumber(int rollNumber) {
            this.rollNumber = rollNumber;
        }

        public InnerClass(String name, int subCode, int rollNumber) {
            this.name = name;
            this.subCode = subCode;
            this.rollNumber = rollNumber;
        }

        public String getName() {
            return name;
        }

        public int getRollNumber() {
            return rollNumber;
        }

        public int getSubCode() {
            return subCode;
        }

        public void setSubCode(int subCode) {
            this.subCode = subCode;
        }

        public void setName(String name) {
            this.name = name;
        }

//        @Override
        public void overrideMe() {

        }

        public void printSubject() {
            for (int i : subjectCode) {
                System.out.println(i);
            }
        }
//        public static void printDetailsOfStudent(){
//
//        }
    }

    public void printName() {
        System.out.println(new InnerClass().getName());
    }

    public void overrideMe() {
        System.out.println("Outer");
    }
}
