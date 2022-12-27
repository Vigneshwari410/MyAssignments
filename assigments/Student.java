package week5.day1.assigments;

public class Student extends Department {
	public void studentName() {
		// TODO Auto-generated method stub
System.out.println("Student Name");
	}
	public void studentDept() {
		// TODO Auto-generated method stub
		System.out.println("Student Dept");
	}
	public void studentId() {
		// TODO Auto-generated method stub
		System.out.println("Student Id");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student obj=new Student();
		obj.collegeName();
		obj.collegeCode();
		obj.collegeRank();
		obj.deptName();
		obj.studentName();
		obj.studentDept();
		obj.studentId();
	}

}
