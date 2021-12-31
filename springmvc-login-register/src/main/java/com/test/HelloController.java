package com.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
	@RequestMapping("/hello")
	public String hello() {
		return "greet";
	}
	@RequestMapping("/greet2")
	public String hello2() {
		return "index";
	}

}
