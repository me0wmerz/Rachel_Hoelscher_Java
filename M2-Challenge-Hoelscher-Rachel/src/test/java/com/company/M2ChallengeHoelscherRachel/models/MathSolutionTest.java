package com.company.M2ChallengeHoelscherRachel.models;

import com.company.M2ChallengeHoelscherRachel.controller.MathSolutionController;
import com.company.M2ChallengeHoelscherRachel.controller.NoDividingByZeroesException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultMatcher;

import static org.junit.Assert.*;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.content;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(MathSolutionController.class)
public class MathSolutionTest {

    @Autowired
    MockMvc mockMvc;

    private ObjectMapper mapper = new ObjectMapper();
    @Before
    public void setUp() throws Exception {
        // This is the standard set up method that runs before each test. It's typically used for instantiating test
        // objects. I don't have to do anything special for mockMvc since it's Autowired this time
    }

    @Test
    public void shouldAddTwoOperands() throws Exception {
        MathSolution expectedResult = new MathSolution(10, 20, "add", 30);
        String outputJSON = mapper.writeValueAsString(expectedResult);

        MathSolution actualResult = new MathSolution(10, 20);
        String inputJSON = mapper.writeValueAsString(actualResult);

        mockMvc.perform(post("/add").content(inputJSON).contentType(MediaType.APPLICATION_JSON))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect((ResultMatcher) content().json(outputJSON));
    }

    @Test
    public void shouldSubtractTwoOperands() throws Exception {
        MathSolution expectedResult = new MathSolution(30, 10, "subtract", 20);
        String outputJSON = mapper.writeValueAsString(expectedResult);

        MathSolution actualResult = new MathSolution(30, 10);
        String inputJSON = mapper.writeValueAsString(actualResult);

        mockMvc.perform(post("/subtract").content(inputJSON).contentType(MediaType.APPLICATION_JSON))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect((ResultMatcher) content().json(outputJSON));
    }

    @Test
    public void shouldMultiplyTwoOperands() throws Exception {
        MathSolution expectedResult = new MathSolution(2, 5, "multiply", 10);
        String outputJSON = mapper.writeValueAsString(expectedResult);

        MathSolution actualResult = new MathSolution(2, 5);
        String inputJSON = mapper.writeValueAsString(actualResult);

        mockMvc.perform(post("/multiply").content(inputJSON).contentType(MediaType.APPLICATION_JSON))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect((ResultMatcher) content().json(outputJSON));
    }

    @Test
    public void shouldDivideTwoOperands() throws Exception {
        MathSolution expectedResult = new MathSolution(15, 5, "divide", 3);
        String outputJSON = mapper.writeValueAsString(expectedResult);

        MathSolution actualResult = new MathSolution(15, 5);
        String inputJSON = mapper.writeValueAsString(actualResult);

        mockMvc.perform(post("/divide").content(inputJSON).contentType(MediaType.APPLICATION_JSON))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect((ResultMatcher) content().json(outputJSON));
    }

    @Test
    public void shouldThrowErrorWhenDividingByZero() throws NoDividingByZeroesException {
        MathSolution expectedResult = new MathSolution(100, 0, "divide", null);
        String inputJSON = mapper.writeValueAsString(expectedResult);

        mockMvc.perform(post("/divide")
                        .content(inputJSON)
                        .contentType(MediaType.APPLICATION_JSON)
                )
                .andDo(print())
                .andExpect(status().isNotAcceptable());
    }

    @Test
    public void shouldThrowErrorIfOnlyOneOperand() throws Exception {
        MathSolution expectedResult = new MathSolution();
        expectedResult.setOperand1(66);
        String inputJSON = mapper.writeValueAsString(expectedResult);

        mockMvc.perform(post("/subtract").content(inputJSON).contentType(MediaType.APPLICATION_JSON))
                .andDo(print())
                .andExpect(status().isUnprocessableEntity());
    }

    @Test
    public void shouldThrowErrorIfInputIsNaaN() throws Exception {
        MathSolution expectedResult = new MathSolution();
        expectedResult.setOperand2(R);
        String inputJSON = mapper.writeValueAsString(expectedResult);

        mockMvc.perform(post("/divide").content(inputJSON).contentType(MediaType.APPLICATION_JSON))
                .andDo(print())
                .andExpect(status().isUnprocessableEntity());
    }

}