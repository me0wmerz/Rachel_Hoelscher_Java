package com.company;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class GameLifecycleTest {

    private Farmer farmer;
    private Constable constable;
    private Warrior warrior;

    @Before
    public void runBeforeEachIndividualTest() {
        farmer = new Farmer("John", 10, 100, 15, 20, 1, false, false, false, false);
        constable = new Constable("Mary Sue", 5, 80, 25, 25, 5,false,false, "Twin Peaks");
        warrior = new Warrior("Tyson", 50, 120, 5, 5, 25, false, false);
    }

    @Test
    public void shouldPromptFarmerToHarvest() {
        farmer.isHarvesting = true;

        boolean actualValue = farmer.isHarvesting();
        boolean expectedValue = true;

        assertEquals(expectedValue, actualValue);

        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void shouldDecreaseConstableSpeedWhenArresting() {
        constable.setSpeed(10);
        constable.arrestAnotherCharacter();

        int actualValue = constable.speed;
        int expectedValue = 9;

        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void shouldIncreaseWarriorAttackPowerWhenAttacking() {
        warrior.setAttackPower(20);
        warrior.attackAnotherCharacter();

        int actualValue = warrior.attackPower;
        int expectedValue = 21;

        assertEquals(expectedValue, actualValue);
    }

}