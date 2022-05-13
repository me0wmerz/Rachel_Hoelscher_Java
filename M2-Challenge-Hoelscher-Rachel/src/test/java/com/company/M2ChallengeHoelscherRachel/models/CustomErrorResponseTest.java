package com.company.M2ChallengeHoelscherRachel.models;

import org.junit.Before;
import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

import static org.junit.Assert.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

public class CustomErrorResponseTest {

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void shouldRespondWithUnprocessableEntityWhenInputIsOutOfRange() throws Exception {
        // Arrange - not necessary
        // Act
        MockMvc mockMvc;
        mockMvc.perform(get("/month/13"))
                .andDo(print())
                .andExpect(status().isUnprocessableEntity());  // Assert
    }

 }