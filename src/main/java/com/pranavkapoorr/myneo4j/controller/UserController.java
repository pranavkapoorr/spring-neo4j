package com.pranavkapoorr.myneo4j.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.pranavkapoorr.myneo4j.model.User;
import com.pranavkapoorr.myneo4j.service.UserService;

@RestController
public class UserController {
	@Autowired
	private UserService service;
	
	@GetMapping("/users")
	public Iterable<User> getUsers(){
		return service.getUsers();
	}
	@PostMapping("/user")
	public Long removeUser(@RequestParam String name){
		return service.removeUser(name);
	}
}
