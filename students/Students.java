package students;

public class Students {
	
	public int getStudentInfo(int id) {
		// TODO Auto-generated method stub
		
		return id;

	}
	
	public void getStudentInfo(int id, String name) {
		// TODO Auto-generated method stub
		
		System.out.println("id is : " +id + " name is :"  +name);

	}
	
	public void getStudentInfo(String email, long phoneNumber) {
		// TODO Auto-generated method stub
		
		System.out.println("email is : " +email + "phoneNumber is : "    +phoneNumber);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Students obj1 = new Students();
		
		int studentInfo = obj1.getStudentInfo(5);
		System.out.println(studentInfo);
		
		obj1.getStudentInfo(4, "Rahul");
		obj1.getStudentInfo("rahul@gmail.com", 8310658279l);

	}

}
