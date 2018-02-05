package com.handsonjava.threadpool;

public class RunnableBasics implements Runnable {

    @Override
    public void run() {
        int i = 0;
        while (i < 100) {
            System.out.println(i+this.getClass().getModifiers());
            ++i;
        }
    }
    public static void main(String[] args) throws InterruptedException {
        RunnableBasics runnableBasics = new RunnableBasics();
        RunnableBasics runnableBasics2 = new RunnableBasics();
        RunnableBasics runnableBasics3 = new RunnableBasics();
        Thread thread = new Thread(runnableBasics,"RunnableThread");
        Thread thread2 = new Thread(runnableBasics2,"RunnableThread");
        Thread thread3 = new Thread(runnableBasics3,"RunnableThread");
        thread.start();

            thread.interrupt();

        thread2.start();
//        thread2.join();
        thread3.start();
    }
}
