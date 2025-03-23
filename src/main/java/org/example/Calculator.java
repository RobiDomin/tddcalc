package org.example;

public class Calculator {

    public double add(double a, double b) { //Dodawanie
        return a + b;
    }

    public double substract(double a, double b) { //Odejmowanie
        return a - b;
    }

    public double multiply(double a, double b) { // Mnozenie
        return a * b;
    }

    public double divide(double a, double b) { // Dzielenie
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return a / b;
    }

    public double sqrt(double a) { //Pierwiastekkw
        if (a < 0) {
            throw new ArithmeticException("Cannot calculate the square root of a negative number");
        }
        return Math.sqrt(a);
    }

    public double power(double base, double exponent) { //Potegowanie
        return Math.pow(base, exponent);
    }

    public double modulo(double a, double b) { //Dzielenie z reszta
        if (b == 0) {
            throw new ArithmeticException("Cannot calculate modulo with divisor zero");
        }
        return a % b;
    }
}