package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Task;
import com.example.demo.repository.Repo;

@Service
public class TaskService {
	
	@Autowired
	Repo repo;
	
	public List<Task> getAllTask(){
		return repo.findAll();
	}
	
	public void deleteTask(Long id) {
		repo.deleteById(id);
	}
	
	//update the task
	public Task addTask(Task task) {
		return repo.save(task);// TODO Auto-generated method stub
		
	}
	public Task findById(Long id) {
		return repo.getById(id);
	}
	

}
