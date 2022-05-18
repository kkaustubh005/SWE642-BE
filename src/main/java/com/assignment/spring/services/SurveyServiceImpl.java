/* Aastha Neupane
Achint Jain
Kaustubh Karanjkar
Niyanta Lad */

package com.assignment.spring.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.assignment.spring.models.SurveyClass;
import com.assignment.spring.repositories.SurveyRepository;

@Service
public class SurveyServiceImpl {
	
	//DI for repository class object
	@Autowired
	private SurveyRepository srvyRepo;
	
	/*private List<Survey> survey = new ArrayList<Survey>(Arrays.asList(new Survey("Achint","Jain","ok","ok","ok","ok","ok","ok",new Date(),"ok","ok","ok","ok"),
			new Survey("Mister","Jain","ok","ok","ok","ok","ok","ok",new Date(),"ok","ok","ok","ok"),
			new Survey("Achint","J","ok","ok","ok","ok","ok","ok",new Date(),"ok","ok","ok","ok")));*/
	
	//service method to get all the surveys
	public List<SurveyClass> getAllSurveys(){
		
		List<SurveyClass> surv = new ArrayList<>();
		 	srvyRepo.findAll().forEach(surv::add);
		 	
		 	return surv;
	}
	
	//service method to get single survey based on the id
	public Optional<SurveyClass> getSurvey(String id) {
		return srvyRepo.findById(id);
		
	}

	//to add the new survey
	public void addSurvey(SurveyClass survey2) {
		//survey.add(survey2); 
		srvyRepo.save(survey2);
		
	}

}
