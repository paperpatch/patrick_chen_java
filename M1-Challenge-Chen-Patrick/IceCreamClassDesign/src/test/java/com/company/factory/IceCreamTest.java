package com.company.factory;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class IceCreamTest {
    private IceCream iceCream;

    @Before
    public void setUp() {
        iceCream = new IceCream();
        iceCream.setProductionTime(32);
        iceCream.setSalePrice(1.50);
    }

    @Test
    public void shouldIncreaseProductionTime() {
        int expectedOutput = 37;
        int actualOutput = iceCream.increaseProductionTime(5);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void shouldDecreaseProductionTime() {
        int expectedOutput = 27;
        int actualOutput = iceCream.decreaseProductionTime(5);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void shouldIncreaseSalesPrice() {
        double expectedOutput = 1.80;
        double actualOutput = iceCream.increaseSalesPrice(0.30);
        assertEquals(expectedOutput, actualOutput, 0.01);
    }

}