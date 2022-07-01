package com.company;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConstableTest {
    private Constable constable;
    private Warrior warrior;

    @Before
    public void setUp() {
        constable = new Constable();
        constable.setName("Mike");
        constable.setStrength(60);
        constable.setHealth(100);
        constable.setStamina(60);
        constable.setSpeed(20);
        constable.setAttackPower(5);
        constable.setRunning(false);
        constable.setArrested(false);

        warrior = new Warrior();
        warrior.setName("Bob");
        warrior.setHealth(100);
        warrior.setStamina(100);
        warrior.setSpeed(50);
        warrior.setAttackPower(10);
        warrior.setShieldStrength(100);
        warrior.setRunning(false);
        warrior.setArrested(false);
    }

    @Test
    public void enemyLosesHealthWhenAttacked() {
        constable.attack(warrior);
        int expectedOutput = 95;
        int actualOutput = warrior.getHealth();
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void cantAttackIfYoureArrested() {
        constable.setArrested(true);
        constable.attack(warrior);
        int expectedOutput = 100;
        int actualOutput = warrior.getHealth();
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void arrestedCriminalShouldHaveStatusArrested() {
        constable.arrestPerson(warrior);

        boolean expectedValue = true;
        boolean actualValue = warrior.isArrested();
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void runningShouldBeTrueWhenRunningAway() {
        constable.run();
        boolean expectedValue = true;
        boolean actualValue = constable.isRunning();
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void runningShouldBeFalseWhenStoppingRunningAfterRunning() {
        constable.run();
        constable.stopRunning();
        boolean expectedValue = false;
        boolean actualValue = constable.isRunning();
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void staminaShouldDecreaseAfterRunning() {
        constable.run();
        int expectedValue = 50;
        int actualValue = constable.getStamina();
        assertEquals(expectedValue, actualValue);
    }
}