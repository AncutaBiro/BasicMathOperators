package org.example;

public class User {


    public int add (int firstValue, int secondValue) {
        return firstValue + secondValue;
    }
    public double add (double firstValue, double secondValue) {
        return firstValue + secondValue;
    }

    public int subtract (int firstValue, int secondValue) {
        return firstValue - secondValue;
    }
    public double subtract (double firstValue, double secondValue) {
        return firstValue - secondValue;
    }

    public int multiplication (int firstValue, int secondValue) {
        return firstValue * secondValue;
    }
    public double multiplication (double firstValue, double secondValue) {
        return firstValue * secondValue;
    }

    public int divide (int firstValue, int secondValue) {
        return firstValue / secondValue;
    }
    public double divide (double firstValue, double secondValue) {
        return firstValue / secondValue;
    }

    public int modulo (int firstValue, int secondValue) {
        return firstValue % secondValue;
    }
    public double modulo (double firstValue, double secondValue) {
        return firstValue % secondValue;
    }

    public int calculate1 (int firstValue, int secondValue, int thirdValue) {
        return firstValue + secondValue * thirdValue;
    }
    public double calculate1 (double firstValue, int secondValue, int thirdValue) {
        return firstValue + secondValue * thirdValue;
    }

    public int calculate2 (int firstValue, int secondValue, int thirdValue) {
        thirdValue--;
        return firstValue * secondValue + thirdValue;
    }
    public double calculate2 (int firstValue, int secondValue, double thirdValue) {
        thirdValue--;
        return firstValue * secondValue + thirdValue;
    }

}
