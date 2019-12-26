package com.stackoverflow.models;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main {

	public static void main(String[] args) {

		User user1 = new User("mohamed", "mohamed@email.com", "mohamedpassword");
		User user2 = new User("mahmoud", "mahmoud@email.com", "mahmoudpassword");
		User user3 = new User("omer", "omer@email.com", "omerpassword");

		Cateogry cateogry1 = new Cateogry("java");
		Cateogry cateogry2 = new Cateogry("Spring Boot");
		Cateogry cateogry3 = new Cateogry("c++");

		Set<Cateogry> question1cateogries = new HashSet<>();
		question1cateogries.add(cateogry1);
		question1cateogries.add(cateogry2);
		question1cateogries.add(cateogry3);

		Questions question1 = new Questions("hi this is the question 1 from user mohamed", user1, question1cateogries);

		Answers answer1 = new Answers("this is first answer for first question", user1, question1);
		Answers answer2 = new Answers("this is first answer for second question", user1, question1);

		Set<Answers> answersSet = new HashSet<>();
		answersSet.add(answer1);
		answersSet.add(answer2);

		question1.setAnswers(answersSet);

		Iterator<Cateogry> it = question1.getCateogries().iterator();

		while (it.hasNext()) {
			System.out.println(it.next().getCateogryname());

		}

	}

}
