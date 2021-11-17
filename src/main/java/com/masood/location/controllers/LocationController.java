package com.masood.location.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.masood.location.entites.Location;
import com.masood.location.service.LocationService;

@Controller
public class LocationController {

	@Autowired
	LocationService service;

	@RequestMapping("/showCreate")
	public String showCreate() {
		return "createLocation";
	}

	@RequestMapping("/saveloc")
	public String saveLocation(@ModelAttribute("location") Location location, ModelMap modelmap) {
		Location getlocation = service.saveloc(location);
		String msg = "Location id:=" + getlocation.getLoc_id();
		modelmap.addAttribute("msg", msg);
		return "createLocation";
	}

	@RequestMapping("/displayLocation")
	public String displatLocations(ModelMap modelmap) {
		List<Location> locations = service.getAllLocation();
		modelmap.addAttribute("locations", locations);
		return "displayLocations";
	}
}
