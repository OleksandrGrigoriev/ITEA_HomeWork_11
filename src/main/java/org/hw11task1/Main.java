package org.hw11task1;

public class Main {
    public static void main(String[] args) {
        Adresses.create();
        MySAXParcer.parseFile("src/main/java/org/hw11task1/adress.xml");
    }
}
