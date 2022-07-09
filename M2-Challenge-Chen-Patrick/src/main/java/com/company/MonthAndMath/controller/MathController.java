package com.company.MonthAndMath.controller;

import com.company.MonthAndMath.models.Math;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
public class MathController {

    @RequestMapping(value="/add", method= RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public Math add(@RequestBody Math math) {

        math.setAnswer(math.getOperand1() + math.getOperand2());
        return math;
    }

    @RequestMapping(value="/subtract", method= RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public Math subtract(@RequestBody Math math) {
        math.setAnswer(math.getOperand1() - math.getOperand2());
        return math;
    }

    @RequestMapping(value="/multiply", method= RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public Math multiply(@RequestBody Math math) {
        math.setAnswer(math.getOperand1() * math.getOperand2());
        return math;
    }

    @RequestMapping(value="/divide", method= RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public Math divide(@RequestBody Math math) {
        math.setAnswer(math.getOperand1() / math.getOperand2());
        return math;
    }
}
