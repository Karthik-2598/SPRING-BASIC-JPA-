package com.learn.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learn.spring.model.Student;
public interface studentrepository extends JpaRepository<Student,Long>{

}
