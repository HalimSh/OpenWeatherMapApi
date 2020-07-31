package sparta.eng61.com;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import sparta.eng61.com.POJOByName.CityNamePOJO;

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

    @Test
    public void checkResponseCode () throws IOException {
        Assertions.assertEquals(200, getResponseCode());
    }

    @Test
    public void checkServer() {
        Assertions.assertEquals("openresty", connectionManager.readAPIHeaders("http://api.openweathermap.org/data/2.5/weather?q=London&appid=bd61d6c13354008b5b677957c1e27f5a").getHeaderField("Server"));
    }

    @Test
    public void checkContentType() {
        Assertions.assertEquals("application/json; charset=utf-8", connectionManager.readAPIHeaders("http://api.openweathermap.org/data/2.5/weather?q=London&appid=bd61d6c13354008b5b677957c1e27f5a").getHeaderField("Content-Type"));
    }
    @Test
    public void ContentLength() {
        Assertions.assertEquals("461", connectionManager.readAPIHeaders("http://api.openweathermap.org/data/2.5/weather?q=London&appid=bd61d6c13354008b5b677957c1e27f5a").getHeaderField("Content-Length"));
    }
    @Test
    public void Connection() {
        Assertions.assertEquals("keep-alive", connectionManager.readAPIHeaders("http://api.openweathermap.org/data/2.5/weather?q=London&appid=bd61d6c13354008b5b677957c1e27f5a").getHeaderField("Connection"));
    }

    @Test
    public void checkXCacheKey() {
        Assertions.assertEquals("/data/2.5/weather?q=london", connectionManager.readAPIHeaders("http://api.openweathermap.org/data/2.5/weather?q=London&appid=bd61d6c13354008b5b677957c1e27f5a").getHeaderField("X-Cache-Key"));
    }
    @Test
    public void checkACAOrigin() {
        Assertions.assertEquals("*", connectionManager.readAPIHeaders("http://api.openweathermap.org/data/2.5/weather?q=London&appid=bd61d6c13354008b5b677957c1e27f5a").getHeaderField("Access-Control-Allow-Origin"));
    }
    @Test
    public void checkACACredentials() {
        Assertions.assertEquals("TRUE", connectionManager.readAPIHeaders("http://api.openweathermap.org/data/2.5/weather?q=London&appid=bd61d6c13354008b5b677957c1e27f5a").getHeaderField("Access-Control-Allow-Credentials"));
    } @Test
    public void checkACAMethods() {
        Assertions.assertEquals("GET, POST", connectionManager.readAPIHeaders("http://api.openweathermap.org/data/2.5/weather?q=London&appid=bd61d6c13354008b5b677957c1e27f5a").getHeaderField("Access-Control-Allow-Methods"));
    }

}
