package com.vitthal.zuul.bean;

import com.fasterxml.jackson.annotation.JsonTypeName;

@JsonTypeName("bus")
public class Bus extends Vehicle{

	private String bus_type;
	
	private String bus_name;

	public String getBus_type() {
		return bus_type;
	}

	public void setBus_type(String bus_type) {
		this.bus_type = bus_type;
	}

	public String getBus_name() {
		return bus_name;
	}

	public void setBus_name(String bus_name) {
		this.bus_name = bus_name;
	}
	
}
