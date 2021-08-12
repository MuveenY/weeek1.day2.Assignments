package week1.day2.Assignments;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String value = "malayalam";
		String revValue = "";
		
		char[] charArray = value.toCharArray(); 

		for (int i = charArray.length-1; i>= 0; i--) {
			revValue = revValue + charArray[i];
		
		}
			if (value.equals(revValue)) {
				
				System.out.println("Given String " + value + " is a Palindrome");
			} else {

				System.out.println("Given String " + value + " is not a Palindrome");
			}
			
			
		
	}

}
