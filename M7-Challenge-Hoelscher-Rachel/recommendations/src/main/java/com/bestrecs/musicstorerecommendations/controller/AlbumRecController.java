package com.bestrecs.musicstorerecommendations.controller;

import com.bestrecs.musicstorerecommendations.exception.BadAlbumRecIdException;
import com.bestrecs.musicstorerecommendations.model.AlbumRecommendation;
import com.bestrecs.musicstorerecommendations.repository.AlbumRecRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/albumRec")
public class AlbumRecController {
    @Autowired
    private AlbumRecRepository repo;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public AlbumRecommendation createAlbumRecommendation(@RequestBody AlbumRecommendation albumRec) {
        return repo.save(albumRec);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<AlbumRecommendation> getAllAlbumRecommendations() {
        return repo.findAll();
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public AlbumRecommendation getAlbumRecById(@PathVariable int id) {
        Optional<AlbumRecommendation> optionalAlbumRec = repo.findById(id);
        if (optionalAlbumRec.isPresent() == false) {
            throw new BadAlbumRecIdException("There is no Album Recommendation with id " + id);
        }
        return optionalAlbumRec.get();
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void updateAlbumRecommendation(@PathVariable int id, @RequestBody AlbumRecommendation albumRec) {
        if (albumRec.getId() == null) {
            albumRec.setId(id);
        } else if (albumRec.getId() != id) {
            throw new BadAlbumRecIdException("The id in your path (" + id + ") is different than the id in your body (" + albumRec.getId() + ").");
        }

        repo.save(albumRec);
    }

    @DeleteMapping("{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void removeAlbumRecommendation(@PathVariable int id) {
        repo.deleteById(id);
    }
}
