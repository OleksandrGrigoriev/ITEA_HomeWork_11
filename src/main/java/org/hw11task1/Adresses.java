package org.hw11task1;

import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;

public class Adresses {
    public static void create() {
        try {
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.newDocument();

            // root element
            Element rootElement = doc.createElement("adresses");
            doc.appendChild(rootElement);

            Element adress1 = doc.createElement("adress");
            rootElement.appendChild(adress1);

            Element city1 = doc.createElement("city");
            Attr attr = doc.createAttribute("size");
            attr.setValue("big");
            city1.setAttributeNode(attr);
            city1.appendChild(doc.createTextNode("Kiyv"));
            adress1.appendChild(city1);

            Element street1 = doc.createElement("street");
            street1.appendChild(doc.createTextNode("Lesi Ukrainky str."));
            adress1.appendChild(street1);

            Element house1 = doc.createElement("house");
            house1.appendChild(doc.createTextNode("40"));
            adress1.appendChild(house1);

            Element adress2 = doc.createElement("adress");
            rootElement.appendChild(adress2);

            Element city2 = doc.createElement("city");
            city2.appendChild(doc.createTextNode("Vinnitsya"));
            adress2.appendChild(city2);

            Element street2 = doc.createElement("street");
            street2.appendChild(doc.createTextNode("T. Shevchenka str."));
            adress2.appendChild(street2);

            Element house2 = doc.createElement("house");
            house2.appendChild(doc.createTextNode("112"));
            adress2.appendChild(house2);


            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(new File("src/main/java/org/hw11task1/adress.xml"));
            transformer.transform(source, result);

            // Output to console for testing
            StreamResult consoleResult = new StreamResult(System.out);
            transformer.transform(source, consoleResult);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
