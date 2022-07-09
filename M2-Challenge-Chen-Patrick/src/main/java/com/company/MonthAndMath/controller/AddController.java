package com.company.MonthAndMath.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
public class AddController {
    @RequestMapping(value="/add", method= RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public int add(@RequestBody int operand1, int operand2) {
        return operand1 + operand2;
    }
}
