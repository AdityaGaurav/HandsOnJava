package com.handsonjava.lambdas;

public class Greeter {
    public void greet(Greeting greeting){
        greeting.perform();
    }
    public static void main(String[] args){
        Greeter greeter = new Greeter();
        Greeting greeting = new IndianGreeting();
        IndianGreeting ind = new IndianGreeting();
        greeter.greet(greeting);
        greeter.greet(ind);
    }
}
