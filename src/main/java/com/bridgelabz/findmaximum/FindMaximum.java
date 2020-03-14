package com.bridgelabz.findmaximum;

public class FindMaximum {

    //METHOD TO GET MAXIMUM INTEGER NUMBER
    public Integer getMaximumInteger(Integer firstNumber,Integer secondNumber,Integer thirdNumber) {
        Integer max = firstNumber;
        if (secondNumber.compareTo(max) > 0) {
            return secondNumber;
        } else if (thirdNumber.compareTo(max) > 0) {
            return thirdNumber;
        }
        return firstNumber;
    }

    public static void main(String[] args) {
        System.out.println("/**************************/ WELCOME TO FIND MAXIMUM /**************************/");
    }
}
