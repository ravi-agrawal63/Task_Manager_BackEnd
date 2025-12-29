package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Task;
import com.example.demo.service.TaskService;

@RestController
@RequestMapping("/tasks")
@CrossOrigin(origins = "http://localhost:3000")
public class MainController {
	
	@Autowired 
	TaskService taskService;
	
	
	//check
	@GetMapping("/check")
	public String Check() {
		return "server is running";
	}
	@GetMapping
	public List<Task> getTasks(){
		return taskService.getAllTask();
	}
//	
	//post a task
	@PostMapping
	public Task addTask(@RequestBody Task task) {
		return taskService.addTask(task);
		
		
	}
	
	//Delete a task
	@DeleteMapping("/{id}")
	public void deleteTask(@PathVariable Long id) {
		taskService.deleteTask(id);
	}
	
	
	
	//update the task,completed toggle
	@PutMapping("/{id}")
	public Task updateTask(
	        @PathVariable Long id,
	        @RequestBody Task incoming) {

	    Task existing = taskService.findById(id);

	    // update text only if sent
	    if (incoming.getText() != null) {
	        existing.setText(incoming.getText());
	    }

	    // update completed flag
	    existing.setCompleted(incoming.isCompleted());

	    return taskService.addTask(existing);
	}

}
