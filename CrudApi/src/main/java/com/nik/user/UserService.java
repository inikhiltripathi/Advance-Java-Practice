package com.nik.user;

import java.util.Map;

import org.modelmapper.ModelMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class UserService {

	private UserRepository repo;
	private ModelMapper mapper;

	public UserService(UserRepository repo, ModelMapper mapper) {
		this.repo = repo;
		this.mapper = mapper;
	}
	
	
	

	public ResponseEntity<Object> doRegister(UserDto dto) {
		//UserEntity s = null;
		UserEntity findByEmail = repo.findByEmail(dto.getEmail());
		if (findByEmail == null) {
			UserEntity e = mapper.map(dto, UserEntity.class);
			UserEntity saved = repo.save(e);		
			UserDto s = mapper.map(saved, UserDto.class);
			//return ResponseEntity.accepted().body("Registration Successful");
			if (s != null) {
				return ResponseEntity.accepted().body("Registration Successful");
			} else {
				return ResponseEntity.internalServerError().body("Something went wrong");
			}
		} else {
			return ResponseEntity.badRequest().body("Email already exists");
		}
	}

		
	
	public ResponseEntity<Object> doLogin(Map<String, String> loginData) {
		String email = null,password = null;
		
		for (Map.Entry<String, String> entry : loginData.entrySet()) {
			String key = entry.getKey();
			//System.out.println(key);
			
			if (key.equals("email")) {
				email=entry.getValue();	
			} else {
				password=entry.getValue();
			}  
		}
		UserEntity e = repo.findByEmailAndPassword(email, password);
		//System.out.println(e);
		
		if (e != null) {
			return ResponseEntity.accepted().body("Login Successful");
		} else {
			return ResponseEntity.badRequest().body("No User Found");
		}	
	}



	public ResponseEntity<Object> doUpdate(int id, UserDto dto) throws IllegalArgumentException {
		
		//Optional<UserEntity> findById = repo.findById(id);
		//UserEntity orElse = findById.orElse(null);
		UserEntity e = repo.findById(id).orElse(null);
		
		if (e != null) {
			UserEntity mappedEntity = mapper.map(dto, UserEntity.class);
			mappedEntity.setId(id);
			repo.save(mappedEntity);
			return ResponseEntity.accepted().body("Details Updated Successfully");
		} else {
			return ResponseEntity.badRequest().body("No User Found with this Id");
		}
	}



	public ResponseEntity<Object> doDelete(int id){
		
		UserEntity e = repo.findById(id).orElse(null);
		
		if (e != null) {
			repo.delete(e);
			return ResponseEntity.ok("User Deleted Successfully");
		} else {
			return ResponseEntity.badRequest().body("No User Found with this Id");
		}
	}
}
