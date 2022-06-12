package com.bestrecs.musicstorerecommendations.repository;

import com.bestrecs.musicstorerecommendations.model.AlbumRecommendation;
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
public class AlbumRecRepositoryTests {

    @Autowired
    AlbumRecRepository repo;

    @Before
    public void setUp() throws Exception {
        repo.deleteAll();
    }

    @Test
    public void shouldGetAddDeleteAlbumRecommendation() {
        AlbumRecommendation albumRec = new AlbumRecommendation();
        albumRec.setAlbumId(1);
        albumRec.setUserId(1);
        albumRec.setLiked(Boolean.valueOf("True"));

        albumRec = repo.save(albumRec);

        Optional<AlbumRecommendation> albumRec1 = repo.findById(albumRec.getId());

        assertEquals(albumRec1.get(), albumRec);

        repo.deleteById(albumRec.getId());

        albumRec1 = repo.findById(albumRec.getId());

        assertFalse(albumRec1.isPresent());
    }

    @Test
    public void shouldGetAllAlbumRecommendations() {
        AlbumRecommendation albumRec1 = new AlbumRecommendation();
        albumRec1.setAlbumId(1);
        albumRec1.setUserId(1);
        albumRec1.setLiked(Boolean.valueOf("True"));
        albumRec1 = repo.save(albumRec1);

        AlbumRecommendation albumRec2 = new AlbumRecommendation();
        albumRec2.setAlbumId(2);
        albumRec2.setUserId(2);
        albumRec2.setLiked(Boolean.valueOf("True"));
        albumRec2 = repo.save(albumRec2);

        List<AlbumRecommendation> arList = repo.findAll();

        assertEquals(arList.size(), 2);
    }

    @Test
    public void shouldUpdateAlbumRecommendation() {
        AlbumRecommendation albumRec = new AlbumRecommendation();
        albumRec.setAlbumId(1);
        albumRec.setUserId(1);
        albumRec.setLiked(Boolean.valueOf("True"));
        albumRec = repo.save(albumRec);

        albumRec.setAlbumId(2);
        albumRec.setUserId(2);
        albumRec.setLiked(Boolean.valueOf("False"));
        repo.save(albumRec);

        Optional<AlbumRecommendation> albumRec1 = repo.findById(albumRec.getId());
        assertEquals(albumRec1.get(), albumRec);
    }
}
