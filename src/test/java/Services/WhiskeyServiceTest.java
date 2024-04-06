package Services;

import Models.Sneakers;
import Models.Whiskey;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class WhiskeyServiceTest {

    @Test
    public void ServiceTest(){
        String expectedBrand = "Adidas";
        int expectedQuantity = 10;
        float expectedPrice = 580.00f;

        WhiskeyService whiskeyService = new WhiskeyService();
        Whiskey testWhiskey = whiskeyService.create(expectedBrand, expectedQuantity, expectedPrice);


        int actualId = testWhiskey.getId();
        String actualBrand = testWhiskey.getBrand();
        int actualQty = testWhiskey.getQuantity();
        float actualPrice = testWhiskey.getPrice();

        Assertions.assertEquals(Integer.class.getName(), new Integer(actualId).getClass().getName());
        Assertions.assertEquals(expectedBrand, actualBrand);
        Assertions.assertEquals(expectedQuantity, actualQty);
        Assertions.assertEquals(expectedPrice, actualPrice);
    }
}
