package com.learn.spring.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
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
public class Skill {
	@Id
	private int skid;
	private String skname;
	
	@ManyToMany
	@JoinTable(name="emp_skill",joinColumns= {@JoinColumn(name="emp_id")},inverseJoinColumns= {@JoinColumn(name="skill_id")})
	List<Employee> employees = new ArrayList<Employee>();
}
