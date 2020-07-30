package sparta.eng61.com;

import sparta.eng61.com.CityNameDTO;

public class Controller {


    private CityNameDTO cityNameDTO;
    private ByCycleDTO byCycleDTO;
    private HeadersDTO headersDTO;

    public Controller() {
        cityNameDTO = new CityNameDTO();
        byCycleDTO = new ByCycleDTO();
        headersDTO = new HeadersDTO("dvlnhjdskv.k");

    }


    public CityNameDTO getCityNameDTO() {
        return cityNameDTO;
    }

    public void setCityNameDTO(CityNameDTO cityNameDTO) {
        this.cityNameDTO = cityNameDTO;
    }

    public ByCycleDTO getByCycleDTO() {
        return byCycleDTO;
    }

    public void setByCycleDTO(ByCycleDTO byCycleDTO) {
        this.byCycleDTO = byCycleDTO;
    }

    public HeadersDTO getHeadersDTO() {
        return headersDTO;
    }

    public void setHeadersDTO(HeadersDTO headersDTO) {
        this.headersDTO = headersDTO;
    }
}
