package com.enumtech.sbi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.enumtech.sbi.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
