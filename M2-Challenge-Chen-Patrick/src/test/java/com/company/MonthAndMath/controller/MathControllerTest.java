package com.company.MonthAndMath.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@WebMvcTest(MonthController.class)
public class MathControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void contextLoads() {
    }

//    @Test
//    public void shouldReturnPositiveIntegersWhenAddingTwoPositiveIntegers() throws Exception {
//        int output = 3;
//
//        mockMvc.perform(
//
//        )
//    }

}