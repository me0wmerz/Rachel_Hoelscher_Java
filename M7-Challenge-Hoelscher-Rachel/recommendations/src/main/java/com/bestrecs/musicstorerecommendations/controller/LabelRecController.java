package com.bestrecs.musicstorerecommendations.controller;

import com.bestrecs.musicstorerecommendations.exception.BadLabelRecIdException;
import com.bestrecs.musicstorerecommendations.model.LabelRecommendation;
import com.bestrecs.musicstorerecommendations.repository.LabelRecRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/labelRec")
public class LabelRecController {
    @Autowired
    private LabelRecRepository repo;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public LabelRecommendation createLabelRecommendation(@RequestBody LabelRecommendation label) {
        return repo.save(label);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<LabelRecommendation> getAllLabelRecommendations() {
        return repo.findAll();
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public LabelRecommendation getLabelRecommendationById(@PathVariable int id) {
        Optional<LabelRecommendation> optionalLabelRec = repo.findById(id);
        if (optionalLabelRec.isPresent() == false) {
            throw new BadLabelRecIdException("There is no Label Recommendation with id " + id);
        }
        return optionalLabelRec.get();
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void updateLabelRecommendation(@PathVariable int id, @RequestBody LabelRecommendation labelRec) {
        if (labelRec.getId() == null) {
            labelRec.setId(id);
        } else if (labelRec.getId() != id) {
            throw new BadLabelRecIdException("The id in your path (" + id + ") is different than the id in your body (" + labelRec.getId() + ").");
        }

        repo.save(labelRec);
    }

    @DeleteMapping("{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void removeLabelRecommendation(@PathVariable int id) {
        repo.deleteById(id);
    }
}
