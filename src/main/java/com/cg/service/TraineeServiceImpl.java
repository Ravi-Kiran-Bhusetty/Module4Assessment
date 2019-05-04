package com.cg.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cg.dao.TraineeDao;
import com.cg.model.Trainee;

@Service
@Transactional
@Component("traineeServiceImpl")
public class TraineeServiceImpl implements TraineeService {

	@Autowired
	TraineeDao traineeDaoImpl;
	
	@Override
	public void addTrainee(Trainee trainee) {
		traineeDaoImpl.addTrainee(trainee);
	}

	@Override
	public void modifyTrainee(Trainee trainee) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteTrainee(int id) {
		traineeDaoImpl.deleteTrainee(id);
	}

	@Override
	public Trainee getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Trainee> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
