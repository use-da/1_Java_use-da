package edu.kh.test.employManagement;

import java.util.ArrayList;
import java.util.List;

public class EmployManagementService {

	private List<EmployManagement>emList=new ArrayList<EmployManagement>();
	//1. 사원 정보 추가
	public boolean addemp(String empId, String empName, String empNo, String email, String phone, String departmentTitle,
			String jobName, int salary) {
		
		EmployManagement em=new EmployManagement(empId, empName,empNo,email,phone, departmentTitle,jobName,salary);
		
		return emList.add(em);
	}

	//2. 전체 사원 정보 조회
	public List<EmployManagement> getemList() {
		
		return emList;
	}

	//3. 사번 일치 검색
	public List<EmployManagement> wjdqhwhghl1(String empId) {
		
		List<EmployManagement>resultList=new ArrayList<EmployManagement>();
		
		for(EmployManagement e : emList) {
			if(e.getEmpId().equals(empId)) {
				resultList.add(e);
			}
			
		}
		
		return resultList;
	}

	
	
	
	
}
