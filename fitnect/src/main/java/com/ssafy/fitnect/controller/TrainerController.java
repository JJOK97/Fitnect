package com.ssafy.fitnect.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ssafy.fitnect.model.dto.ReviewTrainer;
import com.ssafy.fitnect.model.dto.ReviewTrainerSaveDto;
import com.ssafy.fitnect.model.dto.ReviewTrainerUpdateDto;
import com.ssafy.fitnect.model.service.ReviewService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/trainer")
@RequiredArgsConstructor
public class TrainerController {
	
	private final ReviewService reviewService;
	
	@GetMapping("/{trainerId}/review")
	public ResponseEntity<?> selectAllReviewTrainer(@PathVariable("trainerId") long trainerId) throws Exception {
		List<ReviewTrainer> result = reviewService.findAllReviewTrainerById(trainerId);
		return ResponseEntity.ok(result);
	}
	
	@GetMapping("/{trainerId}/review/{id}")
	public ResponseEntity<?> selectOneReviewTrainer(@PathVariable("trainerId") long trainerId, @PathVariable("id") long id) throws Exception {
		ReviewTrainer result = reviewService.findOneReviewTrainerById(id);
		return ResponseEntity.ok(result);
	}
	
	@PostMapping("/{trainerId}/review")
	public ResponseEntity<?> insertReviewTrainer(@PathVariable("trainerId") long trainerId, @RequestBody ReviewTrainerSaveDto reviewTrainer) throws Exception {
		reviewTrainer.setTrainerId(trainerId);
		int result = reviewService.writeReviewTrainer(reviewTrainer);
		return new ResponseEntity<>(result, result == 1 ? HttpStatus.CREATED : HttpStatus.BAD_REQUEST);
	}
	
	@PutMapping("/{trainerId}/review/{id}")
	public ResponseEntity<?> updateReviewTrainer(@PathVariable("trainerId") long trainerId, @PathVariable("id") long id, @RequestBody ReviewTrainerUpdateDto reviewTrainer) throws Exception {
		reviewTrainer.setTrainerId(trainerId);
		reviewTrainer.setReviewTrainerId(id);
		int result = reviewService.modifyReviewTrainer(reviewTrainer);
		return new ResponseEntity<>(result, result == 1 ? HttpStatus.OK : HttpStatus.BAD_REQUEST);
	}
	
	@DeleteMapping("/{trainerId}/review/{id}")
	public ResponseEntity<?> updateReviewTrainer(@PathVariable("trainerId") long trainerId, @PathVariable("id") long id) throws Exception {
		int result = reviewService.removeReviewTrainer(id);
		return new ResponseEntity<>(result, result == 1 ? HttpStatus.NO_CONTENT : HttpStatus.BAD_REQUEST);
	}
}