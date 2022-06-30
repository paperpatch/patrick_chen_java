package com.company;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConstableTest {
    private Constable constable;

    @Before
    public void setUp() {
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
        int actualOutput = constable.decreaseHealth();
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void shouldIncreaseHealthByHealing() {
        int expectedOutput = 110;
        int actualOutput = constable.heal();
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void runningShouldBeTrueWhenExecuted() {
        boolean expectedOutput = true;
        boolean actualOutput = constable.run();
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void runningShouldBeFalseAfterRunningWasTrue() {
        constable.run(); // turns true;
        boolean expectedOutput = false;
        boolean actualOutput = constable.stopRun();
        assertEquals(expectedOutput, actualOutput);
    }
}