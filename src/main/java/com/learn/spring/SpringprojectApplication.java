package com.learn.spring;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.learn.spring.model.Book;
import com.learn.spring.model.Course;
import com.learn.spring.model.Passport;
import com.learn.spring.model.Review;
import com.learn.spring.model.Student;
import com.learn.spring.model.library;
import com.learn.spring.repository.bookrepo;
import com.learn.spring.service.Studentservice;
import com.learn.spring.service.libservice;

@SpringBootApplication
public class SpringprojectApplication implements CommandLineRunner{
	@Autowired
	Studentservice studentservice;
	
	@Autowired
	EntityManager entitymanager;
	
	@Autowired
	libservice lbs;
	
	@Autowired
	bookrepo br;

	public static void main(String[] args) {
		SpringApplication.run(SpringprojectApplication.class, args);
		
		}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		/*List<Student> students=studentservice.getAllStudents();
		for(Student temp :students)
		{
			System.out.println("...................");
			System.out.println("id "+temp.getAge());
			System.out.println("name "+temp.getFname());
			System.out.println("lname"+temp.getLname());
		}*/
		/*
		 Passport passport = entityManager.find(Passport.class, 1); //retrive the passport of id : 1
		System.out.println("name / number of passport : " + passport.getName());
		System.out.println("student name of passport : " + passport.getStudent().getFirstName());
		
		System.out.println(" ****** Reverse One To One *****");
		Student student = entityManager.find(Student.class, 2);
		System.out.println("Student name : " + student.getFirstName());
		System.out.println("Student's passport : " + student.getPassport().getName());
		 */
		/*Review review = entitymanager.find(Review.class, 1);
		System.out.println("message : " + review.getMessage());
		System.out.println("course of this review : " + review.getCourse().getName());
		
		System.out.println(" ****** Reverse: one to many *****");
		Course course = entitymanager.find(Course.class, 1);
		System.out.println("Course name : " + course.getName());
		List<Review> reviews = course.getReviews();
		for(Review temp : reviews)
		{
			System.out.println(" -> " + temp.getMessage());
		}*/
		
//		Passport p=entitymanager.find(Passport.class, 1);
//		System.out.println("Passport number "+p.getPassnumber());
//		System.out.println("Student name "+p.getStudent().getFname());
//		
//		Student student=entitymanager.find(Student.class,1);
//		System.out.println("Student Name"+student.getFname());
//		System.out.println("Passnumber"+student.getPassport().getPassnumber());
		
//		library insertlib=library.builder().id(1).name("Maths").bookname("algebra,Geometry").build();
//		
//		lbs.addlibrary(insertlib);
//		
//		library l1=library.builder().id(2).bookname("botony,Zoology").name("Biology").build();
//		library l2=library.builder().id(3).bookname("physics,chemistry").name("Science").build();
//		library l3=library.builder().id(4).bookname("Marathi,Hindi").name("Language").build();
//		
//		List<library>libs=new ArrayList<library>();
//		
//		libs.add(l1);
//		libs.add(l2);
//		libs.add(l3);
//		
//		
//		lbs.addlibraries(libs);
		
//		lbs.delete(l1);
//		lbs.deleteall();
		
// 		Optional<library>mathslib=lbs.getbyname("vijay");
//		if(mathslib.isPresent())
//		{
//			library lib1=mathslib.get();
//			System.out.println("Book names"+lib1.getBookname());
//		}
//		else
//		{
//			System.out.println("No library found in datbase");
//		}
		
//		List<library>lib2=lbs.sorted("name");
//		
//		for(library lib:lib2)
//		{
//			System.out.println(lib.getName());
//		}
//		
//		long count =lbs.count();
//		System.out.println(count);
		Book mbook=Book.builder().id(1).Author("vijay").name("RRR").build();
		Book mbook1=Book.builder().id(2).Author("rohit").name("Pushpa").build();
		br.save(mbook);
		br.save(mbook1);
		
		List<Book>book=br.findAll();
		for(Book b:book)
		{
			System.out.println("Id of book "+b.getId());
			System.out.println("Name of book "+b.getName());
			System.out.println("Author of book "+b.getAuthor());
		}
		
		Book b1=Book.builder().id(1).Author("rakesh").name("NTR").build();
		br.save(b1);
		
		br.delete(b1);
		List<Book>book2=br.findAll();
		for(Book b:book2)
		{
			System.out.println("Id of book "+b.getId());
			System.out.println("Name of book "+b.getName());
			System.out.println("Author of book "+b.getAuthor());
		}
		
	}	

}
