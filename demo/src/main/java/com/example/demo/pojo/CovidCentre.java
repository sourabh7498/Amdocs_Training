package com.example.demo.pojo;

import org.springframework.stereotype.Component;

@Component
public class CovidCentre {
	private int centreId;
	private String cityName;
	private int pincode;
	
	public CovidCentre() {
		super();
	}
	
	public CovidCentre(int centreId, String cityName, int pincode) {
		this.centreId = centreId;
		this.cityName = cityName;
		this.pincode = pincode;
	}

	public int getCentreId() {
		return centreId;
	}

	public void setCentreId(int centreId) {
		this.centreId = centreId;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	
}
