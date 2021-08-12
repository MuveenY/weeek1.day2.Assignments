package week1.day2.Assignments;

import java.util.Arrays;
import java.util.Collections;

public class FindSecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] data = {3,2,11,4,6,7};
		
		Arrays.sort(data);
		System.out.println("Second Largest Element : " + data[data.length-2]);
		

	}

}
