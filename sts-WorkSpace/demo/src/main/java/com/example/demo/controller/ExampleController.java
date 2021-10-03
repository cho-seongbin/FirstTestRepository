package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.service.ExampleService;

@Controller
public class ExampleController {

	@Autowired
	private ExampleService exampleService;
	
	@RequestMapping(value="/example",method = RequestMethod.GET)
	public String example(Model model) {
		model.addAttribute("data",exampleService.getExample());
		
		return "example";
	}
	
}
