package com.gitlearing.week19;

public class ReverseStringByWord {

	private static String reverseStringByWord(String str) {
		
		// Split string to String[] by space
		String[] wordArray = str.split("\\s");
		int length = wordArray.length;
		
		StringBuilder sb = new StringBuilder();
		for (int i = length - 1; i >= 0; i--) {
			sb.append(wordArray[i]).append(" ");
		}
		return sb.toString();
	}
	
	public static void main(String[] args) {
		
		String str = "This is a      test. Don't     care";
		System.out.println("Before reverse: " + str);
		System.out.println("After reverse: " + reverseStringByWord(str));
	}
}
