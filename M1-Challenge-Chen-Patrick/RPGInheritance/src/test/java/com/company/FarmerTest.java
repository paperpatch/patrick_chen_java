package com.company;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FarmerTest {

    private Farmer farmer;

    @Before
    public void setUp() {
        farmer = new Farmer();
        farmer.setName("Joe");
        farmer.setStrength(75);
        farmer.setHealth(100);
        farmer.setStamina(75);
        farmer.setSpeed(10);
        farmer.setAttackPower(1);
        farmer.setRunning(false);
        farmer.setArrested(false);
        farmer.setPlowing(false);
        farmer.setHarvesting(false);
    }

    @Test
    public void plowingStatusShouldBeTrueAfterPlowing() {
        farmer.plowing();
        boolean expectedOutput = true;
        boolean actualOutput = farmer.isPlowing();
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void plowingStatusShouldBeFalseAfterPlowingAndStopping() {
        farmer.plowing();
        farmer.stopPlowing();
        boolean expectedOutput = false;
        boolean actualOutput = farmer.isPlowing();
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void shouldLoseStaminaWhenPlowing() {
        farmer.plowing();
        int expectedOutput = 65;
        int actualOutput = farmer.getStamina();
        assertEquals(expectedOutput, actualOutput);
    }
}