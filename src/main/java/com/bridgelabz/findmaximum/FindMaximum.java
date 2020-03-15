package com.bridgelabz.findmaximum;

public class FindMaximum<T extends Comparable<T>> {

    //METHOD TO GET MAXIMUM VALUE
    public T getMaximumValue(T firstValue, T secondValue, T thirdValue) {
        T maxValue = firstValue;
        if (secondValue.compareTo(maxValue) > 0) {
            maxValue = secondValue;
        }
        if (thirdValue.compareTo(maxValue) > 0) {
            maxValue = thirdValue;
        }
        return maxValue;
    }

    public static void main(String[] args) {
        System.out.println("/**************************/ WELCOME TO FIND MAXIMUM /**************************/");
    }
}
