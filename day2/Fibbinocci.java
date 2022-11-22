package week1.day2;

public class Fibbinocci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int firstNum = 0;
		int secNum = 1;
		int sum = 0;
		int n = 11;
		
		
		 System.out.println(firstNum);
		 
		 System.out.println(secNum);
		 
		
		
		for (int i = 2; i <n; i++) {
			
			sum = firstNum + secNum ;
			firstNum = secNum;
			secNum = sum;
			
			System.out.println(sum);
		}
		

	}

}
