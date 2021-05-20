package com.example.student.stu;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class student {
	@Id
	private int id;
	private String name;
	private String std;
	private int age;
	private int Dob;
	private String state;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStd() {
		return std;
	}
	public void setStd(String std) {
		this.std = std;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getDob() {
		return Dob;
	}
	public void setDob(int dob) {
		Dob = dob;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	@Override
	public String toString() {
		return "student [id=" + id + ", name=" + name + ", std=" + std + ", age=" + age + ", Dob=" + Dob + ", state="
				+ state + "]";
	}
	
}
