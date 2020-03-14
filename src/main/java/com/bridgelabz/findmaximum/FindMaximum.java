package com.bridgelabz.findmaximum;

public class FindMaximum {

    //METHOD TO GET MAXIMUM INTEGER NUMBER
    public Integer getMaximumInteger(Integer firstNumber, Integer secondNumber, Integer thirdNumber) {
        Integer maxNumber = firstNumber;
        if (secondNumber.compareTo(maxNumber) > 0 ) {
            maxNumber=secondNumber;
        }
        if (thirdNumber.compareTo(maxNumber) > 0) {
            maxNumber=thirdNumber;
        }
        return maxNumber;
    }

    public static void main(String[] args) {
        System.out.println("/**************************/ WELCOME TO FIND MAXIMUM /**************************/");
    }
}
