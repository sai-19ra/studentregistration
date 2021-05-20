package com.example.student.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.student.stu.student;

public interface studentrepo extends JpaRepository<student,Integer>{
	

}
