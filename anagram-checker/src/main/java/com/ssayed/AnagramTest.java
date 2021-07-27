package com.ssayed;

import java.util.Scanner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ssayed.util.StringUtil;

public class AnagramTest {
	private static final Logger LOGGER = LoggerFactory.getLogger(AnagramTest.class);

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in);) {
			while (true) {
				LOGGER.info("please enter the first text");
				String text1 = scanner.nextLine();

				LOGGER.info("Please enter the second text");
				String text2 = scanner.nextLine();

				boolean isAnagram = StringUtil.isAnagram(text1, text2);
				LOGGER.info("Does {} and {} are anagrams ? <{}>", text1, text2, isAnagram);

				LOGGER.info("Do you like to continue YES | NO ?");
				String input = scanner.nextLine();

				if ("NO".equalsIgnoreCase(input) || "N".equalsIgnoreCase(input)) {
					LOGGER.info("Thank you, bye");
					return;
				}
			}
		} catch (Exception e) {
			LOGGER.error("Something went wrong while checking anagram", e);
		}
	}
}