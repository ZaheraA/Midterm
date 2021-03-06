package problems;

import java.util.Arrays;

/**
 * Created by mrahman on 04/22/17.
 */
public class Anagram {

	public static void main(String[] args) {
		// Write a Java Program to check if the two String are Anagram. Two
		// String are called Anagram when there is
		// same character but in different order.For example,"CAT" and "ACT",
		// "ARMY" and "MARY".

		System.out.println(isAnagram("ARMY", "MARY"));
	}

	public static boolean isAnagram(String firstWord, String secondWord) {
		char[] word1 = firstWord.replaceAll("[\\s]", "").toCharArray();
		char[] word2 = secondWord.replaceAll("[\\s]", "").toCharArray();
		Arrays.sort(word1);
		Arrays.sort(word2);
		return Arrays.equals(word1, word2);
	}
}
