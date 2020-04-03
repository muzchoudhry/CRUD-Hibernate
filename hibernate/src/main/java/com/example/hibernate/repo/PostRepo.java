package com.example.hibernate.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.hibernate.models.Post;

@Repository
public interface PostRepo extends CrudRepository<Post, Integer> {

}
