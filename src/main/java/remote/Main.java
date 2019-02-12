package remote;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

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

        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        String volume = boseSoundTouch.getVolume();

        System.out.println("Current Volume is : " + volume);

        String bass = boseSoundTouch.getBass();
        System.out.println("Current Bass is : " + bass);

        String now_playing = boseSoundTouch.getNowPlaying();
        System.out.println("Now Playing : " + now_playing);
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
