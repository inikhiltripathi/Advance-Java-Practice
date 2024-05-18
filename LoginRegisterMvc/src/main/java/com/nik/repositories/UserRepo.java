package com.nik.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nik.entities.UserEntity;


@Repository
public interface UserRepo extends JpaRepository<UserEntity, Integer>{
	public UserEntity findByEmailAndPass(String email, String pass);

}
