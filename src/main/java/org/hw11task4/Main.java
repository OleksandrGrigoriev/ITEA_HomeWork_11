package org.hw11task4;

public class Main implements Runnable{
    public static void main(String[] args) throws InterruptedException {

        Thread mainThread = new Thread(new Main());
        mainThread.setName("main");
        Thread firstThread = new Thread(new Main());
        firstThread.setName("first");
        Thread secondThread = new Thread(new Main());
        secondThread.setName("second");

        mainThread.start();
        firstThread.start();
        secondThread.start();

        mainThread.join();
        firstThread.join();
        secondThread.join();

        System.out.println("Some message");
    }

    @Override
    public void run() {
        System.out.println("Thread " + Thread.currentThread().getName() + " stopped working");
    }
}
