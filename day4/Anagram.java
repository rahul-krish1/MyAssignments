package week1.day4;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String text1 = "stops";
		String text2 = "potss";
		
		int length = text1.length();
		System.out.println(length);
		
		int length2 = text2.length();
		System.out.println(length2);
		
		if(length==length2) {
			System.out.println("same length");
			
			char[] charArray = text1.toCharArray();
			char[] charArray2 = text2.toCharArray();
			
			Arrays.sort(charArray);
			Arrays.sort(charArray2);
			
			boolean equals = Arrays.equals(charArray, charArray2);
			
			if(equals)
			{
				System.out.println("Both Arrays has same value");
			}
			
			else {
				System.out.println("Not a same value");
			}
			
		}
		
		

	}

}
