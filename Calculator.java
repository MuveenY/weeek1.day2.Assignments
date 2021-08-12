package week1.day2.Assignments;

public class Calculator {
	
	public int add() {
		int num1=10, num2=20, num3=30;
		int sum = num1+num2+num3;
		return sum;
	}
	
	public int sub() {
		int num1=20, num2=5;
		int num3= num1-num2;
		return num3;
	}
	
	public void mul(int num1, int num2) {
		int num3= num1*num2;
		System.out.println("Multiplication Method Result : " + num3);
	}
	
	public float div() {
		float num1=25.50f, num2=12.20f;
		float num3=num1/num2;
		return num3;	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		Calculator obj = new Calculator();
		
		int result = obj.add();
		System.out.println("Addition Method Result : " + result );
		
		int subtract = obj.sub();
		System.out.println("Subtraction Method Result : " + subtract );
		
		obj.mul(result, subtract);
		
		float division = obj.div();
		System.out.println("Division Method Result : " + division );
		
		
	}
	

}
