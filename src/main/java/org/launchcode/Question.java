package org.launchcode;

public abstract class Question {
	public String question;

	public Question(String question) {
		this.question = question;
	}

	public String getQuestion() {
		return question;
	}
}
