package sparta.eng61.com;

import sparta.eng61.com.POJOByCityID.*;

import java.util.List;

public class CityIDsDTO {
    private MultipleCityIDsPOJO multipleCityIDsPOJO;
    private ConnectionManager connectionManager;
    private Lists lists;

    public CityIDsDTO (int cityID){
        connectionManager = new ConnectionManager();
        multipleCityIDsPOJO = connectionManager.getMutlipleCitiesByID(cityID);
    }

    public Long getCnt(){
        return multipleCityIDsPOJO.getCnt();
    }
    public List getLists(){
        return multipleCityIDsPOJO.getLists();
    }
    // Coord Getters
    public double getCroodLat() {
        return lists.getCoord().getLat();
    }

    public double getCroodLon() {
        return lists.getCoord().getLon();
    }
    // Visibility Getter
    public long getVisibility() {
    return lists.getVisibility();
}

    // Wind  Getters
    public double getWindSpeed() {
        return lists.getWind().getSpeed();
    }

    public long getWindDeg() {
        return lists.getWind().getDeg();
    }

    public long getDT() {
        return lists.getDt();
    }


    //Clouds Getters
    public long getClouds(){
        return lists.getClouds().getAll();
    }
    // Sys Getters
    public long getSysType() {
        return lists.getSys().getType();
    }

    public long getSysID() {
        return lists.getSys().getId();
    }

    public String getSysCountry() {
        return lists.getSys().getCountry();
    }

    public long getSysSunrise() {
        return lists.getSys().getSunrise();
    }

    public long getSysSunset() {
        return lists.getSys().getSunset();
    }

    public long getId() {
        return lists.getId();
    }

    public double getSysMessage(){
        return lists.getSys().getMessage();
    }

    //Weather getters

    //weather getters
    public List<Weather> getWeather() {
        return lists.getWeather();
    }
    //Name getter
    public String getName(){
        return lists.getName();
    }
    // Main Getters

    public long getHumidity() {
        return lists.getMain().getHumidity();
    }

    public long getPressure() {
        return lists.getMain().getPressure();
    }

    public double getTemp() {
        return lists.getMain().getTemp();
    }

    public double getTempMax() {
        return lists.getMain().getTempMax();
    }

    public double getTempMin() {
        return lists.getMain().getTempMin();
    }








}
