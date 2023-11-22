package org.hw11task5;

public class Main {
    public static void main(String[] args) {
        Object objA = new Object();
        Object objB = new Object();

        ThreadOne t1 = new ThreadOne(objA, objB);
        ThreadTwo t2 = new ThreadTwo(objA, objB);

        t1.start();
        t2.start();
    }
}
