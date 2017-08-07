package com.handsonjava.lambdas;

public class BasicOfLambdaTest {
    //    public void printLambdaExpression((String var) ->
//        System.out.println("My first lambda expression" + var);
//    };){
//
//    }
//
    public static void main(String[] args) {
//         result = (var) -> {
//            System.out.println("My first lambda expression" + var);
//         };
//    }
        Greeting greet = new IndianGreeting();
        greet.perform();
        Greeting greeting = ()-> System.out.println("Method Implementation using lambda expression");
        greeting.perform();
        System.out.println("=======================");
        Greeter greeter = new Greeter();
        greeter.greet(greeting);
        greeter.greet(greet);
        greeter.greet(()->System.out.println("Inline lambda expression"));
    }
}
