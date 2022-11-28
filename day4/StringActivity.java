package week1.day4;

public class StringActivity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "TestLeaf";
		char[] charArray = str.toCharArray();	
		for (int i=charArray.length-1; i>=0; i--) {
			
			System.out.println(charArray[i]);
			
		}

	}

}
