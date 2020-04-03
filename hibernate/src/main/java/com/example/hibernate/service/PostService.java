package com.example.hibernate.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hibernate.models.Post;
import com.example.hibernate.repo.PostRepo;

@Service
public class PostService {

	@Autowired
	private PostRepo postRepo;

	public List<Post> findAll() {
		return (List<Post>) postRepo.findAll();
	}

	public Optional<Post> findById(Integer id) {
		return postRepo.findById(id);
	}

	public void addPost(Post post) {
		postRepo.save(post);
	}

}
