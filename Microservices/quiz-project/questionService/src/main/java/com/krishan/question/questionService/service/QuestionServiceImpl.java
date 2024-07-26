package com.krishan.question.questionService.service;

import com.krishan.question.questionService.entity.Question;
import com.krishan.question.questionService.repository.QuestionRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionServiceImpl implements QuestionService{
    private QuestionRepository questionRepository;

    public QuestionServiceImpl(QuestionRepository questionRepository) {
        this.questionRepository = questionRepository;
    }

    @Override
    public Question addQuestion(Question question) {
        return questionRepository.save(question);
    }

    @Override
    public List<Question> getAllQuestions() {
        return questionRepository.findAll();
    }

    @Override
    public Question getQuestion(Long questionId) {
        return questionRepository.findById(questionId).orElseThrow(() -> new RuntimeException("question id not found."));
    }

    @Override
    public List<Question> findAllQuestionsByQuizId(Long quizId) {
        return questionRepository.findAllQuestionsByQuizId(quizId);
    }
}
