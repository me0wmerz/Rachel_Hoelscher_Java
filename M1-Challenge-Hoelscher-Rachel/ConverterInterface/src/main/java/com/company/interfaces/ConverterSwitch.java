package com.company.interfaces;

public class ConverterSwitch {

    public void monthConverterSwitch(int month) {
        String monthString;
        switch (month) {
            case 1:  monthString = "The corresponding month for " + month + " is January.";
                break;
            case 2:  monthString = "The corresponding month for " + month + " is February";
                break;
            case 3:  monthString = "The corresponding month for " + month + " is March";
                break;
            case 4:  monthString = "The corresponding month for " + month + " is April";
                break;
            case 5:  monthString = "The corresponding month for " + month + " is May";
                break;
            case 6:  monthString = "The corresponding month for " + month + " is June";
                break;
            case 7:  monthString = "The corresponding month for " + month + " is July";
                break;
            case 8:  monthString = "The corresponding month for " + month + " is August";
                break;
            case 9:  monthString = "The corresponding month for " + month + " is September";
                break;
            case 10: monthString = "The corresponding month for " + month + " is October";
                break;
            case 11: monthString = "The corresponding month for " + month + " is November";
                break;
            case 12: monthString = "The corresponding month for " + month + " is December";
                break;
            default: monthString = "Invalid month -- Please try again. Enter a number between 1 and 12.";
                break;
        }
        System.out.println(monthString);
    }

    public void weekConverterSwitch(int weekday) {
        String weekString;
        switch (weekday) {
            case 1:  weekString = "The corresponding month for " + weekday + " is Sunday.";
                break;
            case 2:  weekString = "The corresponding month for " + weekday + " is Monday";
                break;
            case 3:  weekString = "The corresponding month for " + weekday + " is Tuesday";
                break;
            case 4:  weekString = "The corresponding month for " + weekday + " is Wednesday";
                break;
            case 5:  weekString = "The corresponding month for " + weekday + " is Thursday";
                break;
            case 6:  weekString = "The corresponding month for " + weekday + " is Friday";
                break;
            case 7:  weekString = "The corresponding month for " + weekday + " is Saturday";
                break;
            default: weekString = "Invalid month -- Please try again. Enter a number between 1 and 12.";
                break;
        }
        System.out.println(weekString);
    }

}