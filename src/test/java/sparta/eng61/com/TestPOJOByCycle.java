package java.sparta.eng61.com;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import sparta.eng61.com.ByCycleDTO;

public class TestPOJOByCycle {
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
        Assertions.assertEquals(75, byCycleDTO.gettingClouds().getAll());
    }

    @Test
    public void checkCoordLat() {
        Assertions.assertEquals(57.0333, byCycleDTO.gettingCoord().getLat());
    }

    @Test
    public void checkCoordLon() {
        Assertions.assertEquals(-2.15, byCycleDTO.gettingCoord().getLon());
    }

    @Test
    public void checkDt() {
        Assertions.assertEquals(1521204600, byCycleDTO.gettingDt());
    }

    @Test
    public void checkRain() {
        Assertions.assertEquals(null, byCycleDTO.gettingRain());
    }

    @Test
    public void checkSnow() {
        Assertions.assertEquals(null, byCycleDTO.gettingSnow());
    }

    @Test
    public void checkSys() {
        Assertions.assertEquals("", byCycleDTO.gettingSys());
    }

    //testing weather

    @Test
    public void checkWeatherID() {
        Assertions.assertEquals(311, byCycleDTO.gettingWeather().get(0));
    }

    @Test
    public void checkWeatherMain() {
        Assertions.assertEquals("Drizzle", byCycleDTO.gettingWeather().get(1));
    }

    @Test
    public void checkWeatherDescription() {
        Assertions.assertEquals("rain and drizzle", byCycleDTO.gettingWeather().get(2));
    }

    @Test
    public void checkWeatherIcon() {
        Assertions.assertEquals("09d", byCycleDTO.gettingWeather().get(3));
    }

    //testing wind

    @Test
    public void checkWindSpeed() {
        Assertions.assertEquals(9.3, byCycleDTO.gettingWind().getSpeed());
    }

    @Test
    public void checkWindDeg() {
        Assertions.assertEquals(120, byCycleDTO.gettingWind().getDeg());
    }

    @Test
    public void checkWindGust() {
        Assertions.assertEquals(18, byCycleDTO.gettingWind().getGust());
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
        Assertions.assertEquals(275.15, byCycleDTO.gettingMain().getTemp());
    }

    @Test
    public void checkMainPressure() {
        Assertions.assertEquals(1010, byCycleDTO.gettingMain().getPressure());
    }

    @Test
    public void checkMainHumidity() {
        Assertions.assertEquals(93, byCycleDTO.gettingMain().getHumidity());
    }

    @Test
    public void checkMainTempMin() {
        Assertions.assertEquals(275.15, byCycleDTO.gettingMain().getTempMin());
    }

    @Test
    public void checkMainTempMax() {
        Assertions.assertEquals(275.15, byCycleDTO.gettingMain().getTempMax());
    }
}
