package com.tka.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {

	@Id
	private int studId;
	private String name;
	private String address;

	public Student() {
		super();
	}

	public Student(int studId, String name, String address) {
		super();
		this.studId = studId;
		this.name = name;
		this.address = address;
	}

	public int getStudId() {
		return studId;
	}

	public void setStudId(int studId) {
		this.studId = studId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [studId=" + studId + ", name=" + name + ", address=" + address + "]";
	}

}
