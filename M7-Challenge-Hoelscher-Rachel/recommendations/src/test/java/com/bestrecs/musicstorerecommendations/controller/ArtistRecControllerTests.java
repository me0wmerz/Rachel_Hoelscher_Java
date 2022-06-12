package com.bestrecs.musicstorerecommendations.controller;

public class ArtistRecControllerTests {
}

//package com.bestrecs.musicstorerecommendations.controller;
//
//import com.bestrecs.musicstorerecommendations.model.ArtistRecommendation;
//import com.bestrecs.musicstorerecommendations.repository.ArtistRecRepository;
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
//@WebMvcTest(ArtistRecController.class)
//public class ArtistRecControllerTests {
//    @MockBean
//    private ArtistRecRepository repo;
//
//    private ObjectMapper mapper = new ObjectMapper();
//
//    private ArtistRecommendation mockOutput;
//    private ArtistRecommendation createInput;
//    private ArtistRecommendation createOutput;
//
//    private String allArtistRecsJson;
//    private String mockOutputJson;
//    private String createInputJson;
//    private String createOutputJson;
//
//    @Autowired
//    private MockMvc mockMvc;
//
//    @Before
//    public void setUp() throws Exception {
//        ArtistRecommendation inputArtistRec = new inputArtistRec(1, 1, Boolean.valueOf("True"));
//    }
//
//    @Test
//    public void shouldCreateArtistRec() throws Exception {
//        mockMvc.perform(post("/artistRec")
//                        .content(createInputJson)
//                        .contentType(MediaType.APPLICATION_JSON)
//                ).andDo(print())
//                .andExpect(status().isCreated())
//                .andExpect(content().json(createOutputJson));
//    }
//
//    @Test
//    public void shouldGetAllArtistRecs() throws Exception {
//        mockMvc.perform(get("/artistRec"))
//                .andDo(print())
//                .andExpect(status().isOk())
//                .andExpect(content().json(allArtistJson));
//    }
//
//    @Test
//    public void shouldGetArtistRecById() throws Exception {
//        mockMvc.perform(get("/artist/" + artistId))
//                .andDo(print())
//                .andExpect(status().isOk())
//                .andExpect(content().json(mockOutputJson));
//    }
//
//    @Test
//    public void shouldUpdateArtistRec() throws Exception {
//        mockMvc.perform(put("/artistRec/" + artistId)
//                        .content(createArtistJson)
//                        .contentType(MediaType.APPLICATION_JSON))
//                .andDo(print())
//                .andExpect(status().isNoContent());
//    }
//
//    @Test
//    public void shouldDeleteArtistRec() throws Exception {
//        mockMvc.perform(delete("/artistRec/" + artistId))
//                .andDo(print())
//                .andExpect(status().isNoContent());
//    }
//
//}

