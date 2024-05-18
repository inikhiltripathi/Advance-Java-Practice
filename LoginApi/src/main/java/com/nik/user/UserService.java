package com.nik.user;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	
	private UserRepo repo;
	private ModelMapper mapper;
	
	
	public UserService(UserRepo repo, ModelMapper mapper) {
		this.repo = repo;
		this.mapper = mapper;
	}



	public UserDto doLogin(UserDto dto) {
		

		UserEntity e = repo.findByEmailAndPass(dto.getEmail(), dto.getPass());
		if (e==null) {
			return null;
		} else {
			UserDto dto2=mapper.map(e, UserDto.class);
			return dto2;
		}
		
		
			
	}
	public String doDelete(int id) {
		
		
		UserEntity e;
		try {
			e = repo.getById(id);
			System.out.println(e);
			repo.delete(e);
			return "successfully Deleted";
		} catch (Exception ex) {
			return "No User";
		}
		
		
	}
	public String doUpdate(UserDto dto, int id) {
		
		UserEntity e = mapper.map(dto, UserEntity.class);
		e.setId(id);
		UserEntity save = repo.save(e);
		return "Updated";
				
	}

}
