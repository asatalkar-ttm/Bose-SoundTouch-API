package remote;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.ByteArrayInputStream;

public class ParseXml {

    public void parse(String xml) throws Exception{

        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        DocumentBuilder db = dbf.newDocumentBuilder();
        ByteArrayInputStream bis = new ByteArrayInputStream(xml.getBytes());
        Document doc = db.parse(bis);
        Node n = doc.getFirstChild();
        NodeList nl = n.getChildNodes();
        Node an,an2;

        for (int i=0; i < nl.getLength(); i++) {
            an = nl.item(i);
            if(an.getNodeType()==Node.ELEMENT_NODE) {
                NodeList nl2 = an.getChildNodes();

                for(int i2=0; i2<nl2.getLength(); i2++) {
                    an2 = nl2.item(i2);
                    // DEBUG PRINTS
                    System.out.println(an2.getNodeName() + ": type (" + an2.getNodeType() + "):");
                    if(an2.hasChildNodes()) {
                        System.out.println(an2.getFirstChild().getTextContent());
                    } if(an2.hasChildNodes()) {
                        System.out.println(an2.getFirstChild().getNodeValue());
                    }
                    System.out.println(an2.getTextContent());
//                    System.out.println(an2.getNodeValue());
                }
            }
        }
    }
}