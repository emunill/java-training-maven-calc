package com.privalia.business.unit.test;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

import com.privalia.business.ICalculator;


public class CalculatorUnitTest {
    @Mock
    ICalculator iCalculator; //obj mockeado

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this); //instancia todos los mocks de esta clase
    }

    @Test
    public void testSum() {
        when(iCalculator.sum(2, 3)).thenReturn(5);
        assertTrue(5 == iCalculator.sum(2, 3));
    }

    @Test
    public void testSubstract() {
        when(iCalculator.substract(2, 3)).thenReturn(-1);
        assertTrue(-1 == iCalculator.substract(2, 3));
    }

    @Test
    public void testMultiply() {
        when(iCalculator.multiply(2, 3)).thenReturn(6);
        assertTrue(6 == iCalculator.multiply(2, 3));
    }

    @Test
    public void testDivide() {
        when(iCalculator.divide(6, 3)).thenReturn(2);
        assertTrue(2 == iCalculator.divide(6, 3));
    }
}
