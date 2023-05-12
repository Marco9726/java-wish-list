package org.java.mymap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MainMap {
	
	public static void main(String[] args) {
		
		String str = "Lorem ipsum dolor, sit amet consectetur adipisicing elit. Totam - repudiandae est, alias in ullam excepturi ipsam modi odio Lorem ipsum dolor asperiores voluptatum, # quam distinctio ! Lorem ipsum dolor, sit amet consectetur adipisicing elit. Totam repudiandae Totam repudiandae est ; accusantium voluptatum, quam distinctio aut magnam quod veniam esse nesciunt debitis.";

//		System.out.println(Arrays.asList(str.split(" ")));
		
		Map<Character, Integer> occCounter = new HashMap<>();
		
		for (Character c : str.toLowerCase().toCharArray()) {

			if (c.equals(' ')) continue;
			
			if (occCounter.containsKey(c)) {
				
				occCounter.put(c, occCounter.get(c) + 1);
			} else {
				
				occCounter.put(c, 1);
			}
		}
		
		System.out.println(occCounter);
	}
}
