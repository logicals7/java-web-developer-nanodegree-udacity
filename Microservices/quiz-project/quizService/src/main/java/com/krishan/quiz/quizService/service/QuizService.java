package com.krishan.quiz.quizService.service;

import com.krishan.quiz.quizService.entity.Quiz;

import java.util.List;

public interface QuizService {
    Quiz addQuiz(Quiz quiz);
    List<Quiz> getAllQuizes();
    Quiz getQuiz(Long id);

}
