package com.arturfrimu.interview.rest;

import com.arturfrimu.interview.entity.Question;
import com.arturfrimu.interview.service.AddQuestionUseCase;
import com.arturfrimu.interview.service.ListQuestionUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/questions")
@RequiredArgsConstructor
public class QuestionController {

    private final AddQuestionUseCase addQuestionUseCase;
    private final ListQuestionUseCase listQuestionUseCase;

    @PostMapping
    public ResponseEntity<Object> addQuestion(@RequestBody Question question) {
        addQuestionUseCase.addQuestion(question);
        return ResponseEntity.created(URI.create("/questions")).build();
    }

    @GetMapping
    public ResponseEntity<List<Question>> fetchQuestions() {
        return ResponseEntity.ok(listQuestionUseCase.list());
    }
}
