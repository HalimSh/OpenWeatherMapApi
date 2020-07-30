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

    public String getCityNameURL (String cityName) {
        return "api.openweathermap.org/data/2.5/weather?q=" + cityName + "&appid=" + APIKEY;
    }

    public String getUSCityURL (String cityName, String stateCode) {
        return "api.openweathermap.org/data/2.5/weather?q=" + cityName + "," + stateCode + "&appid=" + APIKey;
    }

    public String getCityByCountryCodeURL(String cityName, String countryCode) {
        return "api.openweathermap.org/data/2.5/weather?q=" + cityName + "," + countryCode + "&appid=" + APIKey;
    }

    public String getCityIDURL(int cityID) {
        return "api.openweathermap.org/data/2.5/weather?id=" + cityID + "&appid=" + APIKEY;
    }

    public String getCityByCoordinates (int lat, int lon) {
        return "api.openweathermap.org/data/2.5/weather?lat=" + lat + "&long=" + lon + "&appid=" + APIKEY;
    }

    public String getCityByZipCode (String zip, String countryCode) {
        return "api.openweathermap.org/data/2.5/weather?zip=" + zip + "," + countryCode  + "&appid=" + APIKEY;
    }

    public String getMultipleCitiesByZone (int topLeft, int bottomLeft, int bottomRight, int topRight, int zoom) {
        return "api.openweathermap.org/data/2.5/box/city?bbox=" + topLeft + "," + bottomLeft + "," + bottomRight + "," + topRight + "," + "," + zoom;
    }

    public String getMultipleCitiesByCycle (int lat, int lon, int count) {
        return "api.openweathermap.org/data/2.5/find?lat=" + lat + "&lon=" + lon + "&cnt=" + count;
    }

    public String getMutlipleCitiesByID (int cityID) {
        return "api.openweathermap.org/data/2.5/find?id=" + cityID;
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
