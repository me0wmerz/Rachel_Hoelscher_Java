package com.bestrecs.musicstorerecommendations.controller;

import com.bestrecs.musicstorerecommendations.exception.BadArtistRecIdException;
import com.bestrecs.musicstorerecommendations.model.ArtistRecommendation;
import com.bestrecs.musicstorerecommendations.repository.ArtistRecRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/artistRec")
public class ArtistRecController {
    @Autowired
    private ArtistRecRepository repo;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ArtistRecommendation createArtistRecommendation(@RequestBody ArtistRecommendation artistRec) {
        return repo.save(artistRec);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<ArtistRecommendation> getAllArtistRecommendations() {
        return repo.findAll();
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public ArtistRecommendation getArtistRecommendationById(@PathVariable int id) {
        Optional<ArtistRecommendation> optionalArtistRec = repo.findById(id);
        if (optionalArtistRec.isPresent() == false) {
            throw new BadArtistRecIdException("There is no Artist Recommendation with id " + id);
        }
        return optionalArtistRec.get();
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void updateArtistRecommendation(@PathVariable int id, @RequestBody ArtistRecommendation artistRec) {
        if (artistRec.getId() == null) {
            artistRec.setId(id);
        } else if (artistRec.getId() != id) {
            throw new BadArtistRecIdException("The id in your path (" + id + ") is different than the id in your body (" + artistRec.getId() + ").");
        }

        repo.save(artistRec);
    }

    @DeleteMapping("{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void removeArtistRecommendation(@PathVariable int id) {
        repo.deleteById(id);
    }
}
