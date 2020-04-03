package com.example.hibernate.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hibernate.models.User;
import com.example.hibernate.repo.UserRepo;

@Service
public class UserService {

	@Autowired
	private UserRepo userRepo;

	public List<User> getAllUsers() {
		return (List<User>) userRepo.findAll();
	}

	public Optional<User> getUserById(Integer id) {
		return userRepo.findById(id);
	}

	public void addUser(User user) {
		userRepo.save(user);
	}
	
}
