package sparta.eng61.com;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import sparta.eng61.com.POJOByName.CityNamePOJO;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class TestByNameDTO {

    ConnectionManager connectionManager = new ConnectionManager();
    URL url;
    private CityNameDTO cityNameDTO;
    {
        try {
            url = new URL("URL");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

    public int getResponseCode() throws IOException {
        url.openConnection();
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        int responseCode = httpURLConnection.getResponseCode();
        return responseCode;
    }
    //testing coord
    @Test
    public void checkCoordLat() {
        Assertions.assertEquals(51.51, cityNameDTO.getCoordLat());
    }

    @Test
    public void checkCoordLon() {
        Assertions.assertEquals(-0.13, cityNameDTO.getCoordLon());
    }
//testing visibility
    @Test
    public void checkVisibility () {
        Assertions.assertEquals(10000, cityNameDTO.getVisibility());
    }
//testing base
    @Test
    public void checkBase() {
        Assertions.assertEquals("stations", cityNameDTO.getBase());
    }

    @Test
    public void checkClouds() {
        Assertions.assertEquals(0, cityNameDTO.getClouds());
    }

    //testing sys

    @Test
    public void checkCountry() {
        Assertions.assertEquals("GB", cityNameDTO.getSysCountry());
    }
    @Test
    public void checkID() {
        Assertions.assertEquals("1414", cityNameDTO.getSysID());
    }
    @Test
    public void checkSunrise() {
        Assertions.assertEquals("1596169392", cityNameDTO.getSysSunrise());
    }
    @Test
    public void checkSunset() {
        Assertions.assertEquals("1596225025", cityNameDTO.getSysSunset());
    }
    @Test
    public void checkType() {
        Assertions.assertEquals("1", cityNameDTO.getSysType());
    }

    //testing weather
    @Test
    public void checkWeatherDescription() {
        Assertions.assertEquals("clear sky", cityNameDTO.getWeatherDesc(0));
    }
    @Test
    public void checkWeatherIcon() {
        Assertions.assertEquals("01d", cityNameDTO.getWeatherIcon(1));
    }

    @Test
    public void checkWeatherID() {
        Assertions.assertEquals(800, cityNameDTO.getWeatherID(2));
    }
    @Test
    public void checkWeatherMain() {
        Assertions.assertEquals("Clear", cityNameDTO.getWeatherMain(3));
    }


    //testing wind

    @Test
    public void checkWindSpeed() {
        Assertions.assertEquals(5.1, cityNameDTO.getWindSpeed());
    }

    @Test
    public void checkWindDeg() {
        Assertions.assertEquals(90, cityNameDTO.getWindDeg());
    }

    @Test
    public void checkDT() {
        Assertions.assertEquals(1596195585, cityNameDTO.getDT());
    }

    //testing main

    @Test
    public void checkMainTemp() {
        Assertions.assertEquals(306.05, cityNameDTO.getTemp());
    }

    @Test
    public void checkMainPressure() {
        Assertions.assertEquals(1010, cityNameDTO.getPressure());
    }

    @Test
    public void checkMainHumidity() {
        Assertions.assertEquals(31, cityNameDTO.getHumidity());
    }

    @Test
    public void checkMainFeelsLike() {
        Assertions.assertEquals(303.58, cityNameDTO.getFeelsLike());
    }

    @Test
    public void checkMainTempMin() {
        Assertions.assertEquals(305.15, cityNameDTO.getTempMin());
    }

    @Test
    public void checkMainTempMax() {
        Assertions.assertEquals(307.59, cityNameDTO.getTempMax());
    }
    //testing id
    @Test
    public void checkId() {
        Assertions.assertEquals("2643743", cityNameDTO.getId());
    }
    //testing cod
    @Test
    public void checkCod() {
        Assertions.assertEquals("200", cityNameDTO.getCod());
    }

    //testing timezone
    @Test
    public void checkTimeZone() {
        Assertions.assertEquals("3600", cityNameDTO.getTimezone());
    }

    //testing name
    @Test
    public void checkName() {
        Assertions.assertEquals("London", cityNameDTO.getName());
    }

}


