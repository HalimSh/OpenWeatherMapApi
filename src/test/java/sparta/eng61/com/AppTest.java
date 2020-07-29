package sparta.eng61.com;

//import static org.junit.Assert.assertTrue;
//
//import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    HeadersDTO headersDTO = new HeadersDTO("HTTP URL");
    CityNameDTO cityNameDTO = new CityNameDTO("HTTP URL");

    /**
     * Rigorous Test :-)
     */
//    @Test
//    public void shouldAnswerWithTrue()
//    {
//        assertTrue( true );
//    }

    @Test
    @DisplayName("Checking the Day, Date and time of when the request was made.")
    public void dayDateTimeTest(){
        Assertions.assertEquals("openresty",headersDTO.getServer());
    }

    @Test
    @DisplayName("Checking Longitude")
    public void lonTest(){
        Assertions.assertEquals(-0.13,cityNameDTO.getCroodLon());
    }
}
