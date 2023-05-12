package org.java.mymap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MainMap {
	
	public static void main(String[] args) {
		
		String str = "Lorem ipsum dolor, sit amet consectetur adipisicing elit. Totam - repudiandae est, alias in ullam excepturi ipsam modi odio Lorem ipsum dolor asperiores voluptatum, # quam distinctio ! Lorem ipsum dolor, sit amet consectetur adipisicing elit. Totam repudiandae Totam repudiandae est ; accusantium voluptatum, quam distinctio aut magnam quod veniam esse nesciunt debitis.";

		String[] strArray = str.split(" "); 
		System.out.println(Arrays.asList(strArray));
		System.out.println(strArray.length);
		
		Map<String, Integer> occCounter = new HashMap<>();
		
		
		for (String s : strArray) {

//			if (s.equals(' ') || !Character.isLetter(c)) continue;
			
			
			
			if (occCounter.containsKey(s)) {
				
				occCounter.put(s, occCounter.get(s) + 1);
			} else {
				
				occCounter.put(s, 1);
			}
		}
		
		System.out.println(occCounter);
	}
}
