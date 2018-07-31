package com.claim.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.TreeSet;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Transient;

@Entity
public class Job implements Serializable {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int jobId;
	
	@Column(name="Company_profile")
	private CompanyProfile companyProfile;

	@Column
	private String typeOfRole;
	
	@Column
	private String jobLevel;
	
	@Column
	private String description;
	
	@Column
	private String employmentType;
	
	@Column
	private Skills skills;
	
	@Column
	private String requiredExperience;
	
	@Column
	private Long compensation;
	
	@Column
	private String compensationDescription;
	
	@Column
	private String equity;
	
	private static ArrayList<Job> jobs = new ArrayList<>();

	public Job(Skills skills) {
		super();
		this.skills = skills;
	}

	
	
	public Job(String typeOfRole, String jobLevel, String description, String employmentType, Skills skills,
			String requiredExperience, Long compensation, String compensationDescription, String equity) {
		super();
		this.typeOfRole = typeOfRole;
		this.jobLevel = jobLevel;
		this.description = description;
		this.employmentType = employmentType;
		this.skills = skills;
		this.requiredExperience = requiredExperience;
		this.compensation = compensation;
		this.compensationDescription = compensationDescription;
		this.equity = equity;
	}



	public static void addToJobs(Job job) {
		jobs.add(job);
	}
	
	public int getJobId() {
		return jobId;
	}

	public void setJobId(int jobId) {
		this.jobId = jobId;
	}

	@ManyToOne
	@JoinColumn(name="Company_profile_id")
	public CompanyProfile getCompanyProfile() {
		return companyProfile;
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
		return employmentType;
	}

	public void setEmployementType(String employementType) {
		this.employmentType = employementType;
	}

	
	
	
	
	
	
	
	
	@OneToOne(mappedBy = "Skills", fetch=FetchType.LAZY, cascade=CascadeType.ALL)
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
	
	public static ArrayList<Job> getJobs() {
		return jobs;
	}

}
