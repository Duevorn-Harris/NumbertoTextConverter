package com.duevornHarris;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by duevornharris on 6/9/16.
 */
public class MainSpec {

    @Test
    public void transformSingleDigitTest(){
        Main main = new Main();
        String expectedResult = "OneDollars";
        String actualResult = Main.transformSingleDigit("1");
        assertEquals("The string that is expected does not match the actual String: ", expectedResult, actualResult);
    }

    @Test
    public void transformNotUniformDoubleDigitTest(){
        Main main = new Main();
        String expectedResult = "TwentyOneDollars";
        String actualResult = Main.transformNotUniformDoubleDigit("21");
        assertEquals("The string that is expected does not match the actual String: ", expectedResult, actualResult);
    }

    @Test
    public void transformTripleDigitTest(){
        Main main = new Main();
        String expectedResult = "FourHundredSixtySixDollars";
        String actualResult = Main.transformTripleDigit("466");
        assertEquals("The string that is expected does not match the actual String: ", expectedResult, actualResult);
    }

    @Test
    public void transformFourDigitTest(){
        Main main = new Main();
        String expectedResult = "OneThousandTwoHundredThirtyFourDollars";
        String actualResult = Main.transformFourDigit("1234");
        assertEquals("The string that is expected does not match the actual String: ", expectedResult, actualResult);
    }

//    @Test
//    public void transformFiveDigitTest(){
//        Main main = new Main();
//        String expectedResult = "TwelveThousandThreeHundredFortyFiveDollars";
//        String actualResult = Main.transformFiveDigit("12345");
//        assertEquals("The string that is expected does not match the actual String: ", expectedResult, actualResult);
//    }

}
