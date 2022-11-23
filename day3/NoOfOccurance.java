package week1.day3;

public class NoOfOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] mark= {23,5,67,89,67,43,56,22,57,78,98,87,45,34,56,78,78,90,78,78,78,89,78 ,
                67,78};
		
		int num = 67;
		int count = 0;
		
		for(int i=0;i<mark.length;i++) {
			
			if(mark[i] == num) {
				count++;
			}
		}
       System.out.println("Total count of num is : " + count);
	}

}
