package com.tka;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/method")
public class MyController {

	@GetMapping("/get")
	public String getAPI() {
		return "get method";
	}
	
	@PostMapping("/post")
	public String postAPI() {
		return "post method";
	}
	
	@PutMapping("/put")
	public String putAPI() {
		return "put method";
	}
	
	@DeleteMapping("/delete")
	public String deleteAPI() {
		return "delete method";
	}
	
	@PatchMapping("/patch")
	public String patchAPI() {
		return "patch method";
	}
}