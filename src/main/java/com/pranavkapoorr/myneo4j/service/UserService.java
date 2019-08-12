package com.pranavkapoorr.myneo4j.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.pranavkapoorr.myneo4j.model.User;
import com.pranavkapoorr.myneo4j.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserRepository repository;
	
	public Iterable<User> getUsers() {
		return repository.findAll();
	}
	public Long removeUser(String name) {
		return repository.deleteByName(name);
	}
}
