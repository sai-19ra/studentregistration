package com.example.student.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.student.repo.studentrepo;

@RestController
public class studentcontroller {
	@Autowired
	studentrepo repo;
	@RequestMapping("/students")
	public String out() {
		return "out";
	}

}
