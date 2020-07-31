package sparta.eng61.com;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import sparta.eng61.com.POJOByName.CityNamePOJO;

import java.io.FileReader;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;

public class TestByNameDTO {

    ConnectionManager connectionManager = new ConnectionManager();
    CityNamePOJO cityNamePOJO = connectionManager.getByName("London");



    @Test
    public void responseCodeTest(){
        try {
            Assertions.assertEquals(200,cityNamePOJO.getResponseCode("London"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    Properties properties = new Properties();
    URL url;
    @Test
    public void getResponseCodeTest() throws IOException {
        try {
            properties.load(new FileReader("src/test/resources/ApiKey.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            url = new URL("http://api.openweathermap.org/data/2.5/weather?q=London&appid=" + properties.getProperty("apikey"));
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        int responseCode = httpURLConnection.getResponseCode();
        Assertions.assertEquals(200,responseCode);
    }


    @Test
    public void checkCoordLat() {
        Assertions.assertEquals(51.51, cityNamePOJO.getCoord().getLat());
    }

    @Test
    public void checkCoordLon() {
        Assertions.assertEquals(-0.13, cityNamePOJO.getCoord().getLon());
    }

    @Test
    public void checkVisibility () {
        Assertions.assertEquals(10000, cityNamePOJO.getVisibility());
    }

    @Test
    public void checkBase() {
        Assertions.assertEquals("stations", cityNamePOJO.getBase());
    }



    @Test
    public void checkCountry() {
        Assertions.assertEquals("GB", cityNamePOJO.getSys().getCountry());
    }
    @Test
    public void checkID() {
        Assertions.assertEquals(1414, cityNamePOJO.getSys().getId());
    }
    @Test
    public void checkSunrise() {
        Assertions.assertEquals(1596169392, cityNamePOJO.getSys().getSunrise());
    }
    @Test
    public void checkSunset() {
        Assertions.assertEquals(1596225025, cityNamePOJO.getSys().getSunset());
    }
    @Test
    public void checkType() {
        Assertions.assertEquals(1, cityNamePOJO.getSys().getType());
    }

}


