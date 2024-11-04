package com.example.react_desktop_demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	@GetMapping // Adjust this to handle specific paths
	public String redirect() {
		return "index";
	}
}
