package boseapi;

public class WasMain {

//    private static final String FILENAME = "response.xml";

//    public static void main2(String[] args ) {
//        try {
//            ApiCall apiCall = new ApiCall();
//            String endPoint = args[0];
//
//            ReadWriteFile readWriteFile = new ReadWriteFile();
//
//            String ipAddress = "";
//            ipAddress = readWriteFile.readFileAsString("IPAddress.txt");
//
//            String response = apiCall.getEndPoint(ipAddress, endPoint);
//
//            // Store XML response in response.xml file
//            readWriteFile.usingFileWriter(FILENAME, response);
//            String xmlResponse = readWriteFile.readFileAsString(FILENAME);
//
//            ParseXml parseXml = new ParseXml();
//            parseXml.parse(xmlResponse);
//            apiCall.setEndPointValue(ipAddress,endPoint,args[1]);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
}
