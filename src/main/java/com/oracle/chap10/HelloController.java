package com.oracle.chap10;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class HelloController {
//	@GetMapping("/hello")
//	public String print(Model model,
//			@RequestParam(value = "name", required = false) String name) {
//		model.addAttribute("greeting", "æ»≥Á«œººø‰ " + name);
//		return "hello";
//	}
	
	@GetMapping("/hello")
	public String print() {
		
		return "hello";
	}
}
