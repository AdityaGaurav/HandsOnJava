package com.handsonjava.lambdas;

public class RunnableLambdaExample {
    public static void main(String[] args) {
        Thread myThread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Printed inside Runnable");
            }
        });
        // Note: This doesn't start a new thread. For that, I should have actually used Thread.start()
        myThread.run();

        // Remember, this works because Runnable interface has a single method. If it had more than one method, you could not have written a lambda function of that type.
        Thread myThreadLambda = new Thread(() -> System.out.println("Printed inside Lambda Runnable"));
        myThreadLambda.run();
    }
}
