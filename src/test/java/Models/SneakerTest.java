package Models;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SneakerTest {
    @Test
    public void SetNameTest(){
        //Given
        String expected = "CH324";
        //when
        Sneakers testName = new Sneakers();
        testName.setName(expected);
        //then
        Assertions.assertEquals(expected,testName.getName());
    }

    @Test
    public void SetIdTest(){
        //Given
        int expected = 1;
        //when
        Sneakers testId = new Sneakers();
        testId.setId(expected);
        //then
        Assertions.assertEquals(expected,testId.getId());
    }

    @Test
    public void SetBrandTest(){
        //Given
        String expected = "Nike";
        //when
        Sneakers testBrand = new Sneakers();
        testBrand.setBrand(expected);
        //then
        Assertions.assertEquals(expected,testBrand.getBrand());
    }

    @Test
    public void SetSportTest(){
        //Given
        String expected = "Soccer";
        //when
        Sneakers testSport = new Sneakers();
        testSport.setSport(expected);
        //then
        Assertions.assertEquals(expected,testSport.getSport());
    }
    @Test
    public void SetSizeTest(){
        //Given
        int expected = 9;
        //when
        Sneakers testSize = new Sneakers();
        testSize.setSize(expected);
        //then
        Assertions.assertEquals(expected,testSize.getSize());
    }
    @Test
    public void SetQuantityTest(){
        //Given
        int expected = 2;
        //when
        Sneakers testQnty = new Sneakers();
        testQnty.setQuantity(expected);
        //then
        Assertions.assertEquals(expected,testQnty.getQuantity());
    }

    @Test
    public void SetPriceTest(){
        //Given
        int expected = 200;
        //when
        Sneakers testPrice = new Sneakers();
        testPrice.setPrice(expected);
        //then
        Assertions.assertEquals(expected,testPrice.getPrice());
    }


}
