package com.nik.user;

import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepo extends JpaRepository<UserEntity, Integer> {

	UserEntity findByEmailAndPass(String email, String pass);

}
