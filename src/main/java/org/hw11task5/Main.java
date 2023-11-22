package org.hw11task5;

public class Main {
    public static void main(String[] args) {
        MyThreadOne threadOne = new MyThreadOne();
        MyThreadTwo threadTwo = new MyThreadTwo();

        threadOne.t2 = threadTwo;
        threadTwo.t1 = threadOne;

        threadOne.start();
        threadTwo.start();
    }
}
