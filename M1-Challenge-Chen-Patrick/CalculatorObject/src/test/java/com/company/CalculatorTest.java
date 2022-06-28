package com.company;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {
    private Calculator calculator;

    @Before
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    public void shouldAddTwoPositiveIntegers() {
        int expectedOutput = 5;
        int actualOutput = calculator.add(3, 2);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void shouldAddTwoPositiveIntegersDoubles() {
        double expectedOutput = 7.40;
        double actualOutput = calculator.add(3.02, 4.38);
        assertEquals(expectedOutput, actualOutput, 0.001);
    }

    @Test
    public void shouldSubtractTwoIntegers() {
        int expectedOutput = 7;
        int actualOutput = calculator.subtract(10, 3);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void shouldSubtractTwoDoubleNumbers() {
        double expectedOutput = 3.45;
        double actualOutput = calculator.subtract(9.78, 6.33);
        assertEquals(expectedOutput, actualOutput, 0.001);
    }

    @Test
    public void shouldMultiplyTwoIntegers() {
        int expectedOutput = 6;
        int actualOutput = calculator.multiply(2, 3);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void shouldMultiplyTwoDoubles() {
        double expectedOutput = 21.32;
        double actualOutput = calculator.multiply(4.10, 5.20);
        assertEquals(expectedOutput, actualOutput, 0.001);
    }

    @Test
    public void shouldDivideTwoIntegers() {
        int expectedOutput = 4;
        int actualOutput = calculator.divide(12, 3);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void shouldDivideTwoDoubleNumbers() {
        double expectedOutput = 2.10;
        double actualOutput = calculator.divide(13.23, 6.30);
        assertEquals(expectedOutput, actualOutput, 0.001);
    }

    @Test
    public void shouldDivideByZeroNominator() {
        int expectedOutput = 0;
        int actualOutput = calculator.divide(0, 10);
        assertEquals(expectedOutput, actualOutput);
    }
}