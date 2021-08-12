package week1.day2.Assignments;

import java.util.Iterator;

public class ReverseEvenWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String test = "I am a software tester";
		
		String[] words = test.split(" ");
		
		for (int i = 0; i < words.length; i++) {
			
			if(i%2 == 1) {
				int indexWords = words[i].length();
				
				for (int j = indexWords-1; j >=0; j--) {
					
					System.out.print(words[i].charAt(j));
				}
				System.out.print(" ");
			}
		
			else {
				System.out.print(words[i]+" ");
			}
		}
		

	}

}
