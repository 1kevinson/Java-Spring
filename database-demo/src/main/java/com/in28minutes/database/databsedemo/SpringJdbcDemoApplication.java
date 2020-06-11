package com.in28minutes.database.databsedemo;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.in28minutes.database.databsedemo.entity.Person;
import com.in28minutes.database.databsedemo.jdbc.PersonJdbcDAO;

import net.bytebuddy.asm.Advice.This;

@SpringBootApplication
public class SpringJdbcDemoApplication implements CommandLineRunner {

	private Logger logger = LoggerFactory.getLogger(This.class);

	@Autowired
	PersonJdbcDAO dao;

	public static void main(String[] args) {
		SpringApplication.run(SpringJdbcDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		logger.info("All the users -> {}", dao.findAll());
		logger.info("User id 10004 -> {}", dao.findById(10004));
		logger.info("Delete id -> {}", dao.deleteById(10004));
		logger.info("Inserting id -> {}", dao.insert(new Person(10006, "Marc", "Atlanta", new Date())));
		logger.info("Updating with id -> {}", dao.update(new Person(10006, "Marc Jacob", "Atlanta", new Date())));
	}

}
