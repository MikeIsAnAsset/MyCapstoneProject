package com.claim.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Transient;

@Entity
public class Job implements Serializable {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int jobId;
	
	@Column
	private String typeOfRole;
	
	@Column
	private String jobLevel;
	
	@Column
	private String description;
	
	@Column
	private String employementType;
	
	@Transient
	private Skills skills;
	
	@Column
	private String requiredExperience;
	
	@Column
	private Long compensation;
	
	@Column
	private String compensationDescription;
	
	@Column
	private String equity;

	public int getJobId() {
		return jobId;
	}

	public void setJobId(int jobId) {
		this.jobId = jobId;
	}

	

	public String getTypeOfRole() {
		return typeOfRole;
	}

	public void setTypeOfRole(String typeOfRole) {
		this.typeOfRole = typeOfRole;
	}

	public String getJobLevel() {
		return jobLevel;
	}

	public void setJobLevel(String jobLevel) {
		this.jobLevel = jobLevel;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getEmployementType() {
		return employementType;
	}

	public void setEmployementType(String employementType) {
		this.employementType = employementType;
	}

	public Skills getSkills() {
		return skills;
	}

	public void setSkills(Skills skills) {
		this.skills = skills;
	}

	public String getRequiredExperience() {
		return requiredExperience;
	}

	public void setRequiredExperience(String requiredExperience) {
		this.requiredExperience = requiredExperience;
	}

	public Long getCompensation() {
		return compensation;
	}

	public void setCompensation(Long compensation) {
		this.compensation = compensation;
	}

	public String getCompensationDescription() {
		return compensationDescription;
	}

	public void setCompensationDescription(String compensationDescription) {
		this.compensationDescription = compensationDescription;
	}

	public String getEquity() {
		return equity;
	}

	public void setEquity(String equity) {
		this.equity = equity;
	}
	
	
	
}
