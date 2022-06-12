package com.bestrecs.musicstorerecommendations.repository;

import com.bestrecs.musicstorerecommendations.model.TrackRecommendation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TrackRecRepository extends JpaRepository <TrackRecommendation, Integer>{
}
