package sparta.eng61.com;

import com.fasterxml.jackson.databind.ObjectMapper;
import sparta.eng61.com.POJOByCityID.MultipleCityIDsPOJO;
import sparta.eng61.com.POJOByCycle.MultipleCitiesByCyclePOJO;
import sparta.eng61.com.POJOByName.CityNamePOJO;
import sparta.eng61.com.POJOByRectangle.MultipleCitiesInRectanglePOJO;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;

public class ConnectionManager {

    private static final Object DTO = ;
    ObjectMapper objectMapper = new ObjectMapper();

    private HttpURLConnection httpURLConnection;
    private CityNamePOJO cityNamePOJO;
    private MultipleCitiesInRectanglePOJO multipleCitiesInRectanglePOJO;
    private MultipleCitiesByCyclePOJO multipleCitiesByCyclePOJO;
    private MultipleCityIDsPOJO multipleCityIDsPOJO;
    private static Properties properties;


    public DTO getByName(String name){
        String url = "api.openweathermap.org/data/2.5/weather?q=" + name + "&appid=" + properties.getProperty("apikey");
        try {
            cityNamePOJO = objectMapper.readValue(new URL(url), CityNamePOJO.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return DTO;
    }


    public CityNamePOJO getUSCityURL(String cityName, String stateCode){
        String url = "api.openweathermap.org/data/2.5/weather?q=" + cityName + "," + stateCode + "&appid=" + properties.getProperty("apikey");
        try {
            cityNamePOJO = objectMapper.readValue(new URL(url), CityNamePOJO.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return cityNamePOJO;
    }

    public CityNamePOJO getCityByCountryCodeURL(String cityName, String countryCode){
        String url = "api.openweathermap.org/data/2.5/weather?q=" + cityName + "," + countryCode + "&appid=" + properties.getProperty("apikey") ;
        try {
            cityNamePOJO = objectMapper.readValue(new URL(url), CityNamePOJO.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return cityNamePOJO;
    }


    public CityNamePOJO getCityIDURL(int cityID){
        String url = "api.openweathermap.org/data/2.5/weather?id=" + cityID + "&appid=" + properties.getProperty("apikey");
        try {
            cityNamePOJO = objectMapper.readValue(new URL(url), CityNamePOJO.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return cityNamePOJO;
    }


    public CityNamePOJO getCityByCoordinates (int lat, int lon){
        String url = "api.openweathermap.org/data/2.5/weather?lat=" + lat + "&long=" + lon + "&appid=" + properties.getProperty("apikey");
        try {
            cityNamePOJO = objectMapper.readValue(new URL(url), CityNamePOJO.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return cityNamePOJO;
    }


    public CityNamePOJO getCityByZipCode (String zip, String countryCode){
        String url = "api.openweathermap.org/data/2.5/weather?zip=" + zip + "," + countryCode  + "&appid=" + properties.getProperty("apikey");
        try {
            cityNamePOJO = objectMapper.readValue(new URL(url), CityNamePOJO.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return cityNamePOJO;
    }


    public MultipleCitiesInRectanglePOJO getMultipleCitiesByZone (int topLeft, int bottomLeft, int bottomRight, int topRight, int zoom){
        String url = "api.openweathermap.org/data/2.5/box/city?bbox=" + topLeft + "," + bottomLeft + "," + bottomRight + "," + topRight + "," + "," + zoom;
        try {
            multipleCitiesInRectanglePOJO = objectMapper.readValue(new URL(url), MultipleCitiesInRectanglePOJO.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return multipleCitiesInRectanglePOJO;
    }


    public MultipleCitiesByCyclePOJO getMultipleCitiesByCycle (int lat, int lon, int count){
        String url = "api.openweathermap.org/data/2.5/find?lat=" + lat + "&lon=" + lon + "&cnt=" + count;
        try {
            multipleCitiesByCyclePOJO = objectMapper.readValue(new URL(url), MultipleCitiesByCyclePOJO.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return multipleCitiesByCyclePOJO;
    }

    public MultipleCityIDsPOJO getMutlipleCitiesByID (int cityID){
        String url = "api.openweathermap.org/data/2.5/find?id=" + cityID;
        try {
            multipleCityIDsPOJO = objectMapper.readValue(new URL(url), MultipleCityIDsPOJO.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return multipleCityIDsPOJO;
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
