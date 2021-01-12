package com.icaro.springproblem.demo.api;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {
	
	@GetMapping
	public ResponseEntity<List<String>> getAllUsers() {
		List<String> users = Arrays.asList("John", "Doe");
		
		return ResponseEntity.ok(users);
	}
}
