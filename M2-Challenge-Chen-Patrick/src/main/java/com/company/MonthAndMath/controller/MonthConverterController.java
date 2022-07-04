package com.company.MonthAndMath.controller;

import com.company.MonthAndMath.models.MonthConverter;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Array;

@RestController
public class MonthConverterController {
    private int monthNumber;

    private static String[] months = {
            "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"
    };

    @RequestMapping(value="/month/{monthNumber}", method= RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public MonthConverter getConvertedMonth() {
        return monthNumber;
    }
}
