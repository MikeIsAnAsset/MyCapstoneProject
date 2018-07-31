package com.claim.service;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.TreeMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.claim.entity.Job;
import com.claim.entity.Skills;
import com.claim.repository.SkillsRepository;

@Service
public class SkillsService {

	@Autowired
	private SkillsRepository skillsRepository;
	
	public void saveSkills(Skills skills) {
		skillsRepository.save(skills);
	}

	public void createSomeSkills() {
		Skills skillset1 = new Skills();
		skillset1.setDotNet(true);
		skillset1.setA_B_Testing(true);
		skillsRepository.save(skillset1);
			
	}
	
	
	
	
	
	
	// Find all skills
	public ResponseEntity<ArrayList<Skills>> fetchAllSkills() {
//		ResponseEntity<ArrayList<String>> allSkillNames;
		
		
//		ArrayList<Skills> allSkills = (ArrayList<Skills>) skillsRepository.findAll();
//			for (Skills skill : allSkills) {
//				for (Field field : skill.getClass().getDeclaredFields()) {
//		            
//					
//					allSkillNames = ((ResponseEntity<ArrayList<String>>) allSkillNames).add(field.getName());
//					
//					
//					Log.i("Field", field.getName() + ":" + field.get(obj));
//
//		        }
//			}
		
		
		
		ResponseEntity<ArrayList<Skills>> allSkills = (ResponseEntity<ArrayList<Skills>>) skillsRepository.findAll();
		return allSkills;
	}
	
	
	
	
	
	// Loop through all jobs and return jobs sorted by number of skills that match each job
	public TreeMap<Integer, Integer> findAllJobsWithMatchingSkills(Skills skillsToMatch) {

		HashMap<Integer, Integer> mapCountOfMatchingJobSkills = new HashMap<>();
				
		for (Job job : Job.getJobs()) {
			int count = Skills.countMatchingSkillsInTwoObjects(skillsToMatch, job);
			if (count > 0) {
				mapCountOfMatchingJobSkills.put(job.getJobId(), count);
			}
		}
		
		Comparator<Integer> comparator2 = new ValueComparator<Integer, Integer>(mapCountOfMatchingJobSkills);
		TreeMap<Integer, Integer> result = new TreeMap<Integer, Integer>(comparator2);
		result.putAll(mapCountOfMatchingJobSkills);
		
		return result;
	}
	
	// a comparator using generic type
	class ValueComparator<K, V extends Comparable<V>> implements Comparator<K>{
	 
		HashMap<K, V> map = new HashMap<K, V>();
	 
		public ValueComparator(HashMap<K, V> map){
			this.map.putAll(map);
		}
	 
		@Override
		public int compare(K s1, K s2) {
			return -map.get(s1).compareTo(map.get(s2));//descending order	
		}
	}
}
