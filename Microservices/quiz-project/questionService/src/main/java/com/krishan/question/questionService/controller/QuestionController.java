package com.krishan.question.questionService.controller;

import com.krishan.question.questionService.entity.Question;
import com.krishan.question.questionService.service.QuestionService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/question")
public class QuestionController {
    private QuestionService questionService;

    public QuestionController(QuestionService questionService) {
        this.questionService = questionService;
    }

    @PostMapping
    public Question addQues(@RequestBody Question question){
        return questionService.addQuestion(question);
    }

    @GetMapping
    public List<Question> getAllQues(){
        return questionService.getAllQuestions();
    }

    @GetMapping("/{questionId}")
    public Question getQues(@PathVariable Long questionId){
        return questionService.getQuestion(questionId);
    }

    @GetMapping("/quiz/{quizId}")
    public List<Question> findAllQuestionsByQuizId(@PathVariable Long quizId){
        return questionService.findAllQuestionsByQuizId(quizId);
    }

}
