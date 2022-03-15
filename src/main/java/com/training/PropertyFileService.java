package com.training;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service

public class PropertyFileService {
	@Value("${env}")
	private String env;
	@Value("${env.username}")
	private String username;
	@Value("${env.password}")
	private String password;
	
	
	public String getProperties() {
		return "env :"+env+", username: "+username+", password :"+password;
	}
}
