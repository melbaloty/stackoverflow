package com.stackoverflow.service;

import com.stackoverflow.models.Questions;

public interface QuestionsService {

	public Questions addQuestion(Questions question, String username);

	public Questions editQuestion(Questions question, String username);

	public void deleteQuestion(Questions question);

	public void deleteQuestionById(long questionId);

}
