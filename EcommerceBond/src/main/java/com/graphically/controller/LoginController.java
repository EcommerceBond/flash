package com.graphically.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/Login")
public class LoginController {
	
	@RequestMapping(value = "/LoginPage")
	public String getLoginPage() {
		System.out.println("Hi Kishan");
		return "loginpage";
	}

}
