package com.nik.user;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;

@RestController
public class UserController {
	 
	
	@GetMapping("/hi")
	public String m1() {
		return "Hello";
	}
	
	@PostMapping("/hello")
	public ResponseEntity<?> m2(@RequestBody @Valid UserDto dto){
		return new ResponseEntity<>("Saved", HttpStatus.OK);
		
	}



}
