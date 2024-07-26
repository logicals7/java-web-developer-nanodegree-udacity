package com.krishan.question.questionService.service;

import com.krishan.question.questionService.entity.Question;

import java.util.List;

public interface QuestionService {
    Question addQuestion(Question question);
    List<Question> getAllQuestions();
    Question getQuestion(Long questionId);

    List<Question> findAllQuestionsByQuizId(Long quizId);
}
