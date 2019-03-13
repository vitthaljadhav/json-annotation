package com.vitthal.zuul.bean;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonEnumDefaultValue;
import com.fasterxml.jackson.annotation.JsonValue;

public enum Major {
	// PHYSICS("physics"), CHEMISTRY("chemistry"), MATH("maths"),
	// @JsonEnumDefaultValue UNKNOWN("unknown");

	PHYSICS("physics"), CHEMISTRY("chemistry"), MATH("maths");
	private String value;

	private Major(String value) {
		this.value = value;
	}

	@JsonValue
	public String value() {
		return value;
	}

	@JsonCreator
	public static Major fromValue(String value) {
		for(Major type:Major.values()) {
			if(type.value.equals(value)) {
				return type;
			}
		}
		return null;
	}
}
