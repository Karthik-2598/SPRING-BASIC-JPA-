package com.learn.spring.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.learn.spring.model.library;
import com.learn.spring.repository.librepo;

@Service
public class libservice {
	
	@Autowired
	librepo repository;
	
	public void addlibrary(library lib)
	{
		repository.save(lib);
		repository.flush();
	}
	public void addlibraries(List<library> lib)
	{
		repository.saveAll(lib);
		repository.flush();
	}
	
	public Optional<library>getbyname(String name)
	{
		library samplelib= library.builder().name(name).build();
		
		ExampleMatcher em=ExampleMatcher.matching().withMatcher(name,ExampleMatcher.GenericPropertyMatchers.exact()).withIgnorePaths("id","bookname");
		
		Example<library>example=Example.of(samplelib, em);
		
		return repository.findOne(example);
		
	}
	public List<library> getall()
	{
		return repository.findAll();
	}
	public void delete(library lib)
	{
		repository.delete(lib);
	}
	public void deleteall()
	{
		repository.deleteAll();
	}
	public long count()
	{
		return repository.count();
	}
	public List<library>sorted(String colname)
	{
		return repository.findAll(Sort.by(Direction.DESC,colname));
	}
}
