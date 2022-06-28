package com.learn.spring.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
	@Id
	private int empid;
	private String empname;
	
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name="emp_skill",joinColumns= {@JoinColumn(name="emp_id")},inverseJoinColumns= {@JoinColumn(name="skill_id")})
	List<Skill>skills=new ArrayList<Skill>();
}
