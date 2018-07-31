package com.claim;

import java.util.TreeMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.claim.controller.SkillsController;
import com.claim.controller.UserController;
import com.claim.entity.Job;
import com.claim.entity.Skills;
import com.claim.entity.User;
import com.claim.repository.SkillsRepository;
import com.claim.service.SkillsService;

@SpringBootApplication
public class MyCapstoneProjectApplication {

	
	@Autowired
		private static SkillsService skillsService;
	
	
	
	public static void main(String[] args) {
		SpringApplication.run(MyCapstoneProjectApplication.class, args);
		
	}
	

		
	

		
	
}
