package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Task {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long id;
	private String text;
	private Boolean completed;
	
	public Task(Long id, String text, boolean completed) {
		super();
		this.id = id;
		this.text = text;
		this.completed = completed;
	}
	public Task() {
		// TODO Auto-generated constructor stub
	}
		
	public Long getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Task [id=" + id + ", text=" + text + ", completed=" + completed + "]";
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public boolean isCompleted() {
		return completed;
	}

	public void setCompleted(boolean completed) {
		this.completed = completed;
	}

		

}
