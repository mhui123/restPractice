package com.rest.myapp.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
	@GetMapping("/")
	public String getAddr() {
		return "/jsp/test";
	}
}
