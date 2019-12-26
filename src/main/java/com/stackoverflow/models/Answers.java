package com.stackoverflow.models;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "answers")

public class Answers {

	private long id;
	private LocalDateTime questionDate;
	private String answerText;
	private int answervotenumber = 0;
	private Questions question;
	private User user;

	public Answers() {

	}

	public Answers(String answerText, User user, Questions question) {

		this.answerText = answerText;
		this.question = question;
		this.user = user;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public LocalDateTime getQuestionDate() {
		return questionDate;
	}

	public void setQuestionDate(LocalDateTime questionDate) {
		this.questionDate = questionDate;
	}

	public String getAnswerText() {
		return answerText;
	}

	public void setAnswerText(String answerText) {
		this.answerText = answerText;
	}

	public int voteupanswer() {

		return answervotenumber++;

	}

	public int voteDownanswer() {

		return answervotenumber--;

	}

	@ManyToOne
	@JoinColumn(name = "GetQuestionsForAnswers")
	public Questions getQuestion() {
		return question;
	}

	public void setQuestion(Questions question) {
		this.question = question;
	}

	@ManyToOne
	@JoinColumn(name = "GetUserWhoMakeAnswers")
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	///////////////////////////////////////////////////////////////////

}
