package com.stackoverflow.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stackoverflow.repository.AnswersRepository;

@Service
public class AnswersServiceImpl {

	@Autowired
	private AnswersRepository answersRepository;

}
