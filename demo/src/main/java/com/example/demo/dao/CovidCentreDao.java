package com.example.demo.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.example.demo.pojo.CovidCentre;

@Component
public class CovidCentreDao {

	List<CovidCentre> centres;
	
	public CovidCentreDao() {
		centres = new ArrayList<CovidCentre>();
		
		centres.add(new CovidCentre(1, "Pune", 411041));
		centres.add(new CovidCentre(2, "Satara", 411042));
		centres.add(new CovidCentre(3, "Karad", 411043));
	}
	
	public List<CovidCentre> getAll(){
		return centres;
	}
	
	public CovidCentre getByPincode(int pincode) {
		CovidCentre centre = null;
		
		for (CovidCentre c : centres) {
			if(c.getPincode() == pincode) {
				centre = c;
				break;
			}
		}
		return centre;
	}
	
	public String addCentre(CovidCentre newCentre) {
		centres.add(newCentre);
		return "Successfully Added";
	}
}
