package hr.hsnopek.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;  

@RestController  
public class HelloWorldController {  

	@GetMapping(value = "/api/hello-world")
	public ResponseEntity<String> hello() {
		return ResponseEntity.ok("Hello world!");
	}  
}  