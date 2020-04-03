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
import com.example.hibernate.service.PostService;

@RestController
public class PostController {

	@Autowired
	private PostService postService;
	
	@GetMapping("/posts")
	private List<Post> getAllPosts(){
		return postService.findAll();
	}
	
	@GetMapping("/posts/{id}")
	private Optional<Post> getPostById(@PathVariable Integer id) {
		return postService.findById(id);
	}

	@PostMapping("/posts/addNew")
	public void addPost(@RequestBody Post post) {
		postService.addPost(post);
	}
}
