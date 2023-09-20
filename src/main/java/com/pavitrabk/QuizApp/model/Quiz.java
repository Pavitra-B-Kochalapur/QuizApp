package com.pavitrabk.QuizApp.model;

import java.util.List;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Quiz {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Integer id;
	private String title;
	
	@ManyToMany
	private List<Question> questions;

}
