package com.nik.user;

import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<UserEntity, Integer>{
	
	UserEntity findByEmailAndPassword(String email,String password);

	UserEntity findByEmail(String email);

}
