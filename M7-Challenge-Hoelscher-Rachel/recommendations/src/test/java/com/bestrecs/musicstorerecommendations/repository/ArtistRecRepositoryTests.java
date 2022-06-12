package com.bestrecs.musicstorerecommendations.repository;

import com.bestrecs.musicstorerecommendations.model.AlbumRecommendation;
import com.bestrecs.musicstorerecommendations.model.ArtistRecommendation;
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
public class ArtistRecRepositoryTests {

    @Autowired
    ArtistRecRepository repo;

    @Before
    public void setUp() throws Exception {
        repo.deleteAll();
    }

    @Test
    public void shouldGetAddDeleteArtistRecommendation() {
        ArtistRecommendation artistRec = new ArtistRecommendation();
        artistRec.setArtistId(1);
        artistRec.setUserId(1);
        artistRec.setLiked(Boolean.valueOf("True"));

        artistRec = repo.save(artistRec);

        Optional<ArtistRecommendation> artistRec1 = repo.findById(artistRec.getId());

        assertEquals(artistRec1.get(), artistRec);

        repo.deleteById(artistRec.getId());

        artistRec1 = repo.findById(artistRec.getId());

        assertFalse(artistRec1.isPresent());
    }

    @Test
    public void shouldGetArtistRecommendations() {
        ArtistRecommendation artistRec1 = new ArtistRecommendation();
        artistRec1.setArtistId(1);
        artistRec1.setUserId(1);
        artistRec1.setLiked(Boolean.valueOf("True"));
        artistRec1 = repo.save(artistRec1);

        ArtistRecommendation artistRec2 = new ArtistRecommendation();
        artistRec2.setArtistId(2);
        artistRec2.setUserId(2);
        artistRec2.setLiked(Boolean.valueOf("True"));
        artistRec2 = repo.save(artistRec2);

        List<ArtistRecommendation> arList = repo.findAll();

        assertEquals(arList.size(), 2);
    }

    @Test
    public void shouldUpdateArtistRecommendation() {
        ArtistRecommendation artistRec = new ArtistRecommendation();
        artistRec.setArtistId(1);
        artistRec.setUserId(1);
        artistRec.setLiked(Boolean.valueOf("True"));
        artistRec = repo.save(artistRec);

        artistRec.setArtistId(2);
        artistRec.setUserId(2);
        artistRec.setLiked(Boolean.valueOf("False"));
        repo.save(artistRec);

        Optional<ArtistRecommendation> artistRec1 = repo.findById(artistRec.getId());
        assertEquals(artistRec1.get(), artistRec);
    }
}
