package com.example.hibernate.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hibernate.models.Location;
import com.example.hibernate.repo.LocationRepo;

@Service
public class LocationService {

	@Autowired
	private LocationRepo locationRepo;
	
	public List<Location> getAllLocations() {
		return (List<Location>) locationRepo.findAll();
	}

//	public static Location getLocationById(Integer id) {
//		return locationRepo.findById(id);
//	}

	public Optional<Location> findById(Integer id) {
		return locationRepo.findById(id);
	}

	public void AddLocation(Location location) {
		locationRepo.save(location);
	}
	
}
