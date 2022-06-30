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
    }

//    @Test
//    public void shouldAddTwoPositiveIntegers() {
//        int expectedOutput = 5;
//        int actualOutput = calculator.add(3, 2);
//        assertEquals(expectedOutput, actualOutput);
//    }

}