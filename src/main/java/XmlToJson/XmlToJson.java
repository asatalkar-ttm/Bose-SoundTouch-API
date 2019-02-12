package XmlToJson;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.json.*;
import org.json.XML;
import remote.ReadWriteFile;

import java.io.File;

public class XmlToJson {

    public static String convertXmlToJson(String xmlString) throws Exception {
        String resultJson = null;
        try {
            JSONObject xmlJSONObj = XML.toJSONObject(xmlString);
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            resultJson = gson.toJson(xmlJSONObj);

            String filename = "response.json";
            ReadWriteFile readWriteFile = new ReadWriteFile();
            readWriteFile.usingFileWriter(filename, resultJson);
        } catch (JSONException je) {
            System.out.println(je.toString());
        }
        return resultJson;
    }
}