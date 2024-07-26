package com.krishan.quiz.quizService.service;

import com.krishan.quiz.quizService.entity.Question;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

//this particular line is used when we dont use load balancer but a particular instance of our Quiz service
//@FeignClient(url = "http://localhost:8082", value = "Question-Client")

//we can user load balancer in case one instance of Question Service is down.
//all we need to give the unique name for the @FeignClient from the Eureka Server.
//now it will automatically redirect the req to the instance which is up.
@FeignClient(name = "QUESTION-SERVICE")
public interface QuestionClient {
    @GetMapping("/question/quiz/{quizId}")
    List<Question> getAllQuestionOfQuiz(@PathVariable Long quizId);
}
