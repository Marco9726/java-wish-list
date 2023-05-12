package org.java.myset;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class MainSet {
	
	public static void main(String[] args) {
		
		Set<Integer> mySet = new HashSet<>();
		
		Random r = new Random();
		
		
		
		while ( mySet.size() < 5) {
			
			int randomNumber = r.nextInt(10 + 1) + 2;
			
			mySet.add(randomNumber);
			
		}
		
		System.out.println(mySet);
	}
}
