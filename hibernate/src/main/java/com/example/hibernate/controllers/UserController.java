package com.example.hibernate.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.hibernate.models.Post;
import com.example.hibernate.models.User;
import com.example.hibernate.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService userService;

	@GetMapping("/users")
	public List<User> getAllUsers() {
		return userService.getAllUsers();
	}

	@GetMapping("/users/{id}")
	public Optional<User> getUserById(@PathVariable Integer id) {
		return userService.getUserById(id);
	}

	@GetMapping("/users/{id}/posts")
	public List<Post> getPostsByUser(@PathVariable Integer id) {
		Optional<User> user = userService.getUserById(id);
		if (user.isPresent()) {
			return user.get().getPosts();
		}
		return null;
	}

	@PostMapping("/users/addNew")
	public void AddUser(@RequestBody User user) {
		userService.addUser(user);
	}

}
