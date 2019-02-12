package boseapi;

import XmlToJson.XmlToJson;
import com.squareup.okhttp.*;
import org.json.JSONObject;

/**
 * Bose SoundTouch API
**/

public class ApiCall {

    private static final String CACHECONTROL = "Cache-Control";
    private static final String NOCACHE = "no-cache";
    private static final String CONTENTTYPE = "Content-Type";
    private static final String APPLICATIONTYPE = "application/xml";

    public static JSONObject getEndPoint(String ipAddress, String endPoint) throws Exception {
        XmlToJson xmlToJson = new XmlToJson();
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
                .url(ipAddress + ":8090/" + endPoint)
                .get()
                .addHeader(CACHECONTROL, NOCACHE)
                .build();
        Response response = client.newCall(request).execute();
        String responseString = response.body().string();
        System.out.println("get" + endPoint + " response code : " + response.code());
        return xmlToJson.convertXmlToJson(responseString);
    }

    public static void setEndPointValue(String ipAddress, String endPoint, String value) throws Exception {
        OkHttpClient client = new OkHttpClient();
        MediaType mediaType = MediaType.parse(APPLICATIONTYPE);
        RequestBody body = RequestBody.create(mediaType, "<"+endPoint+">"+ value +"</"+endPoint+">");
        Request request = new Request.Builder()
                .url(ipAddress + ":8090/" + endPoint)
                .post(body)
                .addHeader(CONTENTTYPE, APPLICATIONTYPE)
                .addHeader(CACHECONTROL, NOCACHE)
                .build();
        Response response = client.newCall(request).execute();
        if(response.code() == 200) {
            System.out.println(endPoint + " value set at level : " + value);
        }
    }
}