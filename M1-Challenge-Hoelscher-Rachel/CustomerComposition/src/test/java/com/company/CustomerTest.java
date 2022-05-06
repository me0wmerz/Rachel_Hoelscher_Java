package com.company;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomerTest {
    private Address shippingAddress = new Address("211 Main St.", "Apt 2", "San Diego", "CA", 92129);
    private Address billingAddress = new Address("411 Oak Ave.", "Unit 301", "Los Angeles", "CA", 90095);

    private Customer customer = new Customer("Sarah","Smith","sarah.smith@gmail.com","858-555-1234", true, shippingAddress, billingAddress);

    @Before
    public void setUp() {
    }

    @Test
    public void shouldReturnCustomerName() {
        String actualOutput = customer.getFirstName();
        String expectedOutput = "Sarah";

        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void shouldReturnCustomerBillingZipCode() {
        int actualOutput = customer.getBillingAddress().getZip();
        int expectedOutput = 90095;

        assertEquals(expectedOutput, actualOutput);
    }

}