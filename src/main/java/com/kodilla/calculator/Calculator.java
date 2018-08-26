package com.kodilla.calculator;

public class Calculator {
    public double addValues(double valueA, double valueB) {
        return valueA + valueB;
    }

    public void substractValue(double valueA, double valueB) { return valueA - valueB; }

    public static void main(String[] args) {
        Calculator calculator = new Calculator(0);
        calculator.addValue(2);
        System.out.println(calculator);
        calculator.substractValue(55.5);
        System.out.println(calculator);
    }
}
