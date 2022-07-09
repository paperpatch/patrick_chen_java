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
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import java.util.HashMap;
import java.util.Map;

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

    // test code originally written in Cognizant 03-we-record-store-query-parameters.

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

        mockMvc.perform(
                        post("/add")                            // Perform the POST request.
                                .content(inputJson)                           // Set the request body.
                                .contentType(MediaType.APPLICATION_JSON)      // Tell the server it's in JSON format.
                )
                .andDo(print())                                // Print results to console.
                .andExpect(status().isCreated())               // ASSERT (status code is 201)
                .andExpect(content().json(outputJson));
    }

    @Test
    public void shouldReturn422ErrorWithInvalidRequest() throws Exception {
        // Could not directly use string for int as Java prevents .setOperand1("String");
        // Used Map/HashMap to work around the restriction.
        Map<String, String> inputMap = new HashMap<>();
        inputMap.put("operand1", "2");
        inputMap.put("operand2", "String");

        String inputJson = mapper.writeValueAsString(inputMap);

        mockMvc.perform(
                        MockMvcRequestBuilders.post("/add")
                                .content(inputJson)
                                .contentType(MediaType.APPLICATION_JSON)
                )
                .andDo(print())
                .andExpect(status().isUnprocessableEntity());
    }

}