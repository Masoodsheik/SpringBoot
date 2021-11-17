package com.masood.location.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.masood.location.entites.Location;
import com.masood.location.repository.LocationRespository;

@Service
public class LocationServiceImpl implements LocationService {
	@Autowired
	LocationRespository repository;
	
	@Override
	public Location saveloc(Location location) {
		return repository.save(location);
	}

	@Override
	public Location updateloc(Location location) {
		return repository.save(location);
	}

	@Override
	public void deleteloc(Location location) {
		repository.delete(location);
	}

	@Override
	public Location getLocationByid(Long id) {
		return repository.findById(id).get();
	}

	@Override
	public List<Location> getAllLocation() {
		return repository.findAll();
	}

}
