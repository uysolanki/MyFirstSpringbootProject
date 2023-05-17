package com.enumtech.sbi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.enumtech.sbi.entity.Student;
import com.enumtech.sbi.service.StudentService;

@RestController
@RequestMapping("/sbi/v1")		//baseurl
public class SbiController {

	@Autowired
	StudentService studservice;
	
	@RequestMapping("/welcome") //end point
	public String greet()
	{
		return ("hi");
	}
	
	@PostMapping("/addStud")
	public Student addStudent(
			@RequestParam("sname") String sname,
			@RequestParam("email") String email,
			@RequestParam("age") int age
			)
		{
		Student s1=new Student();
		s1.setAge(age);
		s1.setEmail(email);
		s1.setSname(sname);
		
		return studservice.addStudent(s1);
		//return("Student Record Inserted");
		
	}
	
}
