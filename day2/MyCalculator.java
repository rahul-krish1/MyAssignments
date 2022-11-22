package week1.day2;

public class MyCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 	
		Calculator obj = new Calculator();
		
		int add = obj.add(4, 5, 6);
		System.out.println(add);
		
		int sub = obj.sub(7, 6);
		System.out.println(sub);
		
		double mul = obj.mul(25.456, 34.567);
		System.out.println(mul);
		
		float divide = obj.divide(12.5f, 6.5f);
		System.out.println(divide);
		
		
		

	}

}
