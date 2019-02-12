package boseapi;

import org.json.JSONObject;

public class BoseSoundTouch {

    public String IPAddress = null;
    public JSONObject volume = null;
    public JSONObject bass = null;
    public JSONObject nowPlaying = null;

    public JSONObject getVolume() throws Exception {
        this.volume = ApiCall.getEndPoint(getIP(),"volume");
        return this.volume;
    }

    public void setVolume(String value) throws Exception {
        ApiCall.setEndPointValue(getIP(),"volume", value);
        this.volume = getVolume();
    }

    public JSONObject getBass() throws Exception {
        this.bass = ApiCall.getEndPoint(getIP(),"bass");
        return this.bass;
    }

    public void setBass(String value) throws Exception {
        ApiCall.setEndPointValue(getIP(),"bass", value);
        this.bass = getBass();
    }

    public JSONObject getNowPlaying() throws Exception {
        this.nowPlaying = ApiCall.getEndPoint(getIP(), "now_playing");
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
