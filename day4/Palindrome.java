package week1.day4;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String org = "madam";
		String rev = "";
		
		char[] charArray = org.toCharArray();
		
		for (int i = charArray.length-1; i>=0; i--) {
			
			rev = rev+charArray[i];
		}
			
		System.out.println(rev);
		
		if(org.equals(rev)) {
			System.out.println("It is a Palindrome");
			
	}
		else {
			System.out.println("It is not a Palindrome");
		}
		
		
		
		
			
			
			
		}

	}

