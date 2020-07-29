package sparta.eng61.com;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Injector {
    static String url;

    public int getDTO(String path) {
        if (url.contains("q=") || url.contains("weather?id=")) {
            DtoType cityNameDTO = DTOFactory.checkDTO(1);

        } else if (url.contains("lat")) {
            DtoType cityNameDTO = DTOFactory.checkDTO(2);

        } else if (url.contains("group?id=")) {
            DtoType cityNameDTO = DTOFactory.checkDTO(3);

        } else if (url.contains("zip=")) {
            DtoType cityNameDTO = DTOFactory.checkDTO(4);

        }


    }


}
