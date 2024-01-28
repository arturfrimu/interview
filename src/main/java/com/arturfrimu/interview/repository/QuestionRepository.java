package com.arturfrimu.interview.repository;

import com.arturfrimu.interview.entity.Question;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionRepository extends JpaRepository<Question, Long> {
}
