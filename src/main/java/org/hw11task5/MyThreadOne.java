package org.hw11task5;

public class MyThreadOne extends Thread {
    MyThreadTwo t2;

    public void run() {
        System.out.println("Thread One is running...");
        try {
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Thread One stops running...");
    }
}
