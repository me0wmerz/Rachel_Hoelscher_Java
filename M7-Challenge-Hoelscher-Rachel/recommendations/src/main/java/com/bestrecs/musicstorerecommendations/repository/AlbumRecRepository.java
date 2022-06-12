package com.bestrecs.musicstorerecommendations.repository;

import com.bestrecs.musicstorerecommendations.model.AlbumRecommendation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlbumRecRepository extends JpaRepository <AlbumRecommendation, Integer>{
}
