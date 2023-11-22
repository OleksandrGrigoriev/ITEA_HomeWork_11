package org.hw11task5;

public class ThreadOne extends Thread {
    Object objA;
    Object objB;
    public ThreadOne(Object objA, Object objB) {
        this.objA = objA;
        this.objB = objB;
    }
    public void run() {
        synchronized (objA) {
            System.out.println("A is synchronized from " + Thread.currentThread().getName());
            synchronized (objB) {
                System.out.println("B is synchronized from " + Thread.currentThread().getName());
            }
        }
    }
}
