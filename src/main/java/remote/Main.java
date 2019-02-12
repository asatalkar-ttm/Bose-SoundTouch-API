package remote;

/**
 * Bose SoundTouch API
 **/

public class Main {

    private static final String FILENAME = "response.xml";

    public static void main(String[] args) throws Exception {
        BoseSoundTouch boseSoundTouch = new BoseSoundTouch();

        if (args != null || args.length > 0) {
            boseSoundTouch.setIP(args[0]);
        }

        ParseXml parseXml = new ParseXml();

        String volume = boseSoundTouch.getVolume();
        System.out.println("Current Volume is : ");
        parseXml.parse(volume);

        String bass = boseSoundTouch.getBass();
        System.out.println("Current Bass is : ");
        parseXml.parse(bass);

        String now_playing = boseSoundTouch.getNowPlaying();
        System.out.println("Now Playing : ");
        parseXml.parse(now_playing);
    }

    public static void main2(String[] args ) {
        try {
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

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
