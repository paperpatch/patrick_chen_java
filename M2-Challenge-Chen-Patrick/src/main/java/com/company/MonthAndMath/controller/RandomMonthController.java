package com.company.MonthAndMath.controller;

import com.company.MonthAndMath.models.RandomMonth;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

@RestController
public class RandomMonthController {
    private static int idCounter = 1;

    private static List<RandomMonth> monthList = new ArrayList<>(Arrays.asList(
            new RandomMonth("January", idCounter++),
            new RandomMonth("February", idCounter++),
            new RandomMonth("March", idCounter++),
            new RandomMonth("April", idCounter++),
            new RandomMonth("May", idCounter++),
            new RandomMonth("June", idCounter++),
            new RandomMonth("July", idCounter++),
            new RandomMonth("August", idCounter++),
            new RandomMonth("September", idCounter++),
            new RandomMonth("October", idCounter++),
            new RandomMonth("November", idCounter++),
            new RandomMonth("December", idCounter++)
    ));

    @RequestMapping(value="/randomMonth", method= RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public RandomMonth getRandomResponse() {
        Random randomNumberGenerator = new Random();

        int randomNumber = randomNumberGenerator.nextInt(monthList.size());

        return monthList.get(randomNumber);
    }

}
