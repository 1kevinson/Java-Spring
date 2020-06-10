package com.in28minutes.database.databsedemo.jdbc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.in28minutes.database.databsedemo.entity.Person;

@Repository
public class PersonJdbcDAO {

	@Autowired
	JdbcTemplate jdbcTemplate;

	// SELECT * FROM PERSON
	@SuppressWarnings("unchecked")
	public List<Person> findAll() {
		return jdbcTemplate.query("SELECT * FROM PERSON", new BeanPropertyRowMapper(Person.class));
	}

}
