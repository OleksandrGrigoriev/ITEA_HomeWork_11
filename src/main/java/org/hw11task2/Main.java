package org.hw11task2;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class Main {
    public static void main(String[] args) {
        AddressBook adressBook = new AddressBook();

        adressBook.add(new Address("Kiyv", "Lesi Ukrayinky str.", 40));
        adressBook.add(new Address("Cherkassy", "Pryportova str.", 31));

        try {
            File output = new File("E:\\IteaJavaPro\\homework11\\src\\main\\java\\org\\hw11task2\\output.xml");

            JAXBContext jaxbContext = JAXBContext.newInstance(AddressBook.class);
            Marshaller marshaller = jaxbContext.createMarshaller();

            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

            marshaller.marshal(adressBook, output);
            marshaller.marshal(adressBook, System.out);

            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
            adressBook = (AddressBook)unmarshaller.unmarshal(output);
            System.out.println(adressBook);
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}
