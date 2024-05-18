package com.nik.user;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;




@RestController
public class UserController {
	
	@Autowired
	private UserService service;


	
    @PostMapping("/register")
    public ResponseEntity<Object> register(@Valid @RequestBody UserDto dto) {
        return service.doRegister(dto);
    }
    
    
    
    @PostMapping("/login")
    public ResponseEntity<Object> login(@RequestBody Map<String, String> loginData){
    	 return service.doLogin(loginData);	
    }
    
     

    @PutMapping("/update/{id}")
    public ResponseEntity<Object> update(@PathVariable int id, @Valid @RequestBody UserDto dto){
		return service.doUpdate(id, dto);
    	
    }
    
    
    
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Object> delete(@PathVariable int id){
    	return service.doDelete(id);
    }
    
    
    
    
    
    
    
    
    
    
    
}
