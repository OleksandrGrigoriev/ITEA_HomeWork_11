package org.hw11task5;

public class ThreadTwo extends Thread {
    Object objA;
    Object objB;
    public ThreadTwo(Object objA, Object objB) {
        this.objA = objA;
        this.objB = objB;
    }
    public void run() {
        synchronized (objB) {
            System.out.println("B is synchronized from " + Thread.currentThread().getName());
            synchronized (objA) {
                System.out.println("A is synchronized from " + Thread.currentThread().getName());
            }
        }
    }
}
