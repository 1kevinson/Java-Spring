package com.in28minutes.spring.basics.springin10steps.properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:app.properties") // app.properties
public class SomeExternalService {

	@Value("${external.service.url}")
	private String url;

	public String returnServiceUrl() {
		return url;
	}
}
