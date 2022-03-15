package com.training;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource("classpath:credentials.properties")
public class SpringPropertyFileReaderApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext=SpringApplication.run(SpringPropertyFileReaderApplication.class, args);
		PropertyFileController pfileController=applicationContext.getBean(PropertyFileController.class);
		System.out.println(pfileController.getpropertyFile());
	}

}
