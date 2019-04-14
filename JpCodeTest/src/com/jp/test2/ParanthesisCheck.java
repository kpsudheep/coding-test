package com.jp.test2;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class ParanthesisCheck {

	public static void main(String[] args) {
		
		//Positive Test Case
		//Test Case 1
		if(checkMatch("{ac[bb]}")) {
			System.out.println("Braces Matched");
		} else {
			System.out.println("Braces did NOT Match");
		}

//		//Test Case 2
//		if(checkMatch("[dklf(df(kl))d]{}")) {
//			System.out.println("Braces Matched");
//		} else {
//			System.out.println("Braces did NOT Match");
//		}
//
//		//Test Case 3
//		if(checkMatch("{[[[]]]}")) {
//			System.out.println("Braces Matched");
//		} else {
//			System.out.println("Braces did NOT Match");
//		}
//
//		//Negative
//		//Test Case 4
//		if(checkMatch("{3234[fd{df][d}")) {
//			System.out.println("Braces Matched");
//		} else {
//			System.out.println("Braces did NOT Match");
//		}
//
//		//Test Case 5
//		if(checkMatch("{df][d}")) {
//			System.out.println("Braces Matched");
//		} else {
//			System.out.println("Braces did NOT Match");
//		}
	}
	
	public static boolean checkMatch(String input) {

		// Set Map for brace match
		Map<Character,Character> pairs = new HashMap<>();
		pairs.put('{','}');
		pairs.put('[',']');
		pairs.put('(',')');

		// Using Deque to get Stack features
		Deque<Character> l = new LinkedList<>();
		for(char current:input.toCharArray()) {
			if (pairs.containsKey(current)) {
				l.addLast(current);
			} else if (!l.isEmpty() && pairs.get(l.getLast()) == current) {
				l.removeLast();
			} else if (pairs.containsValue(current)) {
				return false;
			}
 		}
		return l.isEmpty();

	} 

}
