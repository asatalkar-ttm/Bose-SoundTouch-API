package XmlToJson;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.json.*;
import org.json.XML;
import boseapi.ReadWriteFile;

public class XmlToJson {

    public static JSONObject convertXmlToJson(String xmlString) throws Exception {
        JSONObject xmlJSONObj = null;
        try {
            xmlJSONObj = XML.toJSONObject(xmlString);

            String filename = "response.json";
            ReadWriteFile readWriteFile = new ReadWriteFile();
            readWriteFile.usingFileWriter(filename, xmlJSONObj.toString());
        } catch (JSONException je) {
            System.out.println(je.toString());
        }
        return xmlJSONObj;
    }
}