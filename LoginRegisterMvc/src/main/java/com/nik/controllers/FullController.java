package com.nik.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.nik.dto.UserDto;
import com.nik.services.ServicesImpl;



@Controller
public class FullController {

	private ServicesImpl service;

	@Autowired
	public void setService(ServicesImpl service) {
		this.service = service;
	}

	@GetMapping(value = "/")
	public String homePage() {
		return "index";
	}

	@GetMapping(value = "/register")
	public String registerPage() {
		return "Register";
	}
	

	@PostMapping("/doRegister")
	public String doRegister(@ModelAttribute UserDto userDto) {

		UserDto registerUser = service.registerUser(userDto);
		if (registerUser != null) {
			return "index";
		} else {
			return null;
		}
	}
	@PostMapping("/doLogin")
	public String doLogin(@ModelAttribute UserDto dto) {
		UserDto login= service.loginUser(dto);
		if (login != null) {
			return "welcome";
		} else {
			return null;

		}
	}

}
