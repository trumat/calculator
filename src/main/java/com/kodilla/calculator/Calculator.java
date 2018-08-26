package com.kodilla.calculator;

public class Calculator {
    public double addValues(double valueA, double valueB) {
        return valueA + valueB;
    }

    public double substractValues(double valueA, double valueB) { return valueA - valueB; }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println("2 + 4 = " + calculator.addValues(2, 4));
        System.out.println("55.5 - 100 = " + calculator.substractValues(55.5, 100));
    }
}
