package user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class UserService {

	@Autowired
	private RestTemplate rest;
	
	
	public ResponseEntity<Object> meth() {
		UserDto dto = new UserDto();
		dto.setId("108");
		dto.setName("Ram");
		
		return ResponseEntity.ok(dto);
	}
}
