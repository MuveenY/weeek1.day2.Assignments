package week1.day2.Assignments;

public class CharOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "welcome to chennai";
		
		int count = 0;
		
		char[] charStr = str.toCharArray();
		int length = charStr.length;

		for (int i = 0; i < length; i++) {
			if(charStr[i] == 'o') {
				count++;
			}
			
		}
		System.out.println("Given Char Occurance is : " + count + " Times");
	}

}
