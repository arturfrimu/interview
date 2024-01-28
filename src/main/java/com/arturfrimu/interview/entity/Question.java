package com.arturfrimu.interview.entity;

import jakarta.persistence.*;
import lombok.*;

import static jakarta.persistence.GenerationType.IDENTITY;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "question")
public class Question {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    private String text;

    @OneToOne
    @JoinColumn(name = "answer_id", referencedColumnName = "id")
    private Answer answer;

    public void addAnswer(Answer answer) {
        assert this.answer == null;
        this.answer = answer;
    }
}
