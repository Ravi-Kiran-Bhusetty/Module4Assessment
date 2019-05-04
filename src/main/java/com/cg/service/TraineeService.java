package com.cg.service;

import java.util.ArrayList;

import com.cg.model.Trainee;

public interface TraineeService {

	public void addTrainee(Trainee trainee);
	public void modifyTrainee(Trainee trainee);
	public void deleteTrainee(int id);
	public Trainee getById(int id);
	public ArrayList<Trainee> getAll();
}
