package com.arturfrimu.interview.service;

import com.arturfrimu.interview.entity.Answer;
import com.arturfrimu.interview.entity.Question;
import com.arturfrimu.interview.repository.AnswerRepository;
import com.arturfrimu.interview.repository.QuestionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RespondToQuestion implements RespondToQuestionUseCase {

    private final QuestionRepository questionRepository;
    private final AnswerRepository answerRepository;

    @Override
    public void respondToQuestion(Long questionId, Answer answer) {
        Answer savedAnswer = answerRepository.save(answer);

        Question question = questionRepository.findById(questionId)
                .orElseThrow(() -> new IllegalArgumentException("Question not found with id: %d".formatted(questionId)));

        question.addAnswer(savedAnswer);

        questionRepository.save(question);
    }
}
