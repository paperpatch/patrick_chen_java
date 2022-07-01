package com.company;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class WarriorTest {
    private Warrior warrior;

    @Before
    public void setUp() {
        warrior = new Warrior("Pat");
        warrior.setStrength(75);
        warrior.setHealth(100);
        warrior.setStamina(100);
        warrior.setSpeed(50);
        warrior.setAttackPower(10);
        warrior.setShieldStrength(100);
        warrior.setRunning(false);
        warrior.setArrested(false);
    }

    @Test
    public void shouldLoseStaminaAfterAttacking() {
        int expectedOutput = 90;
        int actualOutput = warrior.attacks();
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void shouldLoseStaminaAfterRunning() {
        int expectedOutput = 90;
        warrior.run();
        int actualOutput = warrior.getStamina();
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void runningShouldBeTrueAfterRunning() {
        boolean expectedOutput = true;
        boolean actualOutput = warrior.run();
        assertEquals(expectedOutput, actualOutput);
    }
}