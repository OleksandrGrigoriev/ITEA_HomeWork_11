package org.hw11task1;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

class UserHandler extends DefaultHandler {

    boolean city = false;

    String cityAttribute = null;
    boolean street = false;
    boolean house = false;
    static int counter = 1;

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes)
            throws SAXException {


        if (qName.equalsIgnoreCase("adress")) {
            System.out.println();
            System.out.println("Adress " + counter++);
        } else if (qName.equalsIgnoreCase("city")) {
            cityAttribute = attributes.getValue("size");
            city = true;
        } else if (qName.equalsIgnoreCase("street")) {
            street = true;
        } else if (qName.equalsIgnoreCase("house")) {
            house = true;
        }
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        if (qName.equalsIgnoreCase("adress")) {
            System.out.println("End Element :" + qName);
        }
    }

    @Override
    public void characters(char ch[], int start, int length) throws SAXException {

        if (city) {
            System.out.println("City: " + new String(ch, start, length));
            if(cityAttribute != null)
                System.out.println("Size: " + cityAttribute);
            city = false;
        } else if (street) {
            System.out.println("Street: " + new String(ch, start, length));
            street = false;
        } else if (house) {
            System.out.println("House: " + new String(ch, start, length));
            house = false;
        }
    }
}
