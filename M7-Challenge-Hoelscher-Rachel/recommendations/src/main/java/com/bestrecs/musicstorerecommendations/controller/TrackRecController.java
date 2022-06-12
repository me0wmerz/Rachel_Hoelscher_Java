package com.bestrecs.musicstorerecommendations.controller;

import com.bestrecs.musicstorerecommendations.exception.BadLabelRecIdException;
import com.bestrecs.musicstorerecommendations.exception.BadTrackRecIdException;
import com.bestrecs.musicstorerecommendations.model.LabelRecommendation;
import com.bestrecs.musicstorerecommendations.model.TrackRecommendation;
import com.bestrecs.musicstorerecommendations.repository.TrackRecRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.sound.midi.Track;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/trackRec")
public class TrackRecController {
    @Autowired
    private TrackRecRepository repo;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public TrackRecommendation createTrackRecommendation(@RequestBody TrackRecommendation trackRec) {
        return repo.save(trackRec);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<TrackRecommendation> getAllTrackRecs() {
        return repo.findAll();
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public TrackRecommendation getTrackRecById(@PathVariable int id) {
        Optional<TrackRecommendation> optionalTrackRec = repo.findById(id);
        if (optionalTrackRec.isPresent() == false) {
            throw new BadTrackRecIdException("There is no Track Recommendation with id " + id);
        }
        return optionalTrackRec.get();
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void updateTrackRecommendation(@PathVariable int id, @RequestBody TrackRecommendation trackRec) {
        if (trackRec.getId() == null) {
            trackRec.setId(id);
        } else if (trackRec.getId() != id) {
            throw new BadLabelRecIdException("The id in your path (" + id + ") is different than the id in your body (" + trackRec.getId() + ").");
        }

        repo.save(trackRec);
    }

    @DeleteMapping("{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void removeTrackRecommendation(@PathVariable int id) {
        repo.deleteById(id);
    }
}
