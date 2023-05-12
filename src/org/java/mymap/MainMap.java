package org.java.mymap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainMap {
	
	public static void main(String[] args) {
		
		
		String str = "Lorem ipsum dolor, sit amet consectetur adipisicing elit. Totam - repudiandae est, alias in ullam excepturi ipsam modi odio Lorem ipsum dolor asperiores voluptatum, # quam distinctio ! Lorem ipsum dolor, sit amet consectetur adipisicing elit. Totam repudiandae Totam repudiandae est ; accusantium voluptatum, quam distinctio aut magnam quod veniam esse nesciunt debitis.";

//		trasformo la stringa in array di stringhe
		String[] strArray = str.split(" "); 	
		System.out.println(Arrays.asList(strArray));
	
		System.out.println("----------------");
		
//		inizializzo arrayList che conterrà le parole in minuscolo e senza caratteri speciali
		List<String> myList = new ArrayList<>();
		
		
		for ( int i =0; i < strArray.length; i++) {
			
			String lorem = strArray[i];
//			inizializzo arrayList di caratteri
			List<Character> charArr = new ArrayList<>();
			
			for (Character c : lorem.toLowerCase().toCharArray()) {

//				se il carattere è una lettera..args.	
				if (Character.isLetter(c)) {
//					...lo inserisco nell'arrayList di caratteri
					charArr.add(c);
					
				} 
				
			}
			
//			trasformo la lista di caratteri in una stringa	
			StringBuilder builder = new StringBuilder(charArr.size());	
					
		    for(Character ch: charArr)
		    {		//escludo le possibili virgole
		    	if (Character.isLetter(ch)) {
		    		
		    		builder.append(ch);
		    	}
		    }
		    
//		    inserisco la stringa in minuscolo e senza caratteri speciali nella lista dichiarata prima del ciclo
		    myList.add( builder.toString());   
			
		}
		
		System.out.println(myList);
		
//		inizializzo una mappa che conterrà le occorenze
		Map<String, Integer> occCounter = new HashMap<>();	
		
//		ciclo le stringhe della nuova lista generata
		for (String s : myList) {
			
			if (s.length() > 0 ){
				
				if (occCounter.containsKey(s)) {
					
					occCounter.put(s, occCounter.get(s) + 1);
				} else {
					
					occCounter.put(s, 1);
				}
			}
				
		}
		
		System.out.println(occCounter);
	}
}