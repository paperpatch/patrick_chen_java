package com.company;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FarmerTest {

    private Farmer farmer;

    @Before
    public void setUp() {
        farmer = new Farmer("Joe");
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
    public void shouldDecreaseHealth() {
        int expectedOutput = 90;
        int actualOutput = farmer.decreaseHealth();
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void shouldNotBeAbleToAttackIfArrested() {
        farmer.setArrested(true);
        String expectedOutput = "Can't attack if you're arrested!";
        String actualOutput = farmer.attack();
        assertEquals(expectedOutput, actualOutput);
    }

    @Test public void shouldIncreaseStamina() {
        int expectedOutput = 85;
        int actualOutput = farmer.increaseStamina();
        assertEquals(expectedOutput, actualOutput);
    }

    @

}