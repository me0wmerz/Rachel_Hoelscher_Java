package com.company.M2ChallengeHoelscherRachel.controller;


import com.company.M2ChallengeHoelscherRachel.models.Month;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

@RestController
public class MonthController {
    private static List<Month> monthList = new ArrayList<>(Arrays.asList(
            new Month(1,"January"),
            new Month(2,"February"),
            new Month(3, "March"),
            new Month(4, "April"),
            new Month(5, "May"),
            new Month(6, "June"),
            new Month(7, "July"),
            new Month(8, "August"),
            new Month(9, "September"),
            new Month(10, "October"),
            new Month(11, "November"),
            new Month(12, "December")
    ));

    @RequestMapping(value = "/month", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public List<Month> getAllMonths() {
        return monthList;
    }

    @RequestMapping(value = "/month/{number}", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public Month getMonthByNumber(@PathVariable Integer number) {

        if (number < 1 || number > 12) {
            throw new ResponseStatusException(HttpStatus.UNPROCESSABLE_ENTITY, "Number must be between 1 and 12.");
        }

        Month getMonth = null;

        for (Month month : monthList) {
            if (month.getNumber() == number) {
                getMonth = month;
            }
        }
        return getMonth;
    }

    @RequestMapping(value = "/randomMonth", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    public Month getRandomMonth() {

        // code from class (5/3/22)
        Random rand = new Random();
        int randomInt = rand.nextInt(12);
        int correctedInt = randomInt + 1;

        Month getMonth = null;

        for (Month month : monthList) {
            if (month.getNumber() == correctedInt) {
                getMonth = month;
            }
        }
        return getMonth;
    }

}
