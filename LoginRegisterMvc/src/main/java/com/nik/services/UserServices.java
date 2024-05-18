package com.nik.services;
import com.nik.dto.UserDto;

public interface UserServices {
	public UserDto registerUser(UserDto userDto);
	public UserDto loginUser(UserDto userDto);

}
