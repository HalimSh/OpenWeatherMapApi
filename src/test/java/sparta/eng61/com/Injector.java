package sparta.eng61.com;

public class Injector {
    static String url;

    public int getDTO(String path) {
        if (url.contains("q=") || url.contains("weather?id=")) {
            DtoType cityNameDTO = POJOFactory.checkPOJO(1);

        } else if (url.contains("lat")) {
            DtoType cityNameDTO = POJOFactory.checkPOJO(2);

        } else if (url.contains("group?id=")) {
            DtoType cityNameDTO = POJOFactory.checkPOJO(3);

        } else if (url.contains("zip=")) {
            DtoType cityNameDTO = POJOFactory.checkPOJO(4);

        }


    }


}
