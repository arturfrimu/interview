package com.arturfrimu.interview.service;

import com.arturfrimu.interview.entity.Question;
import com.arturfrimu.interview.repository.QuestionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AddQuestion implements AddQuestionUseCase {

    private final QuestionRepository questionRepository;

    @Override
    public void addQuestion(Question question) {
        questionRepository.save(question);
    }
}
