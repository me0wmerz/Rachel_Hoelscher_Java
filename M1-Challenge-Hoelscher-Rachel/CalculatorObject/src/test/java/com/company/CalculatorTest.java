package com.company;

import static org.junit.Assert.*;

public class CalculatorTest {

    private Calculator calc;

    @org.junit.Before
    public void setUp() throws Exception {
        calc = new Calculator();
    }

    @org.junit.Test
    public void shouldAddTwoInts() {
        //testing 1
        int actualResult = calc.add(1,3);
        int expectedResult = 4;
        assertEquals(expectedResult, actualResult);
        //testing 2
        assertEquals(-6, calc.add(-2,-4));
        assertEquals(0, calc.add(-5,5));
    }

    @org.junit.Test
    public void shouldSubtractTwoInts() {
        assertEquals(3,calc.subtract(8,5));
        assertEquals(9,calc.subtract(6,-3));
        assertEquals(-6, calc.subtract(-10,-4));
        assertEquals(-13, calc.subtract(-8,5));
    }

    @org.junit.Test
    public void shouldMultiplyTwoInts() {
        assertEquals(15,calc.multiply(3,5));
        assertEquals(-9,calc.multiply(3,-3));
        assertEquals(16, calc.multiply(-4,-4));
        assertEquals(-10, calc.multiply(-2,5));
        assertEquals(0,calc.multiply(0,6));
    }

    @org.junit.Test
    public void shouldDivideTwoInts() {
        assertEquals(15,calc.multiply(3,5));
        assertEquals(-9,calc.multiply(3,-3));
        assertEquals(16, calc.multiply(-4,-4));
        assertEquals(-10, calc.multiply(-2,5));
        assertEquals(0,calc.multiply(0,6));
    }

//    @org.junit.Test
//    public void shouldReturnZeroWhenDividingByZero() {
//        assertEquals(0,calc.divide(10, 0));
//    }

    @org.junit.Test
    public void shouldAddTwoDoubles() {
        assertEquals(3,calc.add(1,2));
        assertEquals(-9,calc.add(-6,-3));
        assertEquals(0, calc.add(2,-2));
        assertEquals(-3, calc.add(-8,5));
    }

    @org.junit.Test
    public void shouldSubtractTwoDoubles() {
        assertEquals(3,calc.subtract(8,5));
        assertEquals(9,calc.subtract(6,-3));
        assertEquals(-6, calc.subtract(-10,-4));
        assertEquals(-13, calc.subtract(-8,5));
    }

    @org.junit.Test
    public void shouldMultiplyTwoDoubles() {
        assertEquals(15,calc.multiply(3,5));
        assertEquals(-9,calc.multiply(3,-3));
        assertEquals(16, calc.multiply(-4,-4));
        assertEquals(-10, calc.multiply(-2,5));
        assertEquals(0,calc.multiply(0,6));
    }

    @org.junit.Test
    public void shouldDivideTwoDoubles() {
        assertEquals(15,calc.multiply(3,5));
        assertEquals(-9,calc.multiply(3,-3));
        assertEquals(16, calc.multiply(-4,-4));
        assertEquals(-10, calc.multiply(-2,5));
        assertEquals(0,calc.multiply(0,6));
    }
}