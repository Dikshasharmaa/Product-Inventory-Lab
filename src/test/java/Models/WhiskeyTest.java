package Models;

import Utils.CSVUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WhiskeyTest {

    @Test
    public void TestConstructor(){
        int expectedId = 1;
        String expectedBrand = "Crown Royal Canadian";
        int expectedQuantity = 10;
        float expectedPrice = 580.00f;

        Whiskey testWhiskey = new Whiskey(expectedId, expectedBrand, expectedQuantity,expectedPrice);
        Assertions.assertEquals(expectedId, testWhiskey.getId());
        Assertions.assertEquals(expectedBrand, testWhiskey.getBrand());
        Assertions.assertEquals(expectedQuantity, testWhiskey.getQuantity());
        Assertions.assertEquals(expectedPrice, testWhiskey.getPrice());

    }
    @Test
    public void SetBrandTest(){
        //Given
        String expected = "Crown Royal Canadian";
        //when
        Whiskey testBrand = new Whiskey(1,"Crown Royal Canadian",0,0);
        testBrand.setBrand(expected);
        //then
        Assertions.assertEquals(expected,testBrand.getBrand());
    }

    @Test
    public void SetQuantityTest(){
        //Given
        int expected = 2;
        //when
        Whiskey testQnty = new Whiskey(1,"Crown Royal Canadian",20,0);
        testQnty.setQuantity(expected);
        //then
        Assertions.assertEquals(expected,testQnty.getQuantity());
    }
    @Test
    public void SetPriceTest(){
        //Given
        int expected = 200;
        //when
        Whiskey testPrice = new Whiskey(1,"Crown Royal Canadian",0,580.00f);
        testPrice.setPrice(expected);
        //then
        Assertions.assertEquals(expected,testPrice.getPrice());
    }


}
