package boseapi;

import XmlToJson.XmlToJson;

public class BoseSoundTouch {

    public String IPAddress = null;
    public String volume = null;
    public String bass = null;
    public String nowPlaying = null;

    public String getVolume() throws Exception {
        XmlToJson xmlToJson = new XmlToJson();
        this.volume = ApiCall.getEndPoint(getIP(),"volume");
        this.volume = xmlToJson.convertXmlToJson(this.volume);
        return this.volume;
    }

    public void setVolume(String value) throws Exception {
        ApiCall.setEndPointValue(getIP(),"volume", value);
        this.volume = getVolume();
    }

    public String getBass() throws Exception {
        XmlToJson xmlToJson = new XmlToJson();
        this.bass = ApiCall.getEndPoint(getIP(),"bass");
        this.bass = xmlToJson.convertXmlToJson(this.bass);
        return this.bass;
    }

    public void setBass(String value) throws Exception {
        ApiCall.setEndPointValue(getIP(),"bass", value);
        this.bass = getBass();
    }

    public String getNowPlaying() throws Exception {
        XmlToJson xmlToJson = new XmlToJson();
        this.nowPlaying = ApiCall.getEndPoint(getIP(), "now_playing");
        this.nowPlaying = xmlToJson.convertXmlToJson(this.nowPlaying);
        return this.nowPlaying;
    }

    public String getIP() throws Exception {
        ReadWriteFile readWriteFile = new ReadWriteFile();
        this.IPAddress = readWriteFile.readFileAsString("IPAddress.txt");
        return this.IPAddress;
    }

    public void setIP(String IPAddress) throws Exception {
        this.IPAddress = "http://";
        this.IPAddress = this.IPAddress + IPAddress;
        ReadWriteFile readWriteFile = new ReadWriteFile();
        readWriteFile.usingFileWriter("IPAddress.txt", this.IPAddress);
    }
}
