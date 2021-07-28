package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

import com.bridgelabz.exception.MoodAnalyser;

public class MoodAnalyserTest {

	@Test
	public void givenMessageIsSadMood_shouldReturn_Sad() {
		MoodAnalyser moodanalyser = new MoodAnalyser("I am in sad mood");
		Assert.assertEquals("SAD", moodanalyser.analyseMood());
	}

}
