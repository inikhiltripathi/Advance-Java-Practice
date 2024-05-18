package com.nik.user;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;


@Service
public class UserService {
	
	private UserRepository repo;
	private ModelMapper mapper;
	
	
	public UserService(UserRepository repo, ModelMapper mapper) {
		this.repo = repo;
		this.mapper = mapper;
	}



	public UserDto registerUser(UserDto dto) {
		
		UserEntity ent=mapper.map(dto, UserEntity.class);
		UserEntity save = repo.save(ent);
		UserDto udto=mapper.map(save, UserDto.class);
		return udto;	
	}

}
