package com.learn.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learn.spring.model.Student;
import com.learn.spring.repository.*;
@Service
public class Studentservice {
	@Autowired
	studentrepository repository;
	
	public List<Student>getAllStudents()
	{
		return repository.findAll();
	}
	
	public void deletestudent(Student s)
	{
		repository.delete(s);
	}

	public void addstudent(Student s) {
		// TODO Auto-generated method stub
		repository.save(s);
	}
}
