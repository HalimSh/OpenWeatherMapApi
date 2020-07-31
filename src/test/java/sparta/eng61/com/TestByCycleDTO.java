package sparta.eng61.com;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import sparta.eng61.com.ByCycleDTO;

public class TestByCycleDTO {
    ConnectionManager connectionManager = new ConnectionManager();
    URL url;

    private ByCycleDTO byCycleDTO;

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
    public void checkCod() {
        Assertions.assertEquals("200", byCycleDTO.gettingCod());
    }

    @Test
    public void checkCount() {
        Assertions.assertEquals(3, byCycleDTO.gettingCount());
    }

    @Test
    public void checkMessage() {
        Assertions.assertEquals("accurate", byCycleDTO.gettingMessage());
    }

    @Test
    public void checkClouds() {
        Assertions.assertEquals(75, byCycleDTO.getClouds());
    }

    @Test
    public void checkCoordLat() {
        Assertions.assertEquals(57.0333, byCycleDTO.getCoordLat());
    }

    @Test
    public void checkCoordLon() {
        Assertions.assertEquals(-2.15, byCycleDTO.getCoordLon());
    }

    @Test
    public void checkDt() {
        Assertions.assertEquals(1521204600, byCycleDTO.getDT());
    }

    @Test
    public void checkRain() {
        Assertions.assertEquals(null, byCycleDTO.getRain());
    }

    @Test
    public void checkSnow() {
        Assertions.assertEquals(null, byCycleDTO.getSnow());
    }

    @Test
    public void checkCountry() {
        Assertions.assertEquals("", byCycleDTO.getCountry());
    }

    //testing weather

    @Test
    public void checkWeatherID() {
        Assertions.assertEquals(311, byCycleDTO.getWeather().get(0));
    }

    @Test
    public void checkWeatherMain() {
        Assertions.assertEquals("Drizzle", byCycleDTO.getWeather().get(1));
    }

    @Test
    public void checkWeatherDescription() {
        Assertions.assertEquals("rain and drizzle", byCycleDTO.getWeather().get(2));
    }

    @Test
    public void checkWeatherIcon() {
        Assertions.assertEquals("09d", byCycleDTO.getWeather().get(3));
    }

    //testing wind

    @Test
    public void checkWindSpeed() {
        Assertions.assertEquals(9.3, byCycleDTO.getSpeed());
    }

    @Test
    public void checkWindDeg() {
        Assertions.assertEquals(120, byCycleDTO.getDeg());
    }

    @Test
    public void checkWindGust() {
        Assertions.assertEquals(18, byCycleDTO.getGust());
    }

    //testing list

    @Test
    public void checkListId() {
        Assertions.assertEquals(2641549, byCycleDTO.gettingList().get(0).getId());
    }

    @Test
    public void checkListName() {
        Assertions.assertEquals("Newtonhill", byCycleDTO.gettingList().get(0).getName());
    }

    //testing main

    @Test
    public void checkMainTemp() {
        Assertions.assertEquals(275.15, byCycleDTO.getTemp());
    }

    @Test
    public void checkMainPressure() {
        Assertions.assertEquals(1010, byCycleDTO.getPressure());
    }

    @Test
    public void checkMainHumidity() {
        Assertions.assertEquals(93, byCycleDTO.getHumidity());
    }

    @Test
    public void checkMainTempMin() {
        Assertions.assertEquals(275.15, byCycleDTO.getTempMin());
    }

    @Test
    public void checkMainTempMax() {
        Assertions.assertEquals(275.15, byCycleDTO.getTempMax());
    }
}
