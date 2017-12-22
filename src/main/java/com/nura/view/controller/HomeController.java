package com.nura.view.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {

	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String homePage() {
		System.out.println("Inside home page");
		return "homePage";
	}
	
	@RequestMapping(value = "/secured/profile", method = RequestMethod.GET)
	public String profilePage() {
		System.out.println("Inside profile page");
		return "secure/profile";
	}
}
