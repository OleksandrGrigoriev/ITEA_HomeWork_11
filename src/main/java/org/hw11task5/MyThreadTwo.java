package org.hw11task5;

public class MyThreadTwo extends Thread {
    MyThreadOne t1;

    public void run() {
        System.out.println("Thread Two is running...");
        try {
            t1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Thread Two stops running...");
    }
}
