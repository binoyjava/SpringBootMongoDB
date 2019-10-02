package com.java.user.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.java.user.model.User;
import com.java.user.model.UserRepository;

@RestController
public class UserController {
	
	@Autowired
	private UserRepository userRepository;

	@GetMapping("/findAllUsers")
	public List<User> getUsers() {
		return userRepository.findAll();
	}
	
	
	@PostMapping("/addUser")
	public String saveBook(@RequestBody User user) {
		userRepository.save(user);
		return "Added book user id : " + user.getId();
	}

	@GetMapping("/findAllUsers/{id}")
	public User getBook(@PathVariable long id) {
		return userRepository.findOne(id);
	}

	@DeleteMapping("/delete/{id}")
	public String deleteUser(@PathVariable long id) {
		userRepository.delete(id);
		return "user deleted with id : " + id;
	}
	
}
