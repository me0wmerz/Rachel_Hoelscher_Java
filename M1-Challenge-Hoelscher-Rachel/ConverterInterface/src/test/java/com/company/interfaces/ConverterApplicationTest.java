package com.company.interfaces;

import org.junit.Test;

import static org.junit.Assert.*;

public class ConverterApplicationTest {

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @Test
    public void shouldReturnMonthUsingIf() {
        String actualOutput = monthConverterIf(3);
        String expectedOutput = "The corresponding month for 3 is March.";

        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void shouldReturnWeekUsingIf() {
        String actualOutput = weekConverterIf(5);
        String expectedOutput = "The corresponding weekday for 5 is Thursday.";

        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void shouldReturnErrorAndTryAgainUsingIfWhenOutOfBounds() {
        String actualOutput = monthConverterIf(20);
        String expectedOutput = "Invalid month -- Please try again. Enter a number between 1 and 12.";

        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void shouldReturnMonthUsingSwitch() {
        String actualOutput = monthConverterIf(8);
        String expectedOutput = "The corresponding month for 8 is August.";

        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void shouldReturnWeekUsingSwitch() {
        String actualOutput = weekConverterIf(2);
        String expectedOutput = "The corresponding weekday for 5 is Monday.";

        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void shouldReturnErrorAndTryAgainUsingSwitchWhenOutOfBounds() {
        String actualOutput = weekConverterIf(8);
        String expectedOutput = "Invalid weekday -- Please try again. Enter a number between 1 and 7.";

        assertEquals(expectedOutput, actualOutput);
    }
}