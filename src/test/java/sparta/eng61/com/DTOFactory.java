package sparta.eng61.com;

public class DTOFactory {

    /*public static int getDTO() {
        if (url.contains("q=") || url.contains("weather?id=")) {

            //dtoNumber = 1;
        } else if (url.contains("lat")) {
            //dtoNumber = 2;
        } else if (url.contains("group?id=")) {
            //dtoNumber = 3;
        } else if (url.contains("zip=")){
            //dtoNumber = 4;
        }
        //return dtoNumber;
    }*/

    static public DtoType checkDTO(int inputFromInjector) {
        switch (inputFromInjector) {
            case 1:
                return cityNameDTO;
            case 2:
                return cityIdDTO;
            case 3:
                return citiesIdDTO;
            case 4:
                return zipcodeDTO;
        }
    }
}
