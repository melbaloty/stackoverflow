package com.stackoverflow.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.stackoverflow.models.Questions;
import com.stackoverflow.service.QuestionsService;

@RestController
@RequestMapping(value = "/Questions")
public class QuestionsController {

	@Autowired
	private QuestionsService questionsService;

	/*
	 * in case of add he will add to cache ,so hw will not hit the database and not
	 * return the actual data in database , it just add what u entered and link the
	 * id with cateogry , he will not update the cateogry name , just relate the
	 * question with cateogry name
	 */
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public Questions addQuestion(@RequestBody Questions question, @RequestHeader("username") String username) {

		return questionsService.addQuestion(question, username);
	}

	// here when we edit he will return by the data which in the database
	@RequestMapping(value = "/edit", method = RequestMethod.POST)
	public Questions editQuestion(@RequestBody Questions question, @RequestHeader("username") String username) {

		return questionsService.editQuestion(question, username);
	}

	@RequestMapping(value = "/delete", method = RequestMethod.POST)
	public void deleteQuestion(@RequestBody Questions question) {

		questionsService.deleteQuestion(question);
	}

	@RequestMapping(value = "/deleteById", method = RequestMethod.DELETE)
	public void deleteQuestionById(@RequestParam("id") long id) {

		questionsService.deleteQuestionById(id);
	}

}
