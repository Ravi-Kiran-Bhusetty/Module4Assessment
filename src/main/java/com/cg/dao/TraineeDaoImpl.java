package com.cg.dao;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.cg.model.Trainee;

@ComponentScan("com")
@Repository
@Component("traineeDaoImpl")
public class TraineeDaoImpl implements TraineeDao {

	@PersistenceContext
	EntityManager entityManager;
	
	@Override
	public void addTrainee(Trainee trainee) {
		entityManager.persist(trainee);
	}

	@Override
	public void modifyTrainee(Trainee trainee) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteTrainee(int id) {
		Trainee trainee = entityManager.find(Trainee.class, id);
		entityManager.remove(trainee);
	}

	@Override
	public Trainee getById(int id) {
		
		return null;
	}

	@Override
	public ArrayList<Trainee> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
