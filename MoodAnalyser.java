package com.bridgelabz.exception;

public class MoodAnalyser {
	private String message;

	public MoodAnalyser() {
		super();
	}

	public MoodAnalyser(String message) {
		this.message = message;
	}
	
	/**
	 * If message contains "sad" it returns SAD else it returns HAPPY. If message is
	 * Null it returns HAPPY
	 * @return mood
	 */

	public String analyseMood() {
		try {
			if (message.contains("sad")) {
				return "SAD";
			} else {
				return "HAPPY";
			}
		} catch (NullPointerException e) {
			e.printStackTrace();
			return "HAPPY";
		}
	}

}