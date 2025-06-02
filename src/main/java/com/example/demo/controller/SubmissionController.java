package com.example.demo.controller;

import com.example.demo.model.Score;
import com.example.demo.model.Submission;
import com.example.demo.repository.SubmissionRepository;
import com.example.demo.service.ScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/submissions")
public class SubmissionController {
    @Autowired
    SubmissionRepository submissionRepository;
    @Autowired
    private ScoreService scoreService;

    @GetMapping
    public List<Submission> getAllSubmissions() {
        return submissionRepository.findAll();
    }

    @PostMapping
    public Submission createSubmission(@RequestBody Submission submission) {
        return submissionRepository.save(submission);
    }

    @PutMapping("/{id}")
    public Submission updateSubmission(@PathVariable Long id, @RequestBody Submission submission) {
        submission.setId(id);
        return submissionRepository.save(submission);
    }

    @PostMapping("/{subId}/judges/{judgeId}/scores")
    public Score addScore(@PathVariable Long subId,
                          @PathVariable Long judgeId,
                          @RequestBody Score score) {
        return scoreService.addScore(subId,judgeId,score);
    }
//Does not work with this uncommented
//    @GetMapping("/{subId}/scores")
//    public List<Score> getSubmissionScores(@PathVariable Long subId) {
//        return submissionRepository.findScoreBySubId(subId);
//    }
}
