package com.arturfrimu.interview.repository;

import com.arturfrimu.interview.entity.Answer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnswerRepository extends JpaRepository<Answer, Long> {
}
