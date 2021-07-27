package com.ssayed.util;

import java.util.HashMap;
import java.util.Map;

public class StringUtil {
	public static boolean isAnagram(String text1, String text2) {
		if (text1 == null || text2 == null || text1.length() != text2.length())
			return false;

		Map<Character, Integer> charactersMap = new HashMap<>();

		// O(n) for text1
		for (int i = 0; i < text1.length(); i++) {
			char character = text1.charAt(i); // O(1)

			if (charactersMap.containsKey(character)) // O(1)
				charactersMap.put(character, charactersMap.get(character) + 1); // O(1)
			else
				charactersMap.put(character, 1); // O(1)
		}

		// O(n) for text2
		for (int i = 0; i < text2.length(); i++) {
			char character = text2.charAt(i); // O(1)

			if (charactersMap.containsKey(character)) {
				if (charactersMap.get(character) == 1) // O(1)
					charactersMap.remove(character); // O(1)
				else
					charactersMap.put(character, charactersMap.get(character) - 1); // O(1)
			} else
				return false;
		}

		if (charactersMap.size() > 0) // O(1)
			return false;

		return true;
	}
}