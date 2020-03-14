package com.bridgelabz.findmaximum;

public class FindMaximum {

    //METHOD TO GET MAXIMUM INTEGER NUMBER
    public Integer getMaximumInteger(Integer firstNumber, Integer secondNumber, Integer thirdNumber) {
        Integer maxNumber = firstNumber;
        if (secondNumber.compareTo(maxNumber) > 0) {
            maxNumber = secondNumber;
        }
        if (thirdNumber.compareTo(maxNumber) > 0) {
            maxNumber = thirdNumber;
        }
        return maxNumber;
    }

    //METHOD TO GET MAXIMUM FLOAT NUMBER
    public Float getMaximumFloat(Float firstNumber, Float secondNumber, Float thirdNumber) {
        Float maxNumber = firstNumber;
        if (secondNumber.compareTo(maxNumber) > 0) {
            maxNumber = secondNumber;
        }
        if (thirdNumber.compareTo(maxNumber) > 0) {
            maxNumber = thirdNumber;
        }
        return maxNumber;
    }

    //METHOD TO GET MAXIMUM STRING VALUE
    public String getMaximumString(String firstString, String secondString, String thirdString) {
        String maxString = firstString;
        if (secondString.compareTo(maxString) > 0) {
            maxString = secondString;
        }
        if (thirdString.compareTo(maxString) > 0) {
            maxString = thirdString;
        }
        return maxString;
    }

    public static void main(String[] args) {
        System.out.println("/**************************/ WELCOME TO FIND MAXIMUM /**************************/");
    }
}
