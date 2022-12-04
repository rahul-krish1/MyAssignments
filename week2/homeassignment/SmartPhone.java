package week2.homeassignment;

public class SmartPhone extends IPhone {

	public void watchVideo() {
		System.out.println("Watch a Video");
	}
	
	

	public void sendMsg() {
		// TODO Auto-generated method stub
		System.out.println("send a msg");
		
	}

	public void makeCall() {
		// TODO Auto-generated method stub
		System.out.println("make a call");
		
	}

	public void saveContact() {
		// TODO Auto-generated method stub
		System.out.println("save a contact");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		SmartPhone obj1 = new SmartPhone();
		
		obj1.takeVideo();
		obj1.watchVideo();
		obj1.sendMsg();
		obj1.makeCall();
		obj1.saveContact();
		
	}
}
