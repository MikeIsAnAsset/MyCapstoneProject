package com.claim.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.claim.entity.Job;
import com.claim.service.JobService;



@CrossOrigin
@RestController
public class JobController {

	@Autowired
	JobService jobService;
	
	@RequestMapping(value="/addJob",
			consumes=MediaType.APPLICATION_JSON_VALUE,
			produces=MediaType.APPLICATION_JSON_VALUE,
			method=RequestMethod.GET)
	public ResponseEntity<Job> addJob(@RequestBody Job job){
		
		
		
		
		
		
		
		jobService.saveJob(job);
		return null;
	}
	
}
