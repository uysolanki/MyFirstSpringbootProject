package com.enumtech.sbi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.enumtech.sbi.entity.Student;
import com.enumtech.sbi.repository.StudentRepository;

@Service
public class StudentService {

	@Autowired
	StudentRepository studrepo;
	
	public Student addStudent(Student s1) {
	return studrepo.save(s1);	
		
		
		
		
	}

	
}
