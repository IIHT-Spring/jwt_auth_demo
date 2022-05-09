package com.jwt.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Home {
	
	
	@RequestMapping("/welcome")
	public String welcome() {
		String text = "This is a private page ";
		text += "this page is not allowed to be seen by unauthorized user";
		
		return text;
	}

}
