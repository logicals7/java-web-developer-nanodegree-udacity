package com.krishan.question.questionService.repository;

import com.krishan.question.questionService.entity.Question;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface QuestionRepository extends JpaRepository<Question, Long> {
    //now i want to pass the quizId and i wanna get all the questions of that particular quiz
    //for that i will need the following custom function
    List<Question> findAllQuestionsByQuizId(Long quizId);
}
