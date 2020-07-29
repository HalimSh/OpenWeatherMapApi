package sparta.eng61.com;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import sparta.eng61.com.POJOByName.CityNamePOJO;
import sparta.eng61.com.POJOByName.Clouds;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class TestBed {

    ConnectionManager connectionManager = new ConnectionManager();
    private CityNamePOJO cityNamePOJO;

    URL url = new URL("URL");

    public TestBed() throws MalformedURLException {
    }

    public int getResponseCode() throws IOException {
        url.openConnection();
        HttpURLConnection httpURLConnection = (HttpURLConnection)url.openConnection();
        int responseCode = httpURLConnection.getResponseCode();
        return responseCode;
    }

    public Clouds getClouds () {
        return cityNamePOJO.getClouds();
    }

    public Long getVisibility () {
        return cityNamePOJO.getVisibility();
    }

    @Test
    public void checkVisibility () {
        Assertions.assertEquals(10000, getVisibility());
    }

    @Test
    public void checkResponseCode () throws IOException {
        Assertions.assertEquals(200, getResponseCode());
    }

    @Test
    public void checkHeaderOne() {
        Assertions.assertEquals("openresty", connectionManager.readAPIHeaders("http://api.openweathermap.org/data/2.5/weather?q=London&appid=bd61d6c13354008b5b677957c1e27f5a").getHeaderField("Server"));
    }

    @Test
    public void checkHeaderTwo() {
        Assertions.assertEquals("application/json; charset=utf-8", connectionManager.readAPIHeaders("http://api.openweathermap.org/data/2.5/weather?q=London&appid=bd61d6c13354008b5b677957c1e27f5a").getHeaderField("Content-Type"));
    }

    @Test
    public void checkHeaderThree() {
        Assertions.assertEquals("462", connectionManager.readAPIHeaders("http://api.openweathermap.org/data/2.5/weather?q=London&appid=bd61d6c13354008b5b677957c1e27f5a").getHeaderField("Content-Length"));
    }

    @Test
    public void checkHeaderFour() {
        Assertions.assertEquals("keep-alive", connectionManager.readAPIHeaders("http://api.openweathermap.org/data/2.5/weather?q=London&appid=bd61d6c13354008b5b677957c1e27f5a").getHeaderField("Connection"));
    }

    @Test
    public void checkClouds () {
        Assertions.assertEquals(null, getClouds());
    }


}
