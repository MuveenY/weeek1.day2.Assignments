package week1.day2.Assignments;

public class FindTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
String test = "$$ Welcome to 2nd Class of Automation $$ ";
		
		int letter = 0, space=0, num=0,specialChar=0;
		
		char[] charTest = test.toCharArray();
		int length = charTest.length;

		for (int i = 0; i < length; i++) {
			if(Character.isLetter(charTest[i])) {
				letter++;
				}
			else if(Character.isDigit(charTest[i])) {
			
				num++;
			}
			else if(Character.isSpaceChar(charTest[i])) {
				space++;
			}
			else {
			specialChar++;
			}
		}
		System.out.println("Letter : " + letter);
		System.out.println("Number : " + num);
		System.out.println("Space : " + space);
		System.out.println("Special Character : " + specialChar);
		

	}

}
