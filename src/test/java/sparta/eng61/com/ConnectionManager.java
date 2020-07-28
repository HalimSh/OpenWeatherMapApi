package sparta.eng61.com;

import com.fasterxml.jackson.databind.ObjectMapper;
import sparta.eng61.com.POJOByName.CityNamePOJO;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class ConnectionManager {

    ObjectMapper objectMapper = new ObjectMapper();

    private HttpURLConnection httpURLConnection;
    private CityNamePOJO cityNamePOJO;

    public CityNamePOJO readURL(String link){
        try {
            cityNamePOJO = objectMapper.readValue(new URL(link), CityNamePOJO.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return cityNamePOJO;
    }


    public HttpURLConnection readAPIHeaders(String link) {
        try {
            URL url = new URL(link);
            httpURLConnection = (HttpURLConnection) url.openConnection();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return httpURLConnection;
    }
}
