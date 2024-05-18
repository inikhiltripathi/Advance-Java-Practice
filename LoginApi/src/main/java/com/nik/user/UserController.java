package com.nik.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;




@RestController
public class UserController {
	
	@Autowired
	private UserService service;

    @GetMapping("/hi")
    public String getMethodName() {
        return "Hi from controller";
    }
    
    @PostMapping("/login")
    public ResponseEntity<Object> register(@RequestBody UserDto dto) {
    	
    	System.out.println(dto.getName()+dto.getMobile()+dto.getEmail()+dto.getPass());
    	
    	UserDto ud=service.doLogin(dto);
    	
        return ResponseEntity.ok().body(ud);
    }
    
    @DeleteMapping("/delete/{id}")
 public ResponseEntity<Object> delete(@PathVariable int id) {
    	
    	String s = service.doDelete(id);
    	
        return ResponseEntity.ok().body(s);
    }
    @PutMapping("/update/{id}")
    public ResponseEntity<Object> update(@PathVariable  int id , @RequestBody UserDto dto) {
    String s = service.doUpdate(dto, id);
    return ResponseEntity.ok().body(s);
    
    }
    

}
