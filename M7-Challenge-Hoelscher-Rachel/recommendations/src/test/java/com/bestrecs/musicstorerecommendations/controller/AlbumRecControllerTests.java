package com.bestrecs.musicstorerecommendations.controller;

public class AlbumRecControllerTests {
}


//package com.bestrecs.musicstorerecommendations.controller;
//
//import com.bestrecs.musicstorerecommendations.model.AlbumRecommendation;
//import com.bestrecs.musicstorerecommendations.repository.AlbumRecRepository;
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
//@WebMvcTest(AlbumRecController.class)
//public class AlbumRecControllerTests {
//    @MockBean
//    private AlbumRecRepository repo;
//
//    private ObjectMapper mapper = new ObjectMapper();
//
//    private AlbumRecommendation mockOutput;
//    private AlbumRecommendation createInput;
//    private AlbumRecommendation createOutput;
//
//    private String allAlbumRecsJson;
//    private String mockOutputJson;
//    private String createInputJson;
//    private String createOutputJson;
//
//    @Autowired
//    private MockMvc mockMvc;
//
//    @Before
//    public void setUp() throws Exception {
//        AlbumRecommendation inputAlbumRec = new inputAlbumRec(1, 1, Boolean.valueOf("True"));
//    }
//
//    @Test
//    public void shouldCreateAlbumRec() throws Exception {
//        mockMvc.perform(post("/albumRec")
//                        .content(createInputJson)
//                        .contentType(MediaType.APPLICATION_JSON)
//                ).andDo(print())
//                .andExpect(status().isCreated())
//                .andExpect(content().json(createOutputJson));
//    }
//
//    @Test
//    public void shouldGetAllAlbumRecs() throws Exception {
//        mockMvc.perform(get("/albumRec"))
//                .andDo(print())
//                .andExpect(status().isOk())
//                .andExpect(content().json(allAlbumsJson));
//    }
//
//    @Test
//    public void shouldGetAlbumRecById() throws Exception {
//        mockMvc.perform(get("/album/" + albumId))
//                .andDo(print())
//                .andExpect(status().isOk())
//                .andExpect(content().json(mockOutputJson));
//    }
//
//    @Test
//    public void shouldUpdateAlbumRec() throws Exception {
//        mockMvc.perform(put("/albumRec/" + albumId)
//                        .content(createAlbumJson)
//                        .contentType(MediaType.APPLICATION_JSON))
//                .andDo(print())
//                .andExpect(status().isNoContent());
//    }
//
//    @Test
//    public void shouldDeleteAlbumRec() throws Exception {
//        mockMvc.perform(delete("/albumRec/" + albumId))
//                .andDo(print())
//                .andExpect(status().isNoContent());
//    }
//
//}
