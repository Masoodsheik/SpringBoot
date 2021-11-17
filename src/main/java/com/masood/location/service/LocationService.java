package com.masood.location.service;

import java.util.List;

import com.masood.location.entites.Location;

public interface LocationService {
	Location saveloc(Location location);
	Location updateloc(Location location);
	void deleteloc(Location location);
	Location getLocationByid(Long id);
	List<Location> getAllLocation();
}
