package com.company.MonthAndMath.controller;

import com.company.MonthAndMath.models.RandomMonth;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.hamcrest.Matchers;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

// similar setup from Month Converter Controller Test
@RunWith(SpringRunner.class)
@WebMvcTest(RandomMonthController.class)
public class RandomMonthControllerTest {

    @Autowired
    private MockMvc mockMvc;

    private ObjectMapper mapper = new ObjectMapper();

    @Before
    public void setUp() {
        List<RandomMonth> monthList = new ArrayList<>(Arrays.asList(
                new RandomMonth("January", 1),
                new RandomMonth("February", 2),
                new RandomMonth("March", 3),
                new RandomMonth("April", 4),
                new RandomMonth("May", 5),
                new RandomMonth("June", 6),
                new RandomMonth("July", 7),
                new RandomMonth("August", 8),
                new RandomMonth("September", 9),
                new RandomMonth("October", 10),
                new RandomMonth("November", 11),
                new RandomMonth("December", 12)
        ));
    }

    @Test
    public void shouldReturnNonEmptyValue() throws Exception {
        mockMvc.perform(get("/randomMonth"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(jsonPath("$").isNotEmpty()
        );
    }

    @Test
    public void shouldReturnAValueFromMonthlist() throws Exception {
        RandomMonth outputMonth = new RandomMonth();
        String outputJson = mapper.writeValueAsString(outputMonth);
        mockMvc.perform(get("/randomMonth"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().json(outputJson));
    }
}