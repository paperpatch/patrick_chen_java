package com.company.MonthAndMath.controller;

import com.company.MonthAndMath.models.Math;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.junit.Assert.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(MathController.class)
public class MathControllerTest {

    @Autowired
    private MockMvc mockMvc;

    private ObjectMapper mapper = new ObjectMapper();

    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void contextLoads() {
    }

    @Test
    public void shouldReturnPositiveIntegersWhenAddingTwoPositiveIntegers() throws Exception {
        Math output = new Math();
        output.setOperand1(1);
        output.setOperand2(2);
        output.setOperation("add");
        output.setAnswer(3);
        String outputJson = mapper.writeValueAsString(output);

        Math input = new Math();
        input.setOperand1(1);
        input.setOperand2(2);
        input.setOperation("add");
        String inputJson = mapper.writeValueAsString(input);

        System.out.println(inputJson);

        mockMvc.perform(
                        post("/add")                            // Perform the POST request.
                                .content(inputJson)                           // Set the request body.
                                .contentType(MediaType.APPLICATION_JSON)      // Tell the server it's in JSON format.
                )
                .andDo(print())                                // Print results to console.
                .andExpect(status().isCreated())               // ASSERT (status code is 201)
                .andExpect(content().json(outputJson));
    }

}