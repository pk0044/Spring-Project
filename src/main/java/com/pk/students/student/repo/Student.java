package com.pk.students.student.repo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	int id;
	String name;
	int standered;
	String address;
	
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

	public Student(int id, String name, int standered, String address) {
		super();
		this.id = id;
		this.name = name;
		this.standered = standered;
		this.address = address;
	}

	public int getStandered() {
		return standered;
	}

	public void setStandered(int standered) {
		this.standered = standered;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	public Student() {
		
	}

	public Student(String name, int standered, String address) {
		super();
		this.name = name;
		this.standered = standered;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", standered=" + standered + ", address=" + address + "]";
	}
	
	
}
