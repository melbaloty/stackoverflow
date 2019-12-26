package com.stackoverflow.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.stackoverflow.models.Answers;

public interface AnswersRepository extends JpaRepository<Answers, Long> {

}
