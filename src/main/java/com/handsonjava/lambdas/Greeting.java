package com.handsonjava.lambdas;

@FunctionalInterface
// FunctionalInterface is only for informing the compiler to enforce single abstract method inside interface.
public interface Greeting {
    /*
    Conceptually, a functional interface has exactly one abstract method.
    Since default methods have an implementation, they are not abstract.
    Since default methods are not abstract you’re free to add default methods
    to your functional interface as many as you like.
     */
    void perform();
    /*
    Below is a valid functional interface even though it declared two abstract methods.
    Why? Because one of these abstract methods “equals()” which has signature equal to public method in Object class.
     */
    @Override
    public String toString();  //Overridden from Object class
    @Override
    public boolean equals(Object obj); //Overridden from Object class
}
