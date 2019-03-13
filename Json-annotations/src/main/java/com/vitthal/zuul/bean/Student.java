package com.vitthal.zuul.bean;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonRawValue;
import com.fasterxml.jackson.annotation.JsonSetter;

//@JsonIgnoreProperties({"major"})
//@JsonPropertyOrder({"subject","pincode","role","responsetxt"})
@JsonInclude(value = Include.NON_EMPTY)
public class Student {

	// @JsonProperty(value="student_id")
	private long id;

	private String name;

	private String role;
	// @JsonProperty(access=Access.WRITE_ONLY)
	private String pincode;

	// @JsonProperty(access=Access.READ_ONLY)
	@JsonRawValue
	private String responsetxt;

	// @JsonProperty(access=Access.READ_ONLY)
	private String requesttxt;

	private Major major;

	private boolean isStudent;

	private String sector;

	// @JsonIgnore
	private String subject;

	private String shape;

	Map<String, String> map = new HashMap<String, String>();
	@JsonFormat(shape = Shape.STRING, pattern = "dd-MM-yyyy hh:mm:ss")
	private Date timestamp;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getResponsetxt() {
		return responsetxt;
	}

	public void setResponsetxt(String responsetxt) {
		this.responsetxt = responsetxt;
	}

	public String getRequesttxt() {
		return requesttxt;
	}

	public void setRequesttxt(String requesttxt) {
		this.requesttxt = requesttxt;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getSector() {
		return sector;
	}

	public void setSector(String sector) {
		this.sector = sector;
	}

	public String getShape() {
		return shape;
	}

	public void setShape(String shape) {
		this.shape = shape;
	}

	public Major getMajor() {
		return major;
	}

	public void setMajor(Major major) {
		this.major = major;
	}

	@JsonGetter("isStudent")
	public boolean theStudent() {
		return isStudent;
	}

	@JsonSetter("isStudent")
	public void setStudent(boolean isStudent) {
		this.isStudent = isStudent;
	}

	@JsonAnyGetter
	public Map<String, String> getMap() {
		return map;
	}

	@JsonAnySetter
	public void setMap(String key, String value) {
		this.map.put(key, value);
	}

	public boolean isStudent() {
		return isStudent;
	}

	public Date getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

	public void setMap(Map<String, String> map) {
		this.map = map;
	}
}
