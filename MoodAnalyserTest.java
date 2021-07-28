package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

import com.bridgelabz.exception.MoodAnalyser;

public class MoodAnalyserTest {

	@Test
	public void givenMessageIsAnyMood_shouldReturn_Happy() {
		MoodAnalyser moodanalyser = new MoodAnalyser("I am in any mood");
		Assert.assertEquals("HAPPY", moodanalyser.analyseMood());
	}

}
