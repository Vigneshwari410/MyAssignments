package week2.day1.assingments;

public class EmployeeDetails {
	public void printEmployeeName(String empName, int empId) {
		// TODO Auto-generated method stub
         System.out.println("EmployeeName "+empName);
         System.out.println("EmployeeId "+empId);
         
	}
	public void getEmployeeAddress(String empAddress) {
		// TODO Auto-generated method stub
		System.out.println("EmployeeAddress "+empAddress);
	}
	public void printEmployeeSalary(double empSalary) {
		// TODO Auto-generated method stub
		System.out.println("EmployeeSalary "+empSalary);
	}
	public void printEmployeeMobileNumber(long mobNum) {
		// TODO Auto-generated method stub
		System.out.println("tEmployeeMobileNumber "+mobNum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeDetails employeeDetails=new EmployeeDetails();
		employeeDetails.printEmployeeName("Vigneshwari", 44);
		employeeDetails.getEmployeeAddress("Thoothukudi");
		employeeDetails.printEmployeeSalary(50000);
		employeeDetails.printEmployeeMobileNumber(9876543210l);
	}
	

}
