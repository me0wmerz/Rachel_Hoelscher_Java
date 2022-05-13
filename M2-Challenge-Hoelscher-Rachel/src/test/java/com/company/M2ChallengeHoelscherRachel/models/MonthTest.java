package com.company.M2ChallengeHoelscherRachel.models;

import com.company.M2ChallengeHoelscherRachel.controller.MonthController;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultMatcher;

import static org.junit.Assert.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.content;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(MonthController.class)

public class MonthTest {

    @Autowired
    MockMvc mockMvc;
    private ObjectMapper mapper = new ObjectMapper();

    @org.junit.Before
    public void setUp() throws Exception {
        // This is the standard set up method that runs before each test. It's typically used for instantiating test
        // objects. I don't have to do anything special for mockMvc since it's Autowired this time
    }

    @Test
    public void shouldConvertMonthNumberToName() throws Exception {
        Month month = new Month();
        month.setNumber(3);
        month.setName("March");

        String outputJson = mapper.writeValueAsString(month);

        mockMvc.perform(get("/month/3"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().json(outputJson));
    }

    @Test
    public void shouldRespondWithUnprocessableEntityWhenInputIsOutOfRange() throws Exception {
        // Arrange - not necessary
        // Act
        mockMvc.perform(get("/month/13"))
                .andDo(print())
                .andExpect(status().isUnprocessableEntity());  // Assert
    }

    @Test
    public void shouldGetRandomMonth() throws Exception {
        mockMvc.perform(
                        get("/randomMonth"))
                .andDo(print())
                .andExpect((ResultMatcher) jsonPath("$.number").isNotEmpty())   // Assert
                .andExpect((ResultMatcher) jsonPath("$.name").isNotEmpty());    // Assert
    }

}