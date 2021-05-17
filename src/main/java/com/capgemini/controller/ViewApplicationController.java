package com.capgemini.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class ViewApplicationController {
	@GetMapping("/")
	public String create() {
		// logic for create
		return "Welocme to this website!!";
	}

}
