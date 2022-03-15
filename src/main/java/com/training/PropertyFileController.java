package com.training;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyFileController {

	@Autowired
	private PropertyFileService pfileService;
	
	public String getpropertyFile() {
		return pfileService.getProperties();
	}
}
