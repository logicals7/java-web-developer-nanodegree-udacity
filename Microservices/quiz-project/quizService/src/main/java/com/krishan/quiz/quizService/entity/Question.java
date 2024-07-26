package com.krishan.quiz.quizService.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//we dont need to add this in our database
//we just want to call the questionMicroservice from quizMicroservice
//so remove the database annotations - entity and id
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Question {
    private Long questionId;
    private String question;
    private Long quizId;
}
