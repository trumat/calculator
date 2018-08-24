package com.kodilla.calculator;

public class Calculator {
    private double value;

    public Calculator(int x) {
        this.value = x;
    }

    public void addValue(double valueToAdd) {
        this.value += valueToAdd;
    }

    public void substractValue(double valuetoSubstract) {
        this.value -= valuetoSubstract;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator(0);
        calculator.addValue(2);
        System.out.println(calculator);
        calculator.substractValue(55.5);
        System.out.println(calculator);
    }
}
