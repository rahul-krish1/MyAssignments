package week1.day4;

public class CharOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "welcome to chennai";
		
		int count = 0;
		char letter = 'e';
		
		char[] charArray = str.toCharArray();
		
		int length = charArray.length;
		
		System.out.println(length);
		
		for (int i=0; i<charArray.length-1;i++)
		{
			if(charArray[i]==letter)
			{
				count = count+1;
			}
			
			
		}
		
		System.out.println(count);


	}

}
