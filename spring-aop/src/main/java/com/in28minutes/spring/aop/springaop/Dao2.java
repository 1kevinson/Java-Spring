package com.in28minutes.spring.aop.springaop;

import org.springframework.stereotype.Repository;

@Repository
public class Dao2 {

	public String retrieveSomething() {
		return "DAO2";
	}
}
