package com.ssafy.fitnect.controller;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ssafy.fitnect.auth.CustomUserDetails;
import com.ssafy.fitnect.model.dto.Classes;
import com.ssafy.fitnect.model.dto.Users;
import com.ssafy.fitnect.model.service.ClassService;
import com.ssafy.fitnect.model.service.GymService;
import com.ssafy.fitnect.model.service.ReviewService;
import com.ssafy.fitnect.model.service.UserService;
import com.ssafy.fitnect.util.ApiResponse;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/classes")
public class ClassController {
	
	private final ClassService classService;
	private final UserService userService;
	
    @PostMapping("/{classId}")
    public ResponseEntity<?> regist(@PathVariable("classId") long classId) {
    	
    	long userId = getLoginUserId();
    	Classes classes = classService.getClassesById(classId);    	
    	
    	if (classes.getCurrent() == classes.getMaximum() || 
    		classes.getStartDate().isBefore(LocalDateTime.now())) {
    		return ResponseEntity.badRequest().body(ApiResponse.error(HttpStatus.BAD_REQUEST, "등록이 불가능합니다."));
    	}
    	
    	int result = classService.registClass(classId, userId);
		if (result == 1) {
			return ResponseEntity.created(null).body(ApiResponse.success(HttpStatus.CREATED, result));
		} else {
			return ResponseEntity.badRequest().body(ApiResponse.error(HttpStatus.BAD_REQUEST, "잘못된 접근입니다."));
		}
    }

	@DeleteMapping("/{classId}")
	public ResponseEntity<?> drop(@PathVariable("classId") long classId) throws Exception {
		long userId = getLoginUserId();
		
		int result = classService.dropClass(classId, userId);
		
		
		if (result == 1) {
			return ResponseEntity.status(HttpStatus.NO_CONTENT).body(ApiResponse.success(HttpStatus.NO_CONTENT, result));
		} else {
			return ResponseEntity.badRequest().body(ApiResponse.error(HttpStatus.BAD_REQUEST, "잘못된 접근입니다."));
		}
		
		
//		try {
//			int result = classService.dropClass(classId, userId);
//			return new ResponseEntity<>(result, result == 1 ? HttpStatus.NO_CONTENT : HttpStatus.BAD_REQUEST);			
//		} catch (Exception e) {
//			return new ResponseEntity<>("맞는 강의가 없습니다.", HttpStatus.BAD_REQUEST);
//		}
	}
	
	
	private long getLoginUserId() {
		return ( (CustomUserDetails) 
					( (UserDetails) SecurityContextHolder
									.getContext()
									.getAuthentication()
									.getPrincipal()
					)
				)
				.getUserId();
	}

}
