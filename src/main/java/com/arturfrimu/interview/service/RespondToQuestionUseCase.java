package com.arturfrimu.interview.service;

import com.arturfrimu.interview.entity.Answer;

public interface RespondToQuestionUseCase {

    void respondToQuestion(Long questionId, Answer answer);
}
