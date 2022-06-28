package com.learn.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.learn.spring.model.Movie;
import com.learn.spring.model.Student;
import com.learn.spring.service.MovieService;

@Controller
public class Moviecontroller {
	
	@Autowired
	MovieService ms;
	
	@GetMapping("/addmovie")
	public String addmovie(@RequestParam int id,@RequestParam String Mname,@RequestParam String Heros,@RequestParam String Director,ModelMap map)
	{
		ms.addmovie(Movie.builder().Director(Director).id(id).Heros(Heros).movie(Mname).build());
		List<Movie>movies=ms.getmovie();
		map.addAttribute("message1",movies);
		return "list";
	}

	@GetMapping("/deletemovie")
	public String deletemovie(@RequestParam int id,ModelMap map)
	{
		ms.deletemovie(Movie.builder().id(id).build());
		List<Movie>movies=ms.getmovie();
		map.addAttribute("message1",movies);
		return "list";
	}
}
