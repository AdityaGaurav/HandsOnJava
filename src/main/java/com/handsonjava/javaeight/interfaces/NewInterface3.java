package com.handsonjava.javaeight.interfaces;

  interface NewInterface3 extends NewInterface, NewInterface2 {
    @Override
    default void newMethod(int count){
         System.out.println("NewInterface3"+ count);
    }

    public String toString();

}
