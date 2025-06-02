package com.example.demo.repository;

import com.example.demo.model.Score;
import com.example.demo.model.Submission;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface SubmissionRepository extends JpaRepository<Submission, Long> {
// Does not work with this uncommented
//    @Query("SELECT s FROM score s WHERE s.score_id = :subId")
//    List<Score> findScoreBySubId(Long subId);
}


