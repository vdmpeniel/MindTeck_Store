package com.mindteck.store.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mindteck.store.repositories.TrainingRepository;

import main.java.com.mindteck.store.model.product.Training;

@Service("trainingService")
public class TrainingService {
	@Autowired
	TrainingRepository trainingRepository;	

	// Get Training by id
	@Transactional
	public Training getTrainingById(Integer id){		
		Training training = trainingRepository.getTrainingById(id);
		return training;
	}		
		
	// Get all Trainings
	@Transactional
	public List<Training> getAllTrainings(){		
		List<Training> trainingList = trainingRepository.getAllTrainings();
		return trainingList;
	}
		
	// Add Training
	@Transactional
	public boolean add(Training training){
		trainingRepository.save(training);
		return true;
	}
	
	// Update Training
	@Transactional
	public boolean update(Training training) {	
		trainingRepository.update(training);
		return true;
	}
			
	// Delete Training
	@Transactional
	public boolean deleteById(Integer id) {  
		 trainingRepository.deleteById(id);
		 return true;
	}  
}