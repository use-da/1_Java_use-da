package edu.kh.oop.field.model.vo;

public class Trainee {     //훈련생

	public String name;           //이름 
	public String phone;          //휴대폰 번호
	public String email;          //이메일
	public int salary;            //급여(훈련수당) 
	
	public static char classroom; //강의장
	
	{    //instance block
		email="없음";
		salary=116000;
		
	}
	
	static {  //static block
		classroom='A';
	}
}
