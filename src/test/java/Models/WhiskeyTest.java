package Models;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class WhiskeyTest {
    @Test
    public void SetBrandTest(){
        //Given
        String expected = "Nike";
        //when
        Whiskey testBrand = new Whiskey();
        testBrand.setBrand(expected);
        //then
        Assertions.assertEquals(expected,testBrand.getBrand());
    }

    @Test
    public void SetQuantityTest(){
        //Given
        int expected = 2;
        //when
        Whiskey testQnty = new Whiskey();
        testQnty.setQuantity(expected);
        //then
        Assertions.assertEquals(expected,testQnty.getQuantity());
    }
    @Test
    public void SetPriceTest(){
        //Given
        int expected = 200;
        //when
        Whiskey testPrice = new Whiskey();
        testPrice.setPrice(expected);
        //then
        Assertions.assertEquals(expected,testPrice.getPrice());
    }

}
