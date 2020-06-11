package com.in28minutes.database.databsedemo.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Person {

	@Id // Indicate it's primary key
	@GeneratedValue
	private int id;

	private String name;
	private String location;
	private Date birthDate;

	// Define the no argument constructor because we use "BeanPropertyRowMapper"
	public Person() {

	}

	// Define a constructor with no Id for Hibernate
	public Person(String name, String location, Date birthdate) {
		super();
		this.name = name;
		this.location = location;
		this.birthDate = birthdate;
	}

	// In java we can define multiple constructor
	public Person(int id, String name, String location, Date birthdate) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
		this.birthDate = birthdate;
	}

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

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Date getBirthdate() {
		return birthDate;
	}

	public void setBirthdate(Date birthdate) {
		this.birthDate = birthdate;
	}

	// Override this method to customize the sysout input
	@Override
	public String toString() {
		return "\n Person [id=" + id + ", name=" + name + ", location=" + location + ", birthdate=" + birthDate + "]";
	}

}
