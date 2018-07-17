package com.claim.entity;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Skills implements Serializable{

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int skillsId;
	
}
