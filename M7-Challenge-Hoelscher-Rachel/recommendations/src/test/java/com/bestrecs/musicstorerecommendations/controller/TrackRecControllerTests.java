package com.bestrecs.musicstorerecommendations.controller;

public class TrackRecControllerTests {
}

//package com.bestrecs.musicstorerecommendations.controller;
//
//import com.bestrecs.musicstorerecommendations.model.TrackRecommendation;
//import com.bestrecs.musicstorerecommendations.repository.TrackRecRepository;
//import com.fasterxml.jackson.databind.ObjectMapper;
//import org.junit.Before;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
//import org.springframework.boot.test.mock.mockito.MockBean;
//import org.springframework.http.MediaType;
//import org.springframework.test.context.junit4.SpringRunner;
//import org.springframework.test.web.servlet.MockMvc;
//
//@RunWith(SpringRunner.class)
//@WebMvcTest(TrackRecController.class)
//public class TrackRecControllerTests {
//    @MockBean
//    private TrackRecRepository repo;
//
//    private ObjectMapper mapper = new ObjectMapper();
//
//    private TrackRecommendation mockOutput;
//    private TrackRecommendation createInput;
//    private TrackRecommendation createOutput;
//
//    private String allTrackRecsJson;
//    private String mockOutputJson;
//    private String createInputJson;
//    private String createOutputJson;
//
//    @Autowired
//    private MockMvc mockMvc;
//
//    @Before
//    public void setUp() throws Exception {
//        TrackRecommendation inputTrackRec = new inputTrackRec(1, 1, Boolean.valueOf("True"));
//    }
//
//    @Test
//    public void shouldCreateTrackRec() throws Exception {
//        mockMvc.perform(post("/trackRec")
//                        .content(createInputJson)
//                        .contentType(MediaType.APPLICATION_JSON)
//                ).andDo(print())
//                .andExpect(status().isCreated())
//                .andExpect(content().json(createOutputJson));
//    }
//
//    @Test
//    public void shouldGetAllTrackRecs() throws Exception {
//        mockMvc.perform(get("/trackRec"))
//                .andDo(print())
//                .andExpect(status().isOk())
//                .andExpect(content().json(allTrackJson));
//    }
//
//    @Test
//    public void shouldGetTrackRecById() throws Exception {
//        mockMvc.perform(get("/track/" + trackId))
//                .andDo(print())
//                .andExpect(status().isOk())
//                .andExpect(content().json(mockOutputJson));
//    }
//
//    @Test
//    public void shouldUpdateTrackRec() throws Exception {
//        mockMvc.perform(put("/trackRec/" + trackId)
//                        .content(createTrackJson)
//                        .contentType(MediaType.APPLICATION_JSON))
//                .andDo(print())
//                .andExpect(status().isNoContent());
//    }
//
//    @Test
//    public void shouldDeleteTrackRec() throws Exception {
//        mockMvc.perform(delete("/trackRec/" + trackId))
//                .andDo(print())
//                .andExpect(status().isNoContent());
//    }
//
//}