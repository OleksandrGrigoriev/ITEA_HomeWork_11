package org.hw11task6;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class JacksonParser {
    public static void parseJson(String url) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();

        CurrencyRate[] currencyRates = objectMapper.readValue(new URL(url), CurrencyRate[].class);

        for (CurrencyRate currencyRate : currencyRates) {
            System.out.println(currencyRate);
        }

        String jsonString = objectMapper.writerWithDefaultPrettyPrinter()
                .writeValueAsString(currencyRates);

        Files.write(Paths.get("src/main/java/org/hw11task6/currency.json"),
                jsonString.getBytes(), StandardOpenOption.CREATE);
    }
}
