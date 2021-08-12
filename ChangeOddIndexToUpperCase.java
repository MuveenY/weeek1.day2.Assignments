package week1.day2.Assignments;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String test = "changeme", result="";
		 
		char[] newtest = test.toCharArray();
		
		for (int i = 0; i < newtest.length; i++) {

		
			
			if (i%2 == 0) { 
				newtest[i] = Character.toUpperCase(newtest[i]);
		
			} 
				
		}
				
		System.out.println(new String(newtest));
		
		
	}

}
