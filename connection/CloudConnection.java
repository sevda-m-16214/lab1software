package connection;

public class CloudConnection {
    private String apiKey;
    private String serverUrl;

    private CloudConnection(String apiKey, String serverUrl){
        this.apiKey = apiKey;
        this.serverUrl = serverUrl;
    }

    // Initialization-on-demand holder idiom
    private static class Holder {
        private static CloudConnection INSTANCE =
                new CloudConnection("DEFAULT_KEY", "https://api.omnihome.com");
    }

    public static CloudConnection getInstance(){
        return Holder.INSTANCE;
    }

    public void connect(){
        System.out.println("Connected to: " + serverUrl + " with key: " + apiKey);
    }
}