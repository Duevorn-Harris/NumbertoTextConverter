package com.duevornHarris;

import java.io.*;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by duevornharris on 6/9/16.
 */
public class Main {

    public static void matchPatternToAppropriateFunction(String number){

        if(matchSingleDigit(number)){
            transformSingleDigit(number);
        }
        if(matchDoubleDigit(number)){
            transformNotUniformDoubleDigit(number);
        }
        if(matchTripleDigit(number)){
            transformTripleDigit(number);
        }
        if(matchFourDigit(number)){
            transformFourDigit(number);
        }
    }

    public static boolean matchSingleDigit(String input){

        return input.matches("^\\w*");

    }

    public static boolean matchDoubleDigit(String input){

        return input.matches("^\\w{2}$");
    }

    public static boolean matchTripleDigit(String input){

        return input.matches("^\\w{3}$");
    }

    public static boolean matchFourDigit(String input){

        return input.matches("^\\w{4}$");
    }

//    public static boolean matchFiveDigit(String input){
//
//        return input.matches("^\\w{5}$");
//    }
//
//    public static boolean matchSixDigit(String input){
//
//        return input.matches("^\\w{6}$");
//    }
//
//    public static boolean matchSevenDigit(String input){
//
//        return input.matches("^\\w{7}$");
//    }
//
//    public static boolean matchEightDigit(String input){
//
//        return input.matches("^\\w{8}$");
//    }
//
//    public static boolean matchNineDigit(String input){
//
//        return input.matches("^\\w{9}$");
//    }

    //This first function is intended to take the integer value in as key for the HashMap
    //and then return a string for the key and concatenate dollars to the string.
    public static String transformSingleDigit(String number) {
        HashMap<String, String> ones = new HashMap<String, String>();
        ones.put("1", "One");
        ones.put("2", "Two");
        ones.put("3", "Three");
        ones.put("4", "Four");
        ones.put("5'", "Five");
        ones.put("6", "Six");
        ones.put("7", "Seven");
        ones.put("8", "Eight");
        ones.put("9", "Nine");
        ones.put("0", "Zero");

        String returnNumber = ones.get(number);

        System.out.println(returnNumber + "Dollars");
        if (returnNumber != null) {
            return returnNumber + "Dollars";
        }//append dollars to the hashmap key value
        else {
            return "";
        }

    }

    public static String transformNotUniformDoubleDigit(String number) {
        String[] convertString = number.split("");
        String firstPosition = convertString[0];
        String secondPosition = convertString[1];

        HashMap<String, String> ones = new HashMap<String, String>();
        ones.put("1", "One");
        ones.put("2", "Two");
        ones.put("3", "Three");
        ones.put("4", "Four");
        ones.put("5'", "Five");
        ones.put("6", "Six");
        ones.put("7", "Seven");
        ones.put("8", "Eight");
        ones.put("9", "Nine");
        ones.put("0", "Zero");

        HashMap<String, String> tens = new HashMap<String, String>();
        tens.put("10", "Ten");
        tens.put("20", "Twenty");
        tens.put("30", "Thirty");
        tens.put("40", "Forty");
        tens.put("50", "Fifty");
        tens.put("60", "Sixty");
        tens.put("70", "Seventy");
        tens.put("80", "Eighty");
        tens.put("90", "Ninety");

        if (secondPosition.matches("^\\w$")) {
            return tens.get(firstPosition + "0") + ones.get(secondPosition) + "Dollars";
        } else {
            return tens.get(number);
        }

    }

    public static String transformTripleDigit(String number) {
        String[] convertString = number.split("");
        String firstPosition = convertString[0];
        String secondPosition = convertString[1];
        String thirdPosition = convertString[2];

        HashMap<String, String> ones = new HashMap<String, String>();
        ones.put("1", "One");
        ones.put("2", "Two");
        ones.put("3", "Three");
        ones.put("4", "Four");
        ones.put("5'", "Five");
        ones.put("6", "Six");
        ones.put("7", "Seven");
        ones.put("8", "Eight");
        ones.put("9", "Nine");
        ones.put("0", "Zero");

        HashMap<String, String> tens = new HashMap<String, String>();
        tens.put("10", "Ten");
        tens.put("20", "Twenty");
        tens.put("30", "Thirty");
        tens.put("40", "Forty");
        tens.put("50", "Fifty");
        tens.put("60", "Sixty");
        tens.put("70", "Seventy");
        tens.put("80", "Eighty");
        tens.put("90", "Ninety");

       return ones.get(firstPosition)+ "Hundred" + tens.get(secondPosition + "0") + ones.get(thirdPosition) + "Dollars";

    }

    public static String transformFourDigit(String number) {
        String[] convertString = number.split("");
        String firstPosition = convertString[0];
        String secondPosition = convertString[1];
        String thirdPosition = convertString[2];
        String fourthPosition = convertString[3];

        HashMap<String, String> ones = new HashMap<String, String>();
        ones.put("1", "One");
        ones.put("2", "Two");
        ones.put("3", "Three");
        ones.put("4", "Four");
        ones.put("5'", "Five");
        ones.put("6", "Six");
        ones.put("7", "Seven");
        ones.put("8", "Eight");
        ones.put("9", "Nine");
        ones.put("0", "Zero");

        HashMap<String, String> tens = new HashMap<String, String>();
        tens.put("10", "Ten");
        tens.put("20", "Twenty");
        tens.put("30", "Thirty");
        tens.put("40", "Forty");
        tens.put("50", "Fifty");
        tens.put("60", "Sixty");
        tens.put("70", "Seventy");
        tens.put("80", "Eighty");
        tens.put("90", "Ninety");

        return ones.get(firstPosition)+ "Thousand" + ones.get(secondPosition)+ "Hundred" + tens.get(thirdPosition + "0")
                + ones.get(fourthPosition) + "Dollars";

    }

//    public static String transformFiveDigit(String number) {
//        String[] convertString = number.split("");
//        String firstPosition = convertString[0];
//        String secondPosition = convertString[1];
//        String thirdPosition = convertString[2];
//        String fourthPosition = convertString[3];
//        String fifthPosition = convertString[4];
//
//        HashMap<String, String> ones = new HashMap<String, String>();
//        ones.put("1", "One");
//        ones.put("2", "Two");
//        ones.put("3", "Three");
//        ones.put("4", "Four");
//        ones.put("5'", "Five");
//        ones.put("6", "Six");
//        ones.put("7", "Seven");
//        ones.put("8", "Eight");
//        ones.put("9", "Nine");
//        ones.put("0", "Zero");
//
//        HashMap<String, String> tens = new HashMap<String, String>();
//        tens.put("10", "Ten");
//        tens.put("20", "Twenty");
//        tens.put("30", "Thirty");
//        tens.put("40", "Forty");
//        tens.put("50", "Fifty");
//        tens.put("60", "Sixty");
//        tens.put("70", "Seventy");
//        tens.put("80", "Eighty");
//        tens.put("90", "Ninety");
//
//        HashMap<String, String> teens = new HashMap<String, String>();
//        tens.put("1" + "1", "Eleven");
//        tens.put("1" + "2", "Twelve");
//        tens.put("1" + "3", "Thirteen");
//        tens.put("1" + "4", "Fourteen");
//        tens.put("1" + "5", "Fifteen");
//        tens.put("1" + "6", "Sixteen");
//        tens.put("1" + "7", "Seventeen");
//        tens.put("1" + "8", "Eighteen");
//        tens.put("1" + "9", "Nineteen");
//
//
//
//        return teens.get(firstPosition + secondPosition) + "Thousand" + ones.get(thirdPosition) + "Hundred" + tens.get(fourthPosition + "0")
//                + ones.get(fifthPosition) + "Dollars" ;
//
//    }
//
//    public static String transformSixDigit(String number) {
//        String[] convertString = number.split("");
//        String firstPosition = convertString[0];
//        String secondPosition = convertString[1];
//        String thirdPosition = convertString[2];
//        String fourthPosition = convertString[3];
//        String fifthPosition = convertString[4];
//        String sixthPosition = convertString[5];
//
//        HashMap<String, String> ones = new HashMap<String, String>();
//        ones.put("1", "One");
//        ones.put("2", "Two");
//        ones.put("3", "Three");
//        ones.put("4", "Four");
//        ones.put("5'", "Five");
//        ones.put("6", "Six");
//        ones.put("7", "Seven");
//        ones.put("8", "Eight");
//        ones.put("9", "Nine");
//        ones.put("0", "Zero");
//
//        HashMap<String, String> tens = new HashMap<String, String>();
//        tens.put("10", "Ten");
//        tens.put("20", "Twenty");
//        tens.put("30", "Thirty");
//        tens.put("40", "Forty");
//        tens.put("50", "Fifty");
//        tens.put("60", "Sixty");
//        tens.put("70", "Seventy");
//        tens.put("80", "Eighty");
//        tens.put("90", "Ninety");
//
//        return ones.get(firstPosition)+ "Thousand" + ones.get(secondPosition)+ "Hundred" + tens.get(thirdPosition + "0")
//                + ones.get(fourthPosition) + "Dollars";
//
//    }
//
//    public static String transformSevenDigit(String number) {
//        String[] convertString = number.split("");
//        String firstPosition = convertString[0];
//        String secondPosition = convertString[1];
//        String thirdPosition = convertString[2];
//        String fourthPosition = convertString[3];
//        String fifthPosition = convertString[3];
//        String sixthhPosition = convertString[3];
//        String seventhPosition = convertString[3];
//
//        HashMap<String, String> ones = new HashMap<String, String>();
//        ones.put("1", "One");
//        ones.put("2", "Two");
//        ones.put("3", "Three");
//        ones.put("4", "Four");
//        ones.put("5'", "Five");
//        ones.put("6", "Six");
//        ones.put("7", "Seven");
//        ones.put("8", "Eight");
//        ones.put("9", "Nine");
//        ones.put("0", "Zero");
//
//        HashMap<String, String> tens = new HashMap<String, String>();
//        tens.put("10", "Ten");
//        tens.put("20", "Twenty");
//        tens.put("30", "Thirty");
//        tens.put("40", "Forty");
//        tens.put("50", "Fifty");
//        tens.put("60", "Sixty");
//        tens.put("70", "Seventy");
//        tens.put("80", "Eighty");
//        tens.put("90", "Ninety");
//
//        return ones.get(firstPosition)+ "Thousand" + ones.get(secondPosition)+ "Hundred" + tens.get(thirdPosition + "0")
//                + ones.get(fourthPosition) + "Dollars";
//
//    }
//
//    public static String transformEightDigit(String number) {
//        String[] convertString = number.split("");
//        String firstPosition = convertString[0];
//        String secondPosition = convertString[1];
//        String thirdPosition = convertString[2];
//        String fourthPosition = convertString[3];
//        String fifthPosition = convertString[3];
//        String sixthPosition = convertString[3];
//        String seventhPosition = convertString[3];
//        String eighthPosition = convertString[3];
//
//
//        HashMap<String, String> ones = new HashMap<String, String>();
//        ones.put("1", "One");
//        ones.put("2", "Two");
//        ones.put("3", "Three");
//        ones.put("4", "Four");
//        ones.put("5'", "Five");
//        ones.put("6", "Six");
//        ones.put("7", "Seven");
//        ones.put("8", "Eight");
//        ones.put("9", "Nine");
//        ones.put("0", "Zero");
//
//        HashMap<String, String> tens = new HashMap<String, String>();
//        tens.put("10", "Ten");
//        tens.put("20", "Twenty");
//        tens.put("30", "Thirty");
//        tens.put("40", "Forty");
//        tens.put("50", "Fifty");
//        tens.put("60", "Sixty");
//        tens.put("70", "Seventy");
//        tens.put("80", "Eighty");
//        tens.put("90", "Ninety");
//
//        return ones.get(firstPosition)+ "Thousand" + ones.get(secondPosition)+ "Hundred" + tens.get(thirdPosition + "0")
//                + ones.get(fourthPosition) + "Dollars";
//
//    }
//
//    public static String transformNineDigit(String number) {
//        String[] convertString = number.split("");
//        String firstPosition = convertString[0];
//        String secondPosition = convertString[1];
//        String thirdPosition = convertString[2];
//        String fourthPosition = convertString[3];
//        String fifthPosition = convertString[3];
//        String sixthPosition = convertString[3];
//        String seventhPosition = convertString[3];
//        String eighthPosition = convertString[3];
//        String ninthPosition = convertString[3];
//
//
//
//        HashMap<String, String> ones = new HashMap<String, String>();
//        ones.put("1", "One");
//        ones.put("2", "Two");
//        ones.put("3", "Three");
//        ones.put("4", "Four");
//        ones.put("5'", "Five");
//        ones.put("6", "Six");
//        ones.put("7", "Seven");
//        ones.put("8", "Eight");
//        ones.put("9", "Nine");
//        ones.put("0", "Zero");
//
//        HashMap<String, String> tens = new HashMap<String, String>();
//        tens.put("10", "Ten");
//        tens.put("20", "Twenty");
//        tens.put("30", "Thirty");
//        tens.put("40", "Forty");
//        tens.put("50", "Fifty");
//        tens.put("60", "Sixty");
//        tens.put("70", "Seventy");
//        tens.put("80", "Eighty");
//        tens.put("90", "Ninety");
//
//        return ones.get(firstPosition)+ "Thousand" + ones.get(secondPosition)+ "Hundred" + tens.get(thirdPosition + "0")
//                + ones.get(fourthPosition) + "Dollars";
//
//    }






    public static void main(String[] args) throws IOException {
//        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
//        String s;
//        while ((s = in.readLine()) != null) {
//            System.out.println(s);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number you would like to transform.");
        String enteredNumber = scanner.next();
        matchPatternToAppropriateFunction(enteredNumber);
        }
    }




