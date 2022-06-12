package com.bestrecs.musicstorerecommendations.repository;

import com.bestrecs.musicstorerecommendations.model.ArtistRecommendation;
import com.bestrecs.musicstorerecommendations.model.TrackRecommendation;
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
public class TrackRecRepositoryTests {
    @Autowired
    TrackRecRepository repo;

    @Before
    public void setUp() throws Exception {
        repo.deleteAll();
    }

    @Test
    public void shouldGetAddDeleteTrackRecommendation() {
        TrackRecommendation trackRec = new TrackRecommendation();
        trackRec.setTrackId(1);
        trackRec.setUserId(1);
        trackRec.setLiked(Boolean.valueOf("True"));

        trackRec = repo.save(trackRec);

        Optional<TrackRecommendation> trackRec1 = repo.findById(trackRec.getId());

        assertEquals(trackRec1.get(), trackRec);

        repo.deleteById(trackRec.getId());

        trackRec1 = repo.findById(trackRec.getId());

        assertFalse(trackRec1.isPresent());
    }

    @Test
    public void shouldGetTrackRecommendations() {
        TrackRecommendation trackRec1 = new TrackRecommendation();
        trackRec1.setTrackId(1);
        trackRec1.setUserId(1);
        trackRec1.setLiked(Boolean.valueOf("True"));
        trackRec1 = repo.save(trackRec1);

        TrackRecommendation trackRec2 = new TrackRecommendation();
        trackRec2.setTrackId(2);
        trackRec2.setUserId(2);
        trackRec2.setLiked(Boolean.valueOf("True"));
        trackRec2 = repo.save(trackRec2);

        List<TrackRecommendation> trList = repo.findAll();

        assertEquals(trList.size(), 2);
    }

    @Test
    public void shouldUpdateTrackRecommendation() {
        TrackRecommendation trackRec = new TrackRecommendation();
        trackRec.setTrackId(1);
        trackRec.setUserId(1);
        trackRec.setLiked(Boolean.valueOf("True"));
        trackRec = repo.save(trackRec);

        trackRec.setTrackId(2);
        trackRec.setUserId(2);
        trackRec.setLiked(Boolean.valueOf("False"));
        repo.save(trackRec);

        Optional<TrackRecommendation> trackRec1 = repo.findById(trackRec.getId());
        assertEquals(trackRec1.get(), trackRec);
    }
}
