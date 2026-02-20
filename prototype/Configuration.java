package prototype;

public class Configuration implements Cloneable{
    
    private String ip;
    private int port;
    private String firmwareVersion;

    public Configuration(String ip, int port, String firmwareVersion) {
        this.ip = ip;
        this.port = port;
        this.firmwareVersion = firmwareVersion;
    }

    public void setIp(String ip) {this.ip = ip; }
    public String getIp() { return ip; }

    public Configuration clone(){
        return new Configuration(ip, port, firmwareVersion);
    }
}
