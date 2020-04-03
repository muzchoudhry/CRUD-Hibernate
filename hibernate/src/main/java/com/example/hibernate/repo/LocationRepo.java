package com.example.hibernate.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.hibernate.models.Location;

@Repository
public interface LocationRepo extends CrudRepository<Location, Integer> {

}
