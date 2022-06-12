package com.bestrecs.musicstorerecommendations.repository;

import com.bestrecs.musicstorerecommendations.model.ArtistRecommendation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArtistRecRepository extends JpaRepository <ArtistRecommendation, Integer>{
}
