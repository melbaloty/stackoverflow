package com.stackoverflow.service;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stackoverflow.models.Questions;
import com.stackoverflow.models.User;
import com.stackoverflow.repository.QuestionsRepository;

@Service
public class QuestionsServiceImpl implements QuestionsService {

	@Autowired
	private QuestionsRepository questionsRepository;
	@Autowired // dependency injection
	private UserService userService;

	@Override
	public Questions addQuestion(Questions question, String username)

	{
		User retUser = userService.findUserByUsername(username);
		question.setQuestionDate(LocalDateTime.now());
		question.setUser(retUser);
		return questionsRepository.save(question);
	}

	@Override
	public Questions editQuestion(Questions question, String username) {

		return questionsRepository.save(question);
	}

	@Override
	public void deleteQuestion(Questions question) {
		questionsRepository.delete(question);

	}

	@Override
	public void deleteQuestionById(long questionId) {
		questionsRepository.deleteById(questionId);

	}

}
