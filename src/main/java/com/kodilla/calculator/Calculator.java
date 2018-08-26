package com.kodilla.calculator;

public class Calculator {
    public double addValues(double valueA, double valueB) {
        return valueA + valueB;
    }

    public void substractValues(double valueA, double valueB) { return valueA - valueB; }

    public static void main(String[] args) {
        Calculator calculator = new Calculator(0);
        System.out.println(calculator.addValues(2, 4));
        System.out.println(calculator.substractValues(55.5, 100));
    }
}
