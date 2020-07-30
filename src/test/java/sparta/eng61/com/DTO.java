package sparta.eng61.com;

public abstract class DTO {

    CityNameDTO cityNameDTO;

    public  CityNameDTO getCityNameDTO() {
        return cityNameDTO = new CityNameDTO("name");
    }

}
