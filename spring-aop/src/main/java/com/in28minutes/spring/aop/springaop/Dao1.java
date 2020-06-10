package com.in28minutes.spring.aop.springaop;

import org.springframework.stereotype.Repository;

@Repository
public class Dao1 {

	public String retrieveSomething() {
		return "DAO1";
	}
}
