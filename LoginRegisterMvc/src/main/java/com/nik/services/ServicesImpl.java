package com.nik.services;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nik.dto.UserDto;
import com.nik.entities.UserEntity;
import com.nik.repositories.UserRepo;

@Service
public class ServicesImpl implements UserServices {
	@Autowired
	private UserRepo repo;
	@Autowired
	private ModelMapper mapper;
	

	 
	public ServicesImpl(){	
	}
	
	@Override
	public UserDto registerUser(UserDto userDto) {
		
		UserEntity entity = mapper.map(userDto, UserEntity.class);
		UserEntity save = repo.save(entity);
		UserDto dto = mapper.map(save, UserDto.class);
		return dto;
	}

	@Override
	public UserDto loginUser(UserDto userDto) {
		UserEntity entity =mapper.map(userDto, UserEntity.class);
		UserEntity find = repo.findByEmailAndPass(entity.getEmail(), entity.getPass());
		System.out.println(find);
		UserDto dto=mapper.map(find, UserDto.class);
		System.out.println(dto);
		return dto;
	}
	

}
