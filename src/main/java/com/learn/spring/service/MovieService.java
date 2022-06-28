package com.learn.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learn.spring.model.Movie;
import com.learn.spring.repository.Movierepo;

@Service
public class MovieService {
	
	@Autowired
	Movierepo mvr;
	
	public List<Movie> getmovie()
	{
		return mvr.findAll();
	}
	
	public void deletemovie(Movie m)
	{
		mvr.delete(m);
	}
	
	public void addmovie(Movie m)
	{
		mvr.save(m);
	}

}
