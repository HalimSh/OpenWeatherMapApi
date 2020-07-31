package sparta.eng61.com;

import sparta.eng61.com.POJOByName.*;

public class CityNameDTO extends DTO{

    private CityNamePOJO cityNamePOJO;
    private ConnectionManager connectionManager;
    Injector injector = new Injector();


    public CityNameDTO() {
        connectionManager = new ConnectionManager();
        cityNamePOJO = injector.getPojoPayload();
    }

    // Coord Getters
    public double getCroodLat() {
        return cityNamePOJO.getCoord().getLat();
    }

    public double getCroodLon() {
        return cityNamePOJO.getCoord().getLon();
    }

    // Weather Getters
    public int getWeatherID(int option) {
        return cityNamePOJO.getWeather().indexOf(option);
    }

    //Clouds Getters
    public long getClouds() {
        return cityNamePOJO.getClouds().getAll();
    }

    // Base Getters
    public String getBase() {
        return cityNamePOJO.getBase();
    }

    // Main Getters
    public double getFeelsLike() {
        return cityNamePOJO.getMain().getFeelsLike();
    }

    public long getHumidity() {
        return cityNamePOJO.getMain().getHumidity();
    }

    public long getPressure() {
        return cityNamePOJO.getMain().getPressure();
    }

    public double getTemp() {
        return cityNamePOJO.getMain().getTemp();
    }

    public double getTempMax() {
        return cityNamePOJO.getMain().getTempMax();
    }

    public double getTempMin() {
        return cityNamePOJO.getMain().getTempMin();
    }

    // Visibility Getter
    public long getVisibility() {
        return cityNamePOJO.getVisibility();
    }

    // Wind  Getters
    public double getWindSpeed() {
        return cityNamePOJO.getWind().getSpeed();
    }

    public long getWindDeg() {
        return cityNamePOJO.getWind().getDeg();
    }

    public long getDT() {
        return cityNamePOJO.getDt();
    }

    // Sys Getters
    public long getSysType() {
        return cityNamePOJO.getSys().getType();
    }

    public long getSysID() {
        return cityNamePOJO.getSys().getId();
    }

    public String getSysCountry() {
        return cityNamePOJO.getSys().getCountry();
    }

    public long getSysSunrise() {
        return cityNamePOJO.getSys().getSunrise();
    }

    public long getSysSunset() {
        return cityNamePOJO.getSys().getSunset();
    }

    public long getId() {
        return cityNamePOJO.getId();
    }

    public long getCod() {
        return cityNamePOJO.getCod();
    }

    public long getTimezone() {
        return cityNamePOJO.getTimezone();
    }

    public String getName() {
        return cityNamePOJO.getName();
    }
}