package loadinganxmlfile;

import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class LoadingAnXMLFile {
    public static void main(String[] args) {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        try {
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document dom = builder.parse("cars.xml");
            Element doc = dom.getDocumentElement();
            NodeList ownersList = doc.getElementsByTagName("owner");

            for (int i = 0; i < ownersList.getLength(); i++) {
                Element owner = (Element) ownersList.item(i);

                if (owner.getAttribute("name").equals("Jane")) {
                    NodeList carsList = owner.getElementsByTagName("car");
                    PrintCars(carsList);
                }
            }

        } catch (ParserConfigurationException pce) {
            System.out.println(pce.getMessage());
        } catch (SAXException se) {
            System.out.println(se.getMessage());
        } catch (IOException ioe) {
            System.err.println(ioe.getMessage());
        }
    }

    private static void PrintCars(NodeList cars) {
        for (int i = 0; i < cars.getLength(); i++) {
            Element carNode = (Element) cars.item(i);
            Car carObj = new Car();
            carObj.color = carNode.getElementsByTagName("color").item(0).getTextContent();
            carObj.make = carNode.getElementsByTagName("make").item(0).getTextContent();
            carObj.model = carNode.getElementsByTagName("model").item(0).getTextContent();
            carObj.year = Integer.parseInt(carNode.getElementsByTagName("year").item(0).getTextContent());
            carObj.vin = carNode.getAttribute("vin");
            System.out.println(carObj.toString());
        }
    }

}
