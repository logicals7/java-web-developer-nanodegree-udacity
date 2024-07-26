package com.krishan.quiz.quizService.repository;

import com.krishan.quiz.quizService.entity.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuizRepository extends JpaRepository<Quiz, Long> {
}
