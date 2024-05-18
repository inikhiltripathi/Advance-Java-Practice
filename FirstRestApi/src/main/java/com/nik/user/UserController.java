package com.nik.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	@Autowired
	private UserService service;

	@GetMapping("/hi")
	public String m1() {
		return "Hello World!!";
	}

	@PostMapping("/register")
	public String m2(@RequestBody UserDto userDto) {
		UserDto dto=service.registerUser(userDto);
		if (dto != null) {
			return "Successfull";
		} else {
			return "Not Registered";

		}

	}

}
