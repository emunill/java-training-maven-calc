package com.privalia.business.integration.test;

import org.junit.Test;

import com.privalia.business.Calculator;
import com.privalia.business.ICalculator;

import static org.junit.Assert.assertTrue;

public class CalculatorTest {

    @Test
    public void sum() {
        ICalculator calculator = new Calculator();
        assertTrue(5 == calculator.sum(2, 3));
    }

    @Test
    public void substract() {
        ICalculator calculator = new Calculator();
        assertTrue(0 == calculator.substract(2, 2));
    }

    @Test
    public void multiply() {
        ICalculator calculator = new Calculator();
        assertTrue(6 == calculator.multiply(2, 3));
    }

    @Test
    public void divide() {
        ICalculator calculator = new Calculator();
        assertTrue(1 == calculator.divide(2, 2));
    }
}
