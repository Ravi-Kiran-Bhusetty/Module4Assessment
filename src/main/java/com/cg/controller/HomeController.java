package com.cg.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.model.Trainee;
import com.cg.service.TraineeService;

@RestController
public class HomeController {

	@Autowired
	TraineeService traineeServiceImpl;
	
	@GetMapping("/addTrainee")
	public ResponseEntity addTrainee(@RequestBody Trainee trainee) {
		traineeServiceImpl.addTrainee(trainee);
		return new ResponseEntity(HttpStatus.OK);
	}
	
	@PostMapping("/deleteTrainee")
	public ResponseEntity deleteTrainee(@PathVariable int id) {
		traineeServiceImpl.deleteTrainee(id);
		return new ResponseEntity(HttpStatus.OK);
	}
	
	
}
