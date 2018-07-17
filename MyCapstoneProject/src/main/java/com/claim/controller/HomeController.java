package com.claim.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.claim.repository.UserRepository;

@Controller
public class HomeController {

	@RequestMapping("/")
	public ModelAndView index()
	{
		return new ModelAndView("index");
	}
	
	@RequestMapping("/about")
	public ModelAndView about()
	{
		return new ModelAndView("about");
	}
	
	
	
	
}
