package user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	@Autowired
	private UserService service; 
	
	@GetMapping("/all")
	public ResponseEntity<Object> all(){
		
		ResponseEntity<Object> meth = service.meth();
		return meth;
	}
	
	@GetMapping("/hi")
	public String hello() {
		return "Hello";
	}
}
