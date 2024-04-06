package Services;

import Models.Sneakers;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SneakerServiceTest {

    @Test
    public void ServiceTest(){
        String expectedName = "Stan Smith";
        String expectedBrand = "Adidas";
        String expectedSport = "Tennis";
        float expectedSize = 10.5f;
        int expectedQuantity = 10;
        float expectedPrice = 80.00f;

        SneakersService sneakerService = new SneakersService();
        Sneakers testSneakers = sneakerService.create(expectedName, expectedBrand,
                expectedSport, expectedSize, expectedQuantity, expectedPrice);

        int actualId = testSneakers.getId();
        String actualName = testSneakers.getName();
        String actualBrand = testSneakers.getBrand();
        String actualSport = testSneakers.getSport();
        float actualSize = testSneakers.getSize();
        int actualQty = testSneakers.getQuantity();
        float actualPrice = testSneakers.getPrice();
        
        Assertions.assertEquals(Integer.class.getName(), new Integer(actualId).getClass().getName());
        Assertions.assertEquals(expectedName, actualName);
        Assertions.assertEquals(expectedBrand, actualBrand);
        Assertions.assertEquals(expectedSport, actualSport);
        Assertions.assertEquals(expectedSize, actualSize);
        Assertions.assertEquals(expectedQuantity, actualQty);
        Assertions.assertEquals(expectedPrice, actualPrice);
    }
}
