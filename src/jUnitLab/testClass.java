package jUnitLab;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class testClass {

	@Test
	public void testWorks() {
		String word = "olasalo";
		PalindrometestClass palTest = new PalindrometestClass();
		
		String reverseWord = palTest.test(word);

		assertEquals(word, reverseWord);

	}
	@Test
	public void testFails() {
		String word = "dinmamma";
		PalindrometestClass palTest = new PalindrometestClass();
		
		String reverseWord = palTest.test(word);

		assertEquals(word, reverseWord);
	}
}
