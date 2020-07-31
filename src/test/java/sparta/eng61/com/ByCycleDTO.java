package sparta.eng61.com;

import sparta.eng61.com.ConnectionManager;
import sparta.eng61.com.POJOByCycle.*;

public class ByCycleDTO {
    private MultipleCitiesByCyclePOJO multipleCitiesByCyclePOJO;
    private ConnectionManager connectionManager;
    private List list;

    public void CitiesCycle(String url) {
        connectionManager = new ConnectionManager();
//        multipleCitiesByCyclePOJO = connectionManager.readURLCycle(url);
    }

    public String gettingCod() {
        return multipleCitiesByCyclePOJO.getCod();
    }

    public Long gettingCount() {
        return multipleCitiesByCyclePOJO.getCount();
    }

    public String gettingMessage() {
        return multipleCitiesByCyclePOJO.getMessage();
    }

    public Clouds gettingClouds() {
        return list.getClouds();
    }

    public Coord gettingCoord() {
        return list.getCoord();
    }

    public Long gettingDt() {
        return list.getDt();
    }

    public Object gettingRain() {
        return list.getRain();
    }

    public Object gettingSnow() {
        return list.getSnow();
    }

    public Sys gettingSys() {
        return list.getSys();
    }

    public java.util.List<Weather> gettingWeather() {
        return list.getWeather();
    }

    public Wind gettingWind() {
        return list.getWind();
    }

    public java.util.List<sparta.eng61.com.POJOByCycle.List> gettingList() {
        return multipleCitiesByCyclePOJO.getList();
    }


}
