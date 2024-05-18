package com.nik.user;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;

public class UserDto {

	@NotEmpty(message = "Invalid Name.")
	private String name;

	@NotEmpty(message = "Invalid Mobile Number.")
	private String mobile;
	
	@NotEmpty
	@Email(message = "Invalid Email Address.")
	private String email;

	@NotEmpty(message = "Invalid Password")
	private String password;	

	
	
	
	
	public UserDto() {
	}

	public UserDto(String name, String mobile, String email, String password) {
		this.name = name;
		this.mobile = mobile;
		this.email = email;
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
