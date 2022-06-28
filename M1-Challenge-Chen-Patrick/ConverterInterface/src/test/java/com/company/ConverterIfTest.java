package com.company;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConverterIfTest {

    private ConverterIf converter;

    @Before
    public void setUp() {
        converter = new ConverterIf();
    }

    @Test
    public void shouldReturnMonth() {
        String expectedOutput = "January";
        String actualOutput = converter.convertMonth(1);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void shouldReturnInvalidMonth() {
        String expectedOutput = "Invalid month number. Please enter a number from 1-12.";
        String actualOutput = converter.convertMonth(0);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void shouldReturnDay() {
        String expectedOutput = "Monday";
        String actualOutput = converter.convertDay(2);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void shouldReturnInvalidDay() {
        String expectedOutput = "Invalid day number. Please enter a number from 1-7.";
        String actualOutput = converter.convertDay(15);
        assertEquals(expectedOutput, actualOutput);
    }

}