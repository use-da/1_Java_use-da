package edu.kh.oop.constructor.model.vo;

public class Temp {

	private int num;
	private String name;
	
	//1.생성자가 하나도 작성되지 않으면 컴파일러가 기본 생성자를 추가해준다
	//2.매개변수 생성자 작성 시 컴파일러가 자동 추가 해주지 않으므로 기본 생성자를 같이 작성해준다.
	
	public Temp() {} //기본 생성자 (필수)
	public Temp(int num,String name) {
		this.num=num;
		this.name=name;
		
		
	}
	
}