package com.enumtech.sbi.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="stud")
public class Student
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int rno;
	
	@Column(name="studentname",nullable = false,length = 10)
	private String sname;
	
	@Column(unique = true)
	private String email;
	
	
	private int age;


	public int getRno() {
		return rno;
	}


	public void setRno(int rno) {
		this.rno = rno;
	}


	public String getSname() {
		return sname;
	}


	public void setSname(String sname) {
		this.sname = sname;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public Student(int rno, String sname, String email, int age) {
		super();
		this.rno = rno;
		this.sname = sname;
		this.email = email;
		this.age = age;
	}
	
	public Student() {}
	
	
}
