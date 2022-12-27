package week5.day1.assigments;

public class Students {
	public void getStudentInfo(int id) {
		// TODO Auto-generated method stub
System.out.println(id);
	}
	public void getStudentInfo(int id ,String name) {
		// TODO Auto-generated method stub
System.out.println(id+ " "+ name);

	}
	public void getStudentInfo(long phoneNumber,String email) {
		// TODO Auto-generated method stub
System.out.println(phoneNumber+" "+ email);

	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Students obj =new Students();
		obj.getStudentInfo(23456);
		obj.getStudentInfo(4556, "Sita");
		obj.getStudentInfo(987654321, "sita@gmail.com");
	}

}
