package week1.day2.Assignments;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String text1 = "posts";

		String text2 = "stops";

		if (text1.length() == text2.length()) {
			char[] chartext1 = text1.toCharArray();
			char[] chartext2 = text2.toCharArray();

			Arrays.sort(chartext1);
			Arrays.sort(chartext2);

			System.out.println(chartext1);
			System.out.println(chartext2);

			if (Arrays.equals(chartext1, chartext2)) {
				System.out.println("It is an Anagram");

			}

		} 
		else {
			System.out.println("It is not an Anagram");
		}
	}

}
