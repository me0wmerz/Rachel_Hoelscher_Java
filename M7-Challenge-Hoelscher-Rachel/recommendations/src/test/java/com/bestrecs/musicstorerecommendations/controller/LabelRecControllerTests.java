package com.bestrecs.musicstorerecommendations.controller;

public class LabelRecControllerTests {
}


//package com.bestrecs.musicstorerecommendations.controller;
//
//import com.bestrecs.musicstorerecommendations.model.LabelRecommendation;
//import com.bestrecs.musicstorerecommendations.repository.LabelRecRepository;
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
//@WebMvcTest(LabelRecController.class)
//public class LabelRecControllerTests {
//    @MockBean
//    private LabelRecRepository repo;
//
//    private ObjectMapper mapper = new ObjectMapper();
//
//    private LabelRecommendation mockOutput;
//    private LabelRecommendation createInput;
//    private LabelRecommendation createOutput;
//
//    private String allLabelRecsJson;
//    private String mockOutputJson;
//    private String createInputJson;
//    private String createOutputJson;
//
//    @Autowired
//    private MockMvc mockMvc;
//
//    @Before
//    public void setUp() throws Exception {
//        LabelRecommendation inputLabelRec = new inputLabelRec(1, 1, Boolean.valueOf("True"));
//    }
//
//    @Test
//    public void shouldCreatLabelRec() throws Exception {
//        mockMvc.perform(post("/labelRec")
//                        .content(createInputJson)
//                        .contentType(MediaType.APPLICATION_JSON)
//                ).andDo(print())
//                .andExpect(status().isCreated())
//                .andExpect(content().json(createOutputJson));
//    }
//
//    @Test
//    public void shouldGetAllLabelRecs() throws Exception {
//        mockMvc.perform(get("/labelRec"))
//                .andDo(print())
//                .andExpect(status().isOk())
//                .andExpect(content().json(allLabelJson));
//    }
//
//    @Test
//    public void shouldGetLabelRecById() throws Exception {
//        mockMvc.perform(get("/label/" + labelId))
//                .andDo(print())
//                .andExpect(status().isOk())
//                .andExpect(content().json(mockOutputJson));
//    }
//
//    @Test
//    public void shouldUpdateLabelRec() throws Exception {
//        mockMvc.perform(put("/labelRec/" + labelId)
//                        .content(createLabelJson)
//                        .contentType(MediaType.APPLICATION_JSON))
//                .andDo(print())
//                .andExpect(status().isNoContent());
//    }
//
//    @Test
//    public void shouldDeleteLabelRec() throws Exception {
//        mockMvc.perform(delete("/labelRec/" + labelId))
//                .andDo(print())
//                .andExpect(status().isNoContent());
//    }
//
//}