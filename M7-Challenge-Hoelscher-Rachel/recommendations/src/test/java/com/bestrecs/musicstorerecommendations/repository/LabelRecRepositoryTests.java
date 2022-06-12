package com.bestrecs.musicstorerecommendations.repository;

import com.bestrecs.musicstorerecommendations.model.ArtistRecommendation;
import com.bestrecs.musicstorerecommendations.model.LabelRecommendation;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;
import java.util.Optional;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class LabelRecRepositoryTests {
    @Autowired
    LabelRecRepository repo;

    @Before
    public void setUp() throws Exception {
        repo.deleteAll();
    }

    @Test
    public void shouldGetAddDeleteLabelRecommendation() {
        LabelRecommendation labelRec = new LabelRecommendation();
        labelRec.setLabelId(1);
        labelRec.setUserId(1);
        labelRec.setLiked(Boolean.valueOf("True"));

        labelRec = repo.save(labelRec);

        Optional<LabelRecommendation> labelRec1 = repo.findById(labelRec.getId());

        assertEquals(labelRec1.get(), labelRec);

        repo.deleteById(labelRec.getId());

        labelRec1 = repo.findById(labelRec.getId());

        assertFalse(labelRec1.isPresent());
    }

    @Test
    public void shouldGetLabelRecommendations() {
        LabelRecommendation labelRec1 = new LabelRecommendation();
        labelRec1.setLabelId(1);
        labelRec1.setUserId(1);
        labelRec1.setLiked(Boolean.valueOf("True"));
        labelRec1 = repo.save(labelRec1);

        LabelRecommendation labelRec2 = new LabelRecommendation();
        labelRec2.setLabelId(2);
        labelRec2.setUserId(2);
        labelRec2.setLiked(Boolean.valueOf("True"));
        labelRec2 = repo.save(labelRec2);

        List<LabelRecommendation> arList = repo.findAll();

        assertEquals(arList.size(), 2);
    }

    @Test
    public void shouldUpdateLabelRecommendation() {
        LabelRecommendation labelRec = new LabelRecommendation();
        labelRec.setLabelId(1);
        labelRec.setUserId(1);
        labelRec.setLiked(Boolean.valueOf("True"));
        labelRec = repo.save(labelRec);

        labelRec.setLabelId(2);
        labelRec.setUserId(2);
        labelRec.setLiked(Boolean.valueOf("False"));
        repo.save(labelRec);

        Optional<LabelRecommendation> labelRec1 = repo.findById(labelRec.getId());
        assertEquals(labelRec1.get(), labelRec);
    }
}
