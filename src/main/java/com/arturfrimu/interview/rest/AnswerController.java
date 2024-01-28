package com.arturfrimu.interview.rest;

import com.arturfrimu.interview.entity.Answer;
import com.arturfrimu.interview.service.RespondToQuestionUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;

@RestController
@RequestMapping("/questions")
@RequiredArgsConstructor
public class AnswerController {

    private final RespondToQuestionUseCase respondToQuestionUseCase;

    @PostMapping("/{questionId}")
    public ResponseEntity<Object> respondToQuestion(
            @PathVariable("questionId") long questionId,
            @RequestBody Answer answer) {
        respondToQuestionUseCase.respondToQuestion(questionId, answer);
        return ResponseEntity.created(URI.create("/questions")).build();
    }
}
