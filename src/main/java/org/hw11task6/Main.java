package org.hw11task6;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        JacksonParser.parseJson("https://bank.gov.ua/NBU_Exchange/exchange?json");
    }
}
