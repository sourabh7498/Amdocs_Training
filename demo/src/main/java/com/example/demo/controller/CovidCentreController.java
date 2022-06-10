package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.CovidCentreDao;
import com.example.demo.pojo.CovidCentre;

@RestController
public class CovidCentreController {
	
	@Autowired
	CovidCentreDao dao;
	
	@GetMapping("/allcentres")
	public List<CovidCentre> allCentres(){
		return dao.getAll();
	}
	
	@GetMapping("/allcentres/{pincode}")
	public CovidCentre getByPincode(@PathVariable int pincode) {
		return dao.getByPincode(pincode);
	}
	
	@PostMapping("/addcovidcentre")
	public String addCentre(@RequestBody CovidCentre newCentre) {
		return dao.addCentre(newCentre);
	}
}
