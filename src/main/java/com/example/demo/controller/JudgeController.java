package com.example.demo.controller;

import com.example.demo.model.Judge;
import com.example.demo.repository.JudgeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/judges")
public class JudgeController {
    @Autowired
    private JudgeRepository judgeRepository;

    @GetMapping
    public List<Judge> getAllSubmissions() {
        return judgeRepository.findAll();
    }

    @PostMapping
    public Judge createJudge(@RequestBody Judge judge) {
        return judgeRepository.save(judge);
    }

    @PutMapping("/{id}")
    public Judge updateJudge(@PathVariable Long id, @RequestBody Judge judge) {
        judge.setId(id);
        return judgeRepository.save(judge);
    }

    @DeleteMapping("/{id}")
    public void deleteJudge(@PathVariable Long id) {
        judgeRepository.deleteById(id);
    }
}
