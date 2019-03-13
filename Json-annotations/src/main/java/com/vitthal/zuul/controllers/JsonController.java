package com.vitthal.zuul.controllers;

import java.util.Date;
import java.util.HashMap;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vitthal.zuul.bean.AutoMobile;
import com.vitthal.zuul.bean.Student;

@RestController
@RequestMapping("/json")
public class JsonController {

	@PostMapping("/student")
	public Student studentData(@RequestBody Student student) {
		student.setRequesttxt("rquest");
		student.setResponsetxt("{\"someitem\":\"anotherItem\"}");
		student.setSector(null);
		student.setShape(null);
		
		HashMap<String, String> hashMap = new HashMap<String, String>();
		hashMap.put("subject1", "java");
		hashMap.put("subject2","c++");
		hashMap.put("subject3",".net" );
		student.setMap(hashMap);
		
		student.setTimestamp(new Date());
		return student;
	}
	
	@PostMapping("/auto")
	public AutoMobile autoMobie(@RequestBody AutoMobile autoMobile) {
		return autoMobile;
	}
}
