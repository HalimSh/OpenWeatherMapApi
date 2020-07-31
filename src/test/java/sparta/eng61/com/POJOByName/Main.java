
package sparta.eng61.com.POJOByName;


import com.fasterxml.jackson.annotation.JsonProperty;

public class Main {

    @JsonProperty("feels_like")
    private Double feelsLike;
    private Long humidity;
    private Long pressure;
    private Double temp;
    @JsonProperty("temp_max")
    private Double tempMax;
    @JsonProperty("temp_min")
    private Double tempMin;

    public Double getFeelsLike() {
        return feelsLike;
    }

    public void setFeelsLike(Double feelsLike) {
        this.feelsLike = feelsLike;
    }

    public Long getHumidity() {
        return humidity;
    }

    public void setHumidity(Long humidity) {
        this.humidity = humidity;
    }

    public Long getPressure() {
        return pressure;
    }

    public void setPressure(Long pressure) {
        this.pressure = pressure;
    }

    public Double getTemp() {
        return temp;
    }

    public void setTemp(Double temp) {
        this.temp = temp;
    }

    public Double getTempMax() {
        return tempMax;
    }

    public void setTempMax(Double tempMax) {
        this.tempMax = tempMax;
    }

    public Double getTempMin() {
        return tempMin;
    }

    public void setTempMin(Double tempMin) {
        this.tempMin = tempMin;
    }

}
