package com.krishan.quiz.quizService.controller;

import com.krishan.quiz.quizService.entity.Quiz;
import com.krishan.quiz.quizService.service.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/quiz")
public class QuizController {
    private QuizService quizService;
    @Autowired
    public QuizController(QuizService quizService) {
        this.quizService = quizService;
    }

    @PostMapping
    public Quiz createQuiz(@RequestBody Quiz quiz){
        return quizService.addQuiz(quiz);
    }

    @GetMapping
    public List<Quiz> getAllQuizes(){
        return quizService.getAllQuizes();
    }

    @GetMapping("/{id}")
    public Quiz getQuiz(@PathVariable Long id){
        return quizService.getQuiz(id);
    }
}
