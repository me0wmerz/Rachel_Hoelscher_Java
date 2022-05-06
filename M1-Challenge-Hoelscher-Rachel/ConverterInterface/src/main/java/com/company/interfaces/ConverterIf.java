package com.company.interfaces;

public class ConverterIf {
    public void monthConverterIf(int input) {
        if (input == 1) {
            System.out.println("The corresponding month for " + input + " is January.");
        } else if (input == 2) {
            System.out.println("The corresponding month for " + input + " is February.");
        } else if (input == 3) {
            System.out.println("The corresponding month for " + input + " is March.");
        } else if (input == 4) {
            System.out.println("The corresponding month for " + input + " is April.");
        } else if (input == 5) {
            System.out.println("The corresponding month for " + input + " is May.");
        } else if (input == 6) {
            System.out.println("The corresponding month for " + input + " is June.");
        } else if (input == 7) {
            System.out.println("The corresponding month for " + input + " is July.");
        } else if (input == 8) {
            System.out.println("The corresponding month for " + input + " is August.");
        } else if (input == 9) {
            System.out.println("The corresponding month for " + input + " is September.");
        } else if (input == 10) {
            System.out.println("The corresponding month for " + input + " is October.");
        } else if (input == 11) {
            System.out.println("The corresponding month for " + input + " is November.");
        } else if (input == 12) {
            System.out.println("The corresponding month for " + input + " is December.");
        } else {
            System.out.println("Invalid month -- Please try again. Enter a number between 1 and 12.");
        }
    }

    public void weekConverterIf(int input) {
        if (input == 1) {
            System.out.println("The corresponding weekday for " + input + " is Sunday.");
        } else if (input == 2) {
            System.out.println("The corresponding weekday for " + input + " is Monday.");
        } else if (input == 3) {
            System.out.println("The corresponding weekday for " + input + " is Tuesday.");
        } else if (input == 4) {
            System.out.println("The corresponding weekday for " + input + " is Wednesday.");
        } else if (input == 5) {
            System.out.println("The corresponding weekday for " + input + " is Thursday.");
        } else if (input == 6) {
            System.out.println("The corresponding weekday for " + input + " is Friday.");
        } else if (input == 7) {
            System.out.println("The corresponding weekday for " + input + " is Saturday.");
        } else {
            System.out.println("Invalid weekday -- Please try again. Enter a number between 1 and 7.");
        }
    }
}
