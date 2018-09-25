package com.privalia.business.integration.test;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.privalia.business.Calculator;
import com.privalia.business.ICalculator;

import static org.junit.Assert.assertTrue;

@RunWith(JUnitParamsRunner.class) //Indicamos que esta class la va ejecutar el Runner de JUnitParams
public class CalculatorParametrizedTest {
    @Test
    @Parameters({"0,0,0","2,2,4"})
    public void shouldReturnCorrectSum(int first, int second, int expectedResult) {
        ICalculator calculator = new Calculator();
        int actualResult = calculator.sum(first, second);
        assertTrue(expectedResult == actualResult);
    }

    @Test
    @Parameters({"2,1,1","10,2,8"})
    public void shouldReturnSubstractSum(int first, int second, int expectedResult) {
        ICalculator calculator = new Calculator();
        int actualResult = calculator.substract(first, second);
        assertTrue(expectedResult == actualResult);
    }

    @Test
    @Parameters({"0,5,0","11,2,22"})
    public void shouldReturnCorrectMultiply(int first, int second, int expectedResult) {
        ICalculator calculator = new Calculator();
        int actualResult = calculator.multiply(first, second);
        assertTrue(expectedResult == actualResult);
    }

    @Test
    @Parameters({"10,2,5","9,3,3"})
    public void shouldReturnCorrectDivide(int first, int second, int expectedResult) {
        ICalculator calculator = new Calculator();
        int actualResult = calculator.divide(first, second);
        assertTrue(expectedResult == actualResult);
    }
}
