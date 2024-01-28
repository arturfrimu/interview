package com.arturfrimu.interview.service;

import com.arturfrimu.interview.entity.Question;
import com.arturfrimu.interview.repository.QuestionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ListQuestion implements ListQuestionUseCase {

    private final QuestionRepository questionRepository;

    @Override
    public List<Question> list() {
        return questionRepository.findAll();
    }
}
