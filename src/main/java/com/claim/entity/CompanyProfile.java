package com.claim.entity;

import java.io.Serializable;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
//@Table(name="company_profile")
public class CompanyProfile implements Serializable{

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int companyId;
	
	private String companyName;
	
	private TreeSet<User> users;

	private TreeSet<Job> jobs;
	
	@Column
	private String industry;
	
	public int getCompanyId() {
		return companyId;
	}

	public void setCompanyId(int companyId) {
		this.companyId = companyId;
	}

	@OneToMany(mappedBy = "CompanyProfile", cascade = CascadeType.ALL)
	public TreeSet<User> getUsers() {
		return users;
	}
	
	public void setUsers(TreeSet<User> users) {
		this.users = users;
	}
	
	@OneToMany(mappedBy = "CompanyProfile", cascade = CascadeType.ALL)
	public TreeSet<Job> getJobs() {
		return jobs;
	}
	
	public void setJobs(TreeSet<Job> jobs) {
		this.jobs=jobs;
	}


	public String getIndustry() {
		return industry;
	}

	public void setIndustry(String industry) {
		this.industry = industry;
	}
}
