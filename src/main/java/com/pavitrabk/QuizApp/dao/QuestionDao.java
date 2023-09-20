package com.pavitrabk.QuizApp.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.pavitrabk.QuizApp.model.Question;

@Repository
public interface QuestionDao extends JpaRepository<Question,Integer>{

	List<Question> findAll();
	List<Question> findByCategory(String category);
	
	@Query(nativeQuery = true, value = "SELECT * FROM question q Where q.category=:category ORDER BY RAND() LIMIT :numQ")
	List<Question> findRandomQuestionsByCategory(String category, int numQ);

	
	
}
