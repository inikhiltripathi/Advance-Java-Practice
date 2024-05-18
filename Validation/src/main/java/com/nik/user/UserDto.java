package com.nik.user;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

public class UserDto {

	@NotEmpty(message = "Name cannot be blank")
	private String name;

	@Size(min = 10, max = 10, message = "Mobile Number is not Valid")
	private String mobile;

	public UserDto() {

	}

	public UserDto(String name, String mobile) {
		super();
		this.name = name;
		this.mobile = mobile;
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

}
