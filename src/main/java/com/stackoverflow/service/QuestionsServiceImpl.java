package com.stackoverflow.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stackoverflow.repository.QuestionsRepository;

@Service
public class QuestionsServiceImpl {

	@Autowired
	private QuestionsRepository questionsRepository;

}
