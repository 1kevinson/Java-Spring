package com.in28minutes.database.databsedemo.jdbc;

import java.sql.Timestamp;
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

	// In Spring JDBC with write the query first then we map the values...

	public List<Person> findAll() {
		return jdbcTemplate.query("SELECT * FROM PERSON", new BeanPropertyRowMapper<Person>(Person.class));
	}

	public Person findById(int id) {
		return jdbcTemplate.queryForObject("SELECT * FROM person WHERE id=?", new Object[] { id },
				new BeanPropertyRowMapper<Person>(Person.class));
	}

	public int deleteById(int id) {
		return jdbcTemplate.update("DELETE FROM person WHERE id=?", new Object[] { id });
	}

	public int insert(Person person) {
		return jdbcTemplate.update("INSERT INTO PERSON (ID, NAME, LOCATION, BIRTH_DATE ) \n" + "VALUES(?,  ?, ?,?);",
				new Object[] { person.getId(), person.getName(), person.getLocation(),
						new Timestamp(person.getBirthdate().getTime()) });
	}

	// Order is important to match query parameter with object parameter
	public int update(Person person) {
		return jdbcTemplate.update("UPDATE PERSON SET NAME = ?, LOCATION = ?, BIRTH_DATE = ? " + "WHERE ID = ?",
				new Object[] { person.getName(), person.getLocation(), new Timestamp(person.getBirthdate().getTime()),
						person.getId() });
	}

}
