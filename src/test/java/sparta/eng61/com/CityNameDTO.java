package sparta.eng61.com;

import sparta.eng61.com.POJOByName.*;

import java.awt.*;

public class CityNameDTO {

    private CityNamePOJO cityNamePOJO;
    private ConnectionManager connectionManager;

    public CityNameDTO(String url) {
        connectionManager = new ConnectionManager();
        cityNamePOJO = connectionManager.readURL(url);
    }

    // Coord Getters
    public double getCroodLat() {
        return (Double) cityNamePOJO.getCoord().getLat();
    }

    public double getCroodL() {
        return (Double) cityNamePOJO.getCoord().getLon();
    }

    // Weather Getters
//    public List getWeatherID(){
//        return (List) cityNamePOJO.getWeather().indexOf(0) ;
//    }

public String getBase() {
        return cityNamePOJO.getBase();
}





}
