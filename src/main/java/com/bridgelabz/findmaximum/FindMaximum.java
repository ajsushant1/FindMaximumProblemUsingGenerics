package com.bridgelabz.findmaximum;

public class FindMaximum<T extends Comparable<T>> {
    T firstValue;
    T secondValue;
    T thirdValue;

    //PARAMETERISED CONSTRUCTOR
    public FindMaximum(T firstValue, T secondValue, T thirdValue) {
        this.firstValue = firstValue;
        this.secondValue = secondValue;
        this.thirdValue = thirdValue;
    }

    //METHOD TO CALL INTERNAL METHOD
    public T getMaximumValue() {
        printMaximum(getMaximumValue(firstValue, secondValue, thirdValue));
        return getMaximumValue(firstValue, secondValue, thirdValue);
    }

    //METHOD TO GET MAXIMUM VALUE
    public <T extends Comparable<T>> T getMaximumValue(T firstValue, T secondValue, T thirdValue) {
        T maxValue = firstValue;
        if (secondValue.compareTo(maxValue) > 0) {
            maxValue = secondValue;
        }
        if (thirdValue.compareTo(maxValue) > 0) {
            maxValue = thirdValue;
        }
        return maxValue;
    }

    //PRINTING MAXIMUM VALUE
    public void printMaximum(T maximumValue){
        System.out.println("Maximum value is"+maximumValue);
    }

    //MAIN METHOD
    public static void main(String[] args) {
        System.out.println("/**************************/ WELCOME TO FIND MAXIMUM /**************************/");
    }
}
