package com.learn.spring.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Passport {
	@Id
	private int passid;
	private String passnumber;
	
//	@OneToOne
//	private Student student;
}
