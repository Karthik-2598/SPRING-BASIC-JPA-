package com.learn.spring.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Course {

	@Id
	private int id;
	private String name;
	
	//one course -> many reviews
	@OneToMany(mappedBy = "course", fetch = FetchType.EAGER)
	List<Review> reviews = new ArrayList<Review>();
	
}
