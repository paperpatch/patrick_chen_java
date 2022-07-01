package com.company;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class WarriorTest {
    private Warrior warrior;
    private Farmer farmer;

    @Before
    public void setUp() {
        warrior = new Warrior();
        warrior.setName("Bob");
        warrior.setStrength(75);
        warrior.setHealth(100);
        warrior.setStamina(100);
        warrior.setSpeed(50);
        warrior.setAttackPower(10);
        warrior.setShieldStrength(100);
        warrior.setRunning(false);
        warrior.setArrested(false);

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
    public void enemyShouldLoseHealthAfterAttacking() {
        warrior.attack(farmer);
        int expectedOutput = 90;
        int actualOutput = farmer.getHealth();
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void shouldLoseHealthWhenAttacked() {
        farmer.attack(warrior);
        int expectedOutput = 99;
        int actualOutput = warrior.getHealth();
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void shouldNotBeAbleToRunIfArrested() {
        warrior.setArrested(true);
        warrior.run();
        boolean expectedOutput = false;
        boolean actualOutput = warrior.isRunning();
        assertEquals(expectedOutput, actualOutput);
    }

}