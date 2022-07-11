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

    private static int num = 1;

    private static List<Month> monthList = new ArrayList<>(Arrays.asList(
            new Month("January", num++),
            new Month("February", num++),
            new Month("March", num++),
            new Month("April", num++),
            new Month("May", num++),
            new Month("June", num++),
            new Month("July", num++),
            new Month("August", num++),
            new Month("September", num++),
            new Month("October", num++),
            new Month("November", num++),
            new Month("December", num++)
    ));

    @RequestMapping(value="/month/{monthNumber}", method= RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public Month getMonth(@PathVariable String monthNumber) {
        Month month = new Month();

        switch (monthNumber) {
            case "1":
                month.setNumber(1);
                month.setMonth("January");
                return month;
            case "2":
                month.setNumber(2);
                month.setMonth("February");
                return month;
            case "3":
                month.setNumber(3);
                month.setMonth("March");
                return month;
            case "4":
                month.setNumber(4);
                month.setMonth("April");
                return month;
            case "5":
                month.setNumber(5);
                month.setMonth("May");
                return month;
            case "6":
                month.setNumber(6);
                month.setMonth("June");
                return month;
            case "7":
                month.setNumber(7);
                month.setMonth("July");
                return month;
            case "8":
                month.setNumber(8);
                month.setMonth("August");
                return month;
            case "9":
                month.setNumber(9);
                month.setMonth("September");
                return month;
            case "10":
                month.setNumber(10);
                month.setMonth("October");
                return month;
            case "11":
                month.setNumber(11);
                month.setMonth("November");
                return month;
            case "12":
                month.setNumber(12);
                month.setMonth("December");
                return month;
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
