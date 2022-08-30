package edu.kh.test.employManagement;

public class Run {
	public static void main(String[]args) {
		
		EmployManagementService service=new EmployManagementService();
		
		new View().employManagementView();
	}
}
