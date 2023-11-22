package org.hw11task5;

public class Main {
    public static void main(String[] args) {
        Object objA = new Object();
        Object objB = new Object();

        Thread t1 = new Thread("ThreadOne") {
            public void run() {
                synchronized (objA) {
                    System.out.println("A is synchronized from " + Thread.currentThread().getName());
                    synchronized (objB) {
                        System.out.println("B is synchronized from " + Thread.currentThread().getName());
                    }
                }
            }
        };

        Thread t2 = new Thread("ThreadTwo") {
            public void run() {
                synchronized (objB) {
                    System.out.println("B is synchronized from " + Thread.currentThread().getName());
                    synchronized (objA) {
                        System.out.println("A is synchronized from " + Thread.currentThread().getName());
                    }
                }
            }
        };

        t1.start();
        t2.start();

    }
}
