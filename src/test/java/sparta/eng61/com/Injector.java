package sparta.eng61.com;

import sparta.eng61.com.POJOByName.CityNamePOJO;

public class Injector {
    static String url;
    CityNamePOJO pojoPayload;

//    public Injector(CityNamePOJO pojoPayload) {
//        this.pojoPayload = pojoPayload;
//    }

    public CityNamePOJO getPojoPayload() {
        return pojoPayload;
    }

    public void setPojoPayload(CityNamePOJO pojoPayload) {
        this.pojoPayload = pojoPayload;
    }

//    public int getDTO(String path) {
//        if (url.contains("q=") || url.contains("weather?id=")) {
//             cityNameDTO = POJOFactory.checkPOJO(1);
//
//        } else if (url.contains("lat")) {
//            DtoType cityNameDTO = POJOFactory.checkPOJO(2);
//
//        } else if (url.contains("group?id=")) {
//            DtoType cityNameDTO = POJOFactory.checkPOJO(3);
//
//        } else if (url.contains("zip=")) {
//            DtoType cityNameDTO = POJOFactory.checkPOJO(4);
//
//        }
//
//
//    }
//
//    public int getDTO(String url) {
//        if (url.contains("q=") || url.contains("weather?id=")) {
//            DtoType cityNameDTO = POJOFactory.checkPOJO(1);
//
//        } else if (url.contains("lat")) {
//            DtoType cityNameDTO = POJOFactory.checkPOJO(2);
//
//        } else if (url.contains("group?id=")) {
//            DtoType cityNameDTO = POJOFactory.checkPOJO(3);
//
//        } else if (url.contains("zip=")) {
//            DtoType cityNameDTO = POJOFactory.checkPOJO(4);
//
//        }


    }


//}
