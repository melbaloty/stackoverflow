package com.stackoverflow.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.stackoverflow.models.Questions;

public interface QuestionsRepository extends JpaRepository<Questions, Long> {

}
