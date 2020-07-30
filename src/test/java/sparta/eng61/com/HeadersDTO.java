package sparta.eng61.com;

import java.net.HttpURLConnection;

public class HeadersDTO {

    private HttpURLConnection httpURLConnection;

    public HeadersDTO(String link) {
        ConnectionManager connect = new ConnectionManager();
        httpURLConnection = connect.readAPIHeaders(link);
    }

    public String getServer() {
        return httpURLConnection.getHeaderField("Server");
    }

    public String getDayDateTime() {
        return httpURLConnection.getHeaderField("Date");
    }

    public String getContentType() {
        return httpURLConnection.getHeaderField("Content-Type");
    }

    public String getContentlength() {
        return httpURLConnection.getHeaderField("Content-Length");
    }

    public String getConnection() {
        return httpURLConnection.getHeaderField("Connection");
    }

    public String getXCacheKey(){
        return httpURLConnection.getHeaderField("X-Cache-Key");
    }

    public String getAccessControlAllowOrigin(){
        return httpURLConnection.getHeaderField("Access-Control-Allow-Origin");
    }

    public String getAccessControlAllowCredentials(){
        return httpURLConnection.getHeaderField("Access-Control-Allow-Credentials");
    }

    public String getAccessControlAllowMethods(){
        return httpURLConnection.getHeaderField("Access-Control-Allow-Methods");
    }

}
