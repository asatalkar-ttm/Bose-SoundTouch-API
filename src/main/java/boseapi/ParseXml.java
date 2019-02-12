package boseapi;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
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
        Node node = doc.getFirstChild();
        NodeList nodeList = node.getChildNodes();
        Node node1,node2;

        for (int i = 0; i < nodeList.getLength(); i++) {
            node1 = nodeList.item(i);
            if( node1.getNodeType() == Node.ELEMENT_NODE ) {
                NodeList node1ChildNodes = node1.getChildNodes();

                for(int j=0; j < node1ChildNodes.getLength(); j++) {
                    node2 = node1ChildNodes.item(j);

                    // DEBUG PRINTS
                    Element element = (Element)nodeList.item(i);
                    System.out.println(element.getNodeName() + " : ");

                    if( node2.hasChildNodes() ) {
                        System.out.println( node2.getFirstChild().getTextContent() );
                    } if( node2.hasChildNodes() ) {
                        System.out.println( node2.getFirstChild().getNodeValue() );
                    }

                    System.out.println( node2.getTextContent() );
                    //System.out.println(node2.getNodeValue());
                }
            }
        }
    }
}