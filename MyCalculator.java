package week1.day2.Assignments;

public class MyCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculator obj = new Calculator();
		
		int add1 = obj.add();
		System.out.println("Addition Method Result : " + add1);
		
		int sub1 = obj.sub();
		System.out.println("Subtraction Method Result : " + sub1);
		 
		obj.mul(add1, sub1);
		
		float div1 = obj.div();
		System.out.println("Division Method Result : " + div1);

	}

}
