package Models;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SneakerTest {
    @Test
    public void ConstructorTest(){
        int expectedId = 6;
        String expectedName = "Stan Smith";
        String expectedBrand = "Nike";
        String expectedSport = "Tennis";
        int expectedQuantity = 10;
        float expectedPrice = 80.00f;

        Sneakers testSneakers = new Sneakers(expectedId, expectedName, expectedBrand,
                expectedSport, expectedQuantity,expectedPrice);

        Assertions.assertEquals(expectedId, testSneakers.getId());
        Assertions.assertEquals(expectedName, testSneakers.getName());
        Assertions.assertEquals(expectedBrand, testSneakers.getBrand());
        Assertions.assertEquals(expectedSport, testSneakers.getSport());
        Assertions.assertEquals(expectedQuantity, testSneakers.getQuantity());
        Assertions.assertEquals(expectedPrice, testSneakers.getPrice());
    }
    @Test
    public void SetNameTest(){
        //Given
        String expected = "Stan Smith";
        //when
        Sneakers testName = new Sneakers(6,"Stan Smith","Nike","Tennis",10,80.00f);
        testName.setName(expected);
        //then
        Assertions.assertEquals(expected,testName.getName());
    }

    @Test
    public void SetIdTest(){
        //Given
        int expected = 6;
        //when
        Sneakers testId = new Sneakers(6,"Stan Smith","Nike","Tennis",10,80.00f);
        testId.setId(expected);
        //then
        Assertions.assertEquals(expected,testId.getId());
    }

    @Test
    public void SetBrandTest(){
        //Given
        String expected = "Nike";
        //when
        Sneakers testBrand = new Sneakers(6,"Stan Smith","Nike","Tennis",10,80.00f);
        testBrand.setBrand(expected);
        //then
        Assertions.assertEquals(expected,testBrand.getBrand());
    }

    @Test
    public void SetSportTest(){
        //Given
        String expected = "Soccer";
        //when
        Sneakers testSport = new Sneakers(6,"Stan Smith","Nike","Tennis",10,80.00f);
        testSport.setSport(expected);
        //then
        Assertions.assertEquals(expected,testSport.getSport());
    }
    @Test
    public void SetSizeTest(){
        //Given
        int expected = 9;
        //when
        Sneakers testSize = new Sneakers(6,"Stan Smith","Nike","Tennis",10,80.00f);
        testSize.setSize(expected);
        //then
        Assertions.assertEquals(expected,testSize.getSize());
    }
    @Test
    public void SetQuantityTest(){
        //Given
        int expected = 2;
        //when
        Sneakers testQnty = new Sneakers(6,"Stan Smith","Nike","Tennis",10,80.00f);
        testQnty.setQuantity(expected);
        //then
        Assertions.assertEquals(expected,testQnty.getQuantity());
    }

    @Test
    public void SetPriceTest(){
        //Given
        int expected = 200;
        //when
        Sneakers testPrice = new Sneakers(6,"Stan Smith","Nike","Tennis",10,80.00f);
        testPrice.setPrice(expected);
        //then
        Assertions.assertEquals(expected,testPrice.getPrice());
    }



}
