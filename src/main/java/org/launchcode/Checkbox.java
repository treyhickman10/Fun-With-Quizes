package org.launchcode;

public class Checkbox extends Question{
	private String answers;

	public Checkbox(String question, String answers) {
		super(question);
		this.answers = answers;
	}
}
