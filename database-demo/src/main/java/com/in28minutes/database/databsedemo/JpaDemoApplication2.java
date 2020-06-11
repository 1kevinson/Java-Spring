package com.in28minutes.database.databsedemo;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.in28minutes.database.databsedemo.entity.Person;
import com.in28minutes.database.databsedemo.jpa.PersonJpaRepository;

import net.bytebuddy.asm.Advice.This;

@SpringBootApplication
public class JpaDemoApplication2 implements CommandLineRunner {

	private Logger logger = LoggerFactory.getLogger(This.class);

	@Autowired
	PersonJpaRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(JpaDemoApplication2.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		logger.info("User id 10002 -> {}", repository.findById(10002));
		logger.info("Insert on user -> {}", repository.insert(new Person(10005, "Kevin", "Sydney", new Date())));
		logger.info("Update on user -> {}",
				repository.update(new Person(10002, "James", "Paris Sud Telecom", new Date())));

		repository.delete(10001);
	}

}
