package com.learn.spring.model;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Document(value="book")
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Book {
	int id;
	String name;
	String Author;

}
