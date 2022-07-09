package com.company.MonthAndMath.controller;

import com.company.MonthAndMath.models.Math;
import org.springframework.http.HttpStatus;
import org.springframework.util.NumberUtils;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

import static java.lang.Integer.parseInt;

@RestController
public class MathController {

    @RequestMapping(value="/add", method= RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public Math add(@RequestBody @Valid Math math) {
        int value1 = parseInt(math.getOperand1());
        int value2 = parseInt(math.getOperand2());
        math.setAnswer(value1 + value2);
        return math;
    }

    @RequestMapping(value="/subtract", method= RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public Math subtract(@RequestBody @Valid Math math) {
        int value1 = parseInt(math.getOperand1());
        int value2 = parseInt(math.getOperand2());
        math.setAnswer(value1 - value2);
        return math;
    }

    @RequestMapping(value="/multiply", method= RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public Math multiply(@RequestBody @Valid Math math) {
        int value1 = parseInt(math.getOperand1());
        int value2 = parseInt(math.getOperand2());
        math.setAnswer(value1 * value2);
        return math;
    }

    @RequestMapping(value="/divide", method= RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public Math divide(@RequestBody @Valid Math math) {
        if (parseInt(math.getOperand2()) == 0) {
            throw new IllegalArgumentException("Denominator cannot be zero.");
        }
        int value1 = parseInt(math.getOperand1());
        int value2 = parseInt(math.getOperand2());
        math.setAnswer(value1 / value2);
        return math;
    }
}
