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
        this.value += valuetoSubstract;
    }
}
