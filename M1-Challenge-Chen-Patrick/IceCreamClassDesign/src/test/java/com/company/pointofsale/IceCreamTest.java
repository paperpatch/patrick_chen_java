package com.company.pointofsale;

import com.company.factory.IceCream;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class IceCreamTest {
    private com.company.pointofsale.IceCream iceCream;

    @Before
    public void setUp() {
        iceCream = new com.company.pointofsale.IceCream();
        iceCream.setQuantity(1000);
        iceCream.setPrice(4.32);
    }

    @Test
    public void shouldDecreaseQuantityWhenSelling() {
        int expectedOutput = 970;
        int actualOutput  = iceCream.sell(30);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void shouldIncreaseIceCreamPrice() {
        double expectedOutput = 4.82;
        double actualOutput = iceCream.increasePrice(0.50);
        assertEquals(expectedOutput, actualOutput, 0.01);
    }

    @Test
    public void shouldDecreaseIceCreamPrice() {
        double expectedOutput = 4.00;
        double actualOutput = iceCream.decreasePrice(0.32);
        assertEquals(expectedOutput, actualOutput, 0.01);
    }
}