package com.myproject.jersey.webapp.model;

import javax.ws.rs.Produces;
import javax.xml.bind.annotation.XmlRootElement;

@Produces("application/json")
@XmlRootElement
public class Truck {

	private String VIN;
	private String color;
	private Integer miles;

	public Truck(String VIN, String color, Integer miles)
	{
		this.VIN = VIN;
		this.color = color;
		this.miles = miles;
	}

	public String getVIN() {
		return VIN;
	}
	public void setVIN(String vIN) {
		VIN = vIN;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Integer getMiles() {
		return miles;
	}
	public void setMiles(Integer miles) {
		this.miles = miles;
	}
	
	@Override
	public String toString() {
		return "Truck [VIN=" + VIN + ", color=" + color + ", miles=" + miles
				+ "]";
	}
}
