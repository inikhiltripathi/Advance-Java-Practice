package com.nik.dto;

public class UserDto {
	private String name, mobile, email, pass;

	public UserDto() {}

	public UserDto(String name, String mobile, String email, String pass) {
		this.name = name;
		this.mobile = mobile;
		this.email = email;
		this.pass = pass;
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

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

}
