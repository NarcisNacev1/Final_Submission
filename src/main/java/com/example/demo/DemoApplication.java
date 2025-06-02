package com.example.demo;

import com.example.demo.model.Judge;
import com.example.demo.model.Score;
import com.example.demo.model.Submission;
import com.example.demo.repository.JudgeRepository;
import com.example.demo.repository.ScoreRepository;
import com.example.demo.repository.SubmissionRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;
import java.util.Arrays;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}


	@Bean
	CommandLineRunner initData(JudgeRepository judgeRepo,
							   SubmissionRepository submissionRepo,
							   ScoreRepository scoreRepo) {

		return args -> {
			judgeRepo.deleteAll();
			submissionRepo.deleteAll();
			scoreRepo.deleteAll();

			Judge john = judgeRepo.save(new Judge( "John", "Smith", "biologist"));
			Judge mila = judgeRepo.save(new Judge( "Mila", "Andrevska", "math"));
			Judge risto = judgeRepo.save(new Judge( "Risto", "Petkovski", "idk"));

			Submission sum1 = submissionRepo.save(new Submission( "Butterfly", "PORTRAIT", "Narcis", "https//facebook.com"));
			Submission sum2 = submissionRepo.save(new Submission( "Nature", "LANDSCAPE", "Koce", "https//instagram.com"));
			Submission sum3 = submissionRepo.save(new Submission( "Winter", "LANDSCAPE", "Filip", "https//pintrest.com"));
			Submission sum4 = submissionRepo.save(new Submission( "Cow", "PORTRAIT", "Andrej", "https//DevianArt.com"));
			Submission sum5 = submissionRepo.save(new Submission( "idk", "PORTRAIT", "Dejvid", "https//lagabuse.com"));

			scoreRepo.saveAll(Arrays.asList(
					new Score(10, "Really good", john, sum1),
					new Score(1, "Bad", mila, sum1),

					new Score(3, "Eh", risto, sum2),
					new Score(6, "OK", john, sum2),

					new Score(2, "huuh", risto, sum3),
					new Score(1, "really terrible", mila, sum3),

					new Score(10, "Really good", risto, sum4),
					new Score(9, "WOW", john, sum4),

					new Score(10, "well done", john, sum5),
					new Score(6, "Alright", john, sum5)
			));

			System.out.println("Data initialized");
		};
	}
}
