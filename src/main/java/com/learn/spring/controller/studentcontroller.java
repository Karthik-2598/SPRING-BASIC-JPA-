package com.learn.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.learn.spring.model.Student;
import com.learn.spring.service.Studentservice;

@Controller
public class studentcontroller {
	
	@Autowired
	Studentservice studser;
	@GetMapping("/getmapping")
	@ResponseBody
	public Student getStudent()
	{
		return Student.builder().age(29).fname("ishwar").build();
	}
	
	@GetMapping("/")
	public String listofstudent(ModelMap map)
	{
		
		List<Student> students=studser.getAllStudents();
		map.addAttribute("message",students);
		return "list";
	}
	
	@GetMapping("/delete")
	public String deletestudent(@RequestParam int id,ModelMap map)
	{
		studser.deletestudent(Student.builder().id(id).build());
		
		List<Student>student=studser.getAllStudents();
		map.addAttribute("message",student);
		return "list";
	}
	@GetMapping("/addstudent")
	public String addstudent(@RequestParam int id,@RequestParam String Fname,@RequestParam String Lname,@RequestParam String Gender,@RequestParam int age,ModelMap map)
	{
		studser.addstudent(Student.builder().id(id).age(age).fname(Fname).lname(Lname).gender(Gender).build());
		List<Student>student=studser.getAllStudents();
		map.addAttribute("message",student);
		return "list";
		
	}
}
