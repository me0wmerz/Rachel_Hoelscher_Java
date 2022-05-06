package com.company.pointofsale;

import org.junit.Test;

import static org.junit.Assert.*;

public class IceCreamTest {

    com.company.factory.IceCream factoryIceCream =  new com.company.factory.IceCream("Ben & Jerry's", "Chocolate chip", 2.50,3.75,false);
    com.company.pointofsale.IceCream POSIceCream = new com.company.pointofsale.IceCream("Breyer's", "Chocolate chip cookie dough", 1.25, 4.00, false, false);


    @org.junit.Before
    public void setUp() throws Exception {
        com.company.factory.IceCream factoryIceCream =  new com.company.factory.IceCream("Ben & Jerry's", "Chocolate chip", 2.50,3.50,false);
        com.company.pointofsale.IceCream POSIceCream = new com.company.pointofsale.IceCream("Breyer's", "Chocolate chip cookie dough", 1.25, 4.00, false, false);
    }

    @Test
    public void shouldReturnFactoryFlavor() {
        String actualOutput = factoryIceCream.getFlavor();
        String expectedOutput = "Chocolate chip";

        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void shouldReturnPOSBrand() {
        String actualOutput = POSIceCream.getBrand();
        String expectedOutput = "Breyer's";

        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void shouldAddSprinkles() {
        assertEquals(POSIceCream.addingSprinkles(), true);
    }

//    @Test
//    public double shouldCalculateFactoryProfit(double pricePerPint, double costPerPint) {
//        double actualOutput = factoryIceCream.calculateProfit(3.50,2.50);
//
//        double expectedOutput = 1.00;
//
//        assertEquals(expectedOutput, actualOutput);
//    }
}
