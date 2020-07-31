package sparta.eng61.com;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import sparta.eng61.com.RectangleDTO;

public class TestRectangleDTO {
    ConnectionManager connectionManager = new ConnectionManager();
    URL url;

    private RectangleDTO rectangleDTO;

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
        Assertions.assertEquals(32.06329, rectangleDTO.getCroodLat());
    }

    @Test
    public void checkCroodLon() {
        Assertions.assertEquals(12.52859, rectangleDTO.getCroodLon());
    }

    @Test
    public void checkWindSpeed() {
        Assertions.assertEquals(3.96, rectangleDTO.getWindSpeed());
    }

    @Test
    public void checkWingDeg() {
        Assertions.assertEquals(356.5, rectangleDTO.getWindDeg());
    }

    @Test
    public void checkClouds() {
        Assertions.assertEquals(88, rectangleDTO.getClouds());
    }

    @Test
    public void checkRainType() {
        Assertions.assertEquals(0.255, rectangleDTO.getRainType());
    }

    @Test
    public void checkWeatherDescription() {
        Assertions.assertEquals("rain and drizzle", rectangleDTO.getWeather().get(0));
    }

    @Test
    public void checkWeatherID() {
        Assertions.assertEquals(311, rectangleDTO.getWeather().get(2));
    }

    @Test
    public void checkWeatherMain() {
        Assertions.assertEquals("Drizzle", rectangleDTO.getWeather().get(3));
    }
    @Test
    public void checkName() {
        Assertions.assertEquals("Yafran", rectangleDTO.getName());
    }

    @Test
    public void checkTemp() {
        Assertions.assertEquals(9.68, rectangleDTO.getTemp());
    }

    @Test
    public void checkTempMax() {
        Assertions.assertEquals(9.681, rectangleDTO.getTempMax());
    }

    @Test
    public void checkTempMin() {
        Assertions.assertEquals(9.681, rectangleDTO.getTempMin());
    }

    @Test
    public void checkSeaLevel() {
        Assertions.assertEquals(1036.82, rectangleDTO.getSeaLevel());
    }

    @Test
    public void checkGrndLevel() {
        Assertions.assertEquals(961.02, rectangleDTO.getGrndLevel());
    }

    @Test
    public void checkPressure() {
        Assertions.assertEquals(961.02, rectangleDTO.getPressure());
    }

    @Test
    public void checkHumidity() { Assertions.assertEquals(85, rectangleDTO.getHumidity());}
}
