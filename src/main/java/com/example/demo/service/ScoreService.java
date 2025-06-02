package com.example.demo.service;

import com.example.demo.model.Judge;
import com.example.demo.model.Score;
import com.example.demo.model.Submission;
import com.example.demo.repository.JudgeRepository;
import com.example.demo.repository.ScoreRepository;
import com.example.demo.repository.SubmissionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ScoreService {
    @Autowired
    private ScoreRepository scoreRepo;
    @Autowired private JudgeRepository judgeRepo;
    @Autowired private SubmissionRepository submissionRepo;

    public Score addScore(Long submissionId, Long judgeId, Score score) {
        Submission submission = submissionRepo.findById(submissionId)
                .orElseThrow(() -> new RuntimeException("Submission Not Found"));
        Judge judge = judgeRepo.findById(judgeId)
                .orElseThrow(() -> new RuntimeException("Judge Not Found"));

                if (score.getValue() < 1 || score.getValue() > 10) {
                    throw new IllegalArgumentException("Score must be inbetween 1 and 10");
                }

                score.setSubmission(submission);
                score.setJudge(judge);
                return scoreRepo.save(score);
    }
}
