package java.sparta.eng61.com;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import sparta.eng61.com.CityIDsDTO;

public class TestCityIDs {
    ConnectionManager connectionManager = new ConnectionManager();
    URL url;

    private CityIDsDTO cityIDsDTO;

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


    @Test
    public void checkCroodLat() {
        Assertions.assertEquals(55.75, cityIDsDTO.getCroodLat());
    }

    @Test
    public void checkCroodLon() {
        Assertions.assertEquals(37.62, cityIDsDTO.getCroodLon());
    }

    @Test
    public void checkWindSpeed() {
        Assertions.assertEquals(5, cityIDsDTO.getWindSpeed());
    }

    @Test
    public void checkWindDeg() {Assertions.assertEquals(200, cityIDsDTO.getWindDeg());}
    @Test
    public void checkVisibility() {
        Assertions.assertEquals(10000, cityIDsDTO.getVisibility());
    }

    @Test
    public void checkClouds() {
        Assertions.assertEquals(0, rectangleDTO.getClouds());
    }

    @Test
    public void checkSysType() {
        Assertions.assertEquals(1, cityIDsDTO.getSysType());
    }

    @Test
    public void checkSysID() {
        Assertions.assertEquals(7323, cityIDsDTO.getSysID());
    }

    @Test
    public void checkDt() {
        Assertions.assertEquals(1485893175, cityIDsDTO.getDT());
    }

    @Test
    public void checkSysCountry() {
        Assertions.assertEquals("RU", cityIDsDTO.getSysCountry());
    }

    @Test
    public void checkSysSunrise() {
        Assertions.assertEquals(1485753940, cityIDsDTO.getSysSunrise());
    }

    @Test
    public void checkSysSunset() {
        Assertions.assertEquals(1485784855, cityIDsDTO.getSysSunset());
    }

    @Test
    public void checkId() {
        Assertions.assertEquals(7323, cityIDsDTO.getId());
    }

    @Test
    public void checkSysMessage() {
        Assertions.assertEquals(0.0036, cityIDsDTO.getSysMessage());
    }

    @Test
    public void checkWeatherID() {
        Assertions.assertEquals(800, cityIDsDTO.getWeatherID());
    }

    @Test
    public void checkName() {
        Assertions.assertEquals("Moscow", cityIDsDTO.getName());
    }

    @Test
    public void checkHumidity() {
        Assertions.assertEquals(66, cityIDsDTO.getHumidity());
    }

    @Test
    public void checkPressure() {
        Assertions.assertEquals(1028, cityIDsDTO.getPressure());
    }

    @Test
    public void checkTemp() {
        Assertions.assertEquals(-10.5, cityIDsDTO.getTemp());
    }

    @Test
    public void checkTempMax() {
        Assertions.assertEquals(-10, cityIDsDTO.getTempMax());
    }

    @Test
    public void checkTempMin() {
        Assertions.assertEquals(-11, cityIDsDTO.getTempMin());
}
