package com.claim.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;


import com.claim.service.UserService;
import com.claim.entity.User;

@CrossOrigin
@RestController
public class UserController {

	@Autowired
	UserService userService;
//	
//	@RequestMapping("/")
//	public ModelAndView index()
//	{
//		return new ModelAndView("index");
//	}
//	
//	@RequestMapping("/login")
//	public ModelAndView login() {
//		return new ModelAndView("login");
//	}
//	
//	@RequestMapping("/signUp")
//	public ModelAndView register()
//	{
//		return new ModelAndView("signUp", "user", new User());
//	
//	}
	
	
	public void addTestUser() {
		User testUser = new User("Mano", "ManualTest");
	}
	
	@RequestMapping(value="/join", 
			consumes=MediaType.APPLICATION_JSON_VALUE,
			produces=MediaType.APPLICATION_JSON_VALUE,
			method=RequestMethod.POST)
	public ResponseEntity<User> join(@RequestBody User user){
		System.out.println(user);
		userService.saveUser(user);
		
		User userReturned = userService.loginUser(user.getEmail(), user.getPassword());
		System.out.println("user returned: "+userReturned);
		return new ResponseEntity<>(userReturned, HttpStatus.OK);
	
	}
	
}
