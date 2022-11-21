package week1.day1;

public class Mobile {

	public void makeCall()
	{
		System.out.println("Make a call");
	}
	
	public void sendMsg()
	{
		System.out.println("Send a Message");
	}
	
	public static void main(String[] args) {
		
		Mobile obj = new Mobile();
		obj.makeCall();
		obj.sendMsg();
	}
}
