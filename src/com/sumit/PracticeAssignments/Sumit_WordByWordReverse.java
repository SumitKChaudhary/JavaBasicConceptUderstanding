package com.sumit.PracticeAssignments;

import java.util.Scanner;

public class Sumit_WordByWordReverse 
{

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Input String:");
		String input = sc.nextLine();
		
		System.out.println("Enter Input Sentence:");
		String inputLine = sc.nextLine();
		sc.close();

		reverseUsingStringBuilder(input);
		reverseUsingByteArray(input);
		reverseUsingCharArray(input);
		reverseWords(inputLine);
	}

	private static void reverseUsingByteArray(String input) {
		byte[] ba = input.getBytes();
		byte[] result = new byte[ba.length];
		int len = ba.length;
		for (byte b : ba) {
			result[len - 1] = b;
			len--;
		}
		System.out.println("Reversed String using Byte Array = " + new String(result));
	}

	private static void reverseUsingCharArray(String input) {
		char[] ca = input.toCharArray();
		char[] result = new char[ca.length];
		int len = ca.length;
		for (char c : ca) {
			result[len - 1] = c;
			len--;
		}
		System.out.println("Reversed String using Char Array = " + new String(result));
	}

	private static void reverseUsingStringBuilder(String input) {
		// use StringBuffer for Java < 1.5
		StringBuilder sb = new StringBuilder(input);
		System.out.println("Reversed String using StringBuilder = " + sb.reverse());
	}

	private static void reverseWords(String inputLine) {
		String[] words = inputLine.split(" ");
		StringBuilder sb = new StringBuilder();
		for (int i = words.length - 1; i >= 0; i--) {
			sb.append(words[i]).append(' ');
		}
		// trim to remove last white space
		System.out.println("Reverse words = '" + sb.toString().trim() + "'");

	}

}
