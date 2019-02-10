package remote;

/**
 * Bose SoundTouch API
 **/

public class Main {

    private static final String FILENAME = "response.xml";

    public static void main( String[] args ) throws Exception {
        ApiCall apiCall = new ApiCall();
        String endPoint = args[0];
        ReadWriteFile readWriteFile = new ReadWriteFile();

        String ipAddress = readWriteFile.readFileAsString("IPAddress.txt");

        String response = apiCall.getEndPoint(ipAddress, endPoint);
        readWriteFile.usingFileWriter(FILENAME, response);
        String xmlResponse = readWriteFile.readFileAsString(FILENAME);

        ParseXml parseXml = new ParseXml();
        parseXml.parse(xmlResponse);
        apiCall.setEndPointValue(ipAddress,endPoint,args[1]);
    }
}
