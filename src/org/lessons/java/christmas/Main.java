package org.lessons.java.christmas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		List <String> wishList = new ArrayList<>();
		
		Scanner sc = new Scanner(System.in);
		
		int userChoice = -1;
		
		while ( true ) {
			

			System.out.println("-------------------");
			System.out.println("1 - Inserire nuovo desiderio");
			System.out.println("2 - Stampare lista e uscire");
			userChoice = sc.nextInt();
			System.out.println("-------------------");
			
			if (userChoice < 1 || userChoice > 2) {
				
				System.out.println("Scelta non compresa, ritentare");
				continue;
			}
			
			if (userChoice == 2) break;
			
			System.out.println("Quale desiderio vuoi inserire ?");
			String wish = sc.next();
			
			wishList.add(wish);
			
			System.out.println("-------------------");
			System.out.println("Numeri desideri inseriti: " + wishList.size());
			
			
		}
		
		System.out.println("lista dei desideri: " + wishList);
		sc.close();
	}
}
