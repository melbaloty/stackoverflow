package com.stackoverflow.models;

import java.time.LocalDateTime;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "questions")

public class Questions {

	private long id;
	private LocalDateTime questionDate;
	private String questionText;
	private int questionvotenumber = 0;
	private Set<Answers> answers;

	private User user;
	private Set<Cateogry> cateogries;

	public Questions() {

	}

	public Questions(String questionText, User user, Set<Cateogry> cateogries) {

		this.questionText = questionText;
		this.user = user;
		this.cateogries = cateogries;
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

	public String getQuestionText() {
		return questionText;
	}

	public void setQuestionText(String questionText) {
		this.questionText = questionText;
	}

	public int voteupQuestion() {

		return questionvotenumber++;

	}

	public int voteDownQuestion() {

		return questionvotenumber--;

	}

	public int getQuestionvotenumber() {
		return questionvotenumber;
	}

	public void setQuestionvotenumber(int questionvotenumber) {
		this.questionvotenumber = questionvotenumber;
	}

	@OneToMany(cascade = CascadeType.REMOVE, fetch = FetchType.LAZY, mappedBy = "question")
	public Set<Answers> getAnswers() {
		return answers;
	}

	public void setAnswers(Set<Answers> answers) {
		this.answers = answers;
	}

	@ManyToOne
	@JoinColumn(name = "GetUserWhoMakeQuestions")
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@ManyToMany
	@JoinTable(name = "Questions_cateogry_Table", joinColumns = @JoinColumn(name = "quesion_id"), inverseJoinColumns = @JoinColumn(name = "cateogry_id"))

	public Set<Cateogry> getCateogries() {
		return cateogries;
	}

	public void setCateogries(Set<Cateogry> cateogries) {
		this.cateogries = cateogries;
	}

	////////////////////////////////////////////////////////////////////////////////////

	public void addanswer(Answers answer) {

		answers.add(answer);
	}

	public void removeanswer(Answers answer) {

		answers.remove(answer);
	}

}
