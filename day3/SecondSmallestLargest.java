package week1.day3;

public class SecondSmallestLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mark[] = {4,6,7,10,56,87};
		
		int length = mark.length;
		System.out.println("Total length : " + length);
		
		System.out.println("second smallest num is : " + mark[1]);
		System.out.println("second largest num is : " + mark[length-2]);

	}

}
