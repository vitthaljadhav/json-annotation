package com.vitthal.zuul.bean;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonSubTypes({ @Type(value = Car.class, name = "car"), @Type(value = Bike.class, name = "bike"),
		@Type(value = Bus.class, name = "bus") })
public abstract class Vehicle {

}
