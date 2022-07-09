package com.company.MonthAndMath.controller;

import com.company.MonthAndMath.models.Month;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

// originally written in the Cognizant 05-stu-month-converter and tweaked.
@RestController
public class MonthController {

    private static int idCounter = 1;

    private static List<Month> monthList = new ArrayList<>(Arrays.asList(
            new Month("January", idCounter++),
            new Month("February", idCounter++),
            new Month("March", idCounter++),
            new Month("April", idCounter++),
            new Month("May", idCounter++),
            new Month("June", idCounter++),
            new Month("July", idCounter++),
            new Month("August", idCounter++),
            new Month("September", idCounter++),
            new Month("October", idCounter++),
            new Month("November", idCounter++),
            new Month("December", idCounter++)
    ));

    @RequestMapping(value="/month/{monthNumber}", method= RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public String getMonth(@PathVariable String monthNumber) {

        switch (monthNumber) {
            case "1":
                return "January";
            case "2":
                return "February";
            case "3":
                return "March";
            case "4":
                return "April";
            case "5":
                return "May";
            case "6":
                return "June";
            case "7":
                return "July";
            case "8":
                return "August";
            case "9":
                return "September";
            case "10":
                return "October";
            case "11":
                return "November";
            case "12":
                return "December";
            default:
                throw new ResponseStatusException(HttpStatus.UNPROCESSABLE_ENTITY, "Invalid Month Number Specified");
        }
    }

    @RequestMapping(value="/randomMonth", method= RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public Month getRandomResponse() {
        Random randomNumberGenerator = new Random();

        int randomNumber = randomNumberGenerator.nextInt(monthList.size());

        return monthList.get(randomNumber);
    }
}
