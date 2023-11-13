package model;

import java.io.Serializable;

public class Calculator implements Serializable{
    private double firstNumber;
    private double secondNumber;

    public Calculator(double a, double b) {
        this.firstNumber = a;
        this.secondNumber = b;
    }

    public Calculator() {
    }

    public double getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    public double getSecondNumber() {
        return secondNumber;
    }

    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }
    
    
}
