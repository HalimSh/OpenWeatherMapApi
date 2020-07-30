package sparta.eng61.com;

import sparta.eng61.com.POJOByRectangle.MultipleCitiesInRectanglePOJO;
import sparta.eng61.com.POJOByRectangle.RectLists;

public class RectangleDTO {
    private MultipleCitiesInRectanglePOJO multipleCitiesInRectanglePOJO;
    private ConnectionManager connectionManager;
    private RectLists rectLists;

//    public RectangleDTO (String url){
//        connectionManager = new ConnectionManager();
//        multipleCitiesInRectanglePOJO = connectionManager.readRectURL(url);
//    }


    // Coord Getters
    public double getCroodLat() {
        return rectLists.getCoord().getLat();
    }

    public double getCroodLon() {
        return rectLists.getCoord().getLon();
    }

    // Wind  Getters
    public double getWindSpeed() {
        return rectLists.getWind().getSpeed();
    }

    public double getWindDeg() {
        return rectLists.getWind().getDeg();
    }

    //Clouds Getters
    public long getClouds() {
        return rectLists.getClouds().getAll();
    }

    // Rain Getters
    public double getRainType() {
        return rectLists.getRain().getH();
    }
        //Weather getters
        public int getWeatherID ( int option){
            return rectLists.getWeather().indexOf(option);
        }
        //Name getter
        public String getName () {
            return rectLists.getName();
        }
        // Main Getters

        public long getHumidity () {
            return rectLists.getMain().getHumidity();
        }

        public double getTemp () {
            return rectLists.getMain().getTemp();
        }

        public double getTempMax () {
            return rectLists.getMain().getTempMax();
        }

        public double getTempMin () {
            return rectLists.getMain().getTempMin();
        }

        public double getSeaLevel () {
            return rectLists.getMain().getSeaLevel();
        }

        public double getGrndLevel(){
        return rectLists.getMain().getGrndLevel();
        }

        public double getPressure(){
        return rectLists.getMain().getPressure();
        }
}
