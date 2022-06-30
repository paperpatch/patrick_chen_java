package com.company;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FarmerTest {

    private Farmer farmer;
    private Constable constable;

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

        constable = new Constable("Mike");
        constable.setStrength(60);
        constable.setHealth(100);
        constable.setStamina(60);
        constable.setSpeed(20);
        constable.setAttackPower(5);
        constable.setRunning(false);
        constable.setArrested(false);
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

}