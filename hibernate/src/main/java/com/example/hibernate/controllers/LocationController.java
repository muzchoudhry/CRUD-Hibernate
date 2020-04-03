package com.example.hibernate.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.hibernate.models.Location;
import com.example.hibernate.models.User;
import com.example.hibernate.service.LocationService;

@RestController
public class LocationController {

	@Autowired
	private LocationService locationService;
	
	@GetMapping("/locations")
	private List<Location> getAllLocations(){
		return locationService.getAllLocations();
	}
	
	@GetMapping("/locations/{id}")
	private Optional<Location> getLocationById(@PathVariable Integer id) {
		return locationService.findById(id);
	}
	
	@GetMapping("locations/{id}/users")
	public List<User> getUserByLocation(@PathVariable Integer id){
		Optional<Location> location = locationService.findById(id);
		if(location.isPresent()) {
			return location.get().getUsers();
		}
		return null;
	}	
	
	@PostMapping("/locations/addNew")
	public void AddLocation(@RequestBody Location location) {
		locationService.AddLocation(location);
	}
}
