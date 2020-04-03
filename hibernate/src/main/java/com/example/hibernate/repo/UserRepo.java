package com.example.hibernate.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.hibernate.models.User;

@Repository
public interface UserRepo extends CrudRepository<User, Integer> {

}
