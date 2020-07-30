package sparta.eng61.com;

import sparta.eng61.com.ConnectionManager;
import sparta.eng61.com.POJOByCycle.*;

public class ByCycleDTO {
    private MultipleCitiesByCyclePOJO multipleCitiesByCyclePOJO;
    private ConnectionManager connectionManager;
    private List list;

//    public void CitiesCycle(String url) {
//        connectionManager = new ConnectionManager();
//        multipleCitiesByCyclePOJO = connectionManager.getMultipleCitiesByCycle();
//    }

    public String gettingCod() {
        return multipleCitiesByCyclePOJO.getCod();
    }

    public Long gettingCount() {
        return multipleCitiesByCyclePOJO.getCount();
    }

    public String gettingMessage() {
        return multipleCitiesByCyclePOJO.getMessage();
    }

    public long getClouds(){
        return list.getClouds().getAll();
    }

    public double getCroodLat() {
    return list.getCoord().getLat();
}

    public double getCroodLon() {
        return list.getCoord().getLon();
    }

    public String getName(){
        return list.getName();
    }

    public Long getDT(){
        return list.getDt();
    }

    public Long getId(){
        return list.getId();
    }

    public Object getRain() {
        return list.getRain();
    }

    public Object getSnow() {
        return list.getSnow();
    }

    public String getCountry() {
        return list.getSys().getCountry();
    }

    public double getPressure(){
        return list.getMain().getPressure();
    }

    public long getHumidity () {
        return list.getMain().getHumidity();
    }
    public double getTemp () {
        return list.getMain().getTemp();
    }

    public double getTempMax () {
        return list.getMain().getTempMax();
    }

    public double getTempMin () {
        return list.getMain().getTempMin();
    }


    public java.util.List<Weather> gettingWeather() {
        return list.getWeather();
    }

    public double getWindSpeed() {
        return list.getWind().getSpeed();
    }

    public long getWindDeg() {
        return list.getWind().getDeg();
    }

    public double getGust(){
        return list.getWind().getGust();
    }

    public java.util.List<sparta.eng61.com.POJOByCycle.List> gettingList() {
        return multipleCitiesByCyclePOJO.getList();
    }



}
