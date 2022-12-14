package edu.kh.poly.ex1.model.vo;

public class Car {
	//필드
	private int wheel;
	private int seat;
	private String fuel;
	//기본 생성자
	public Car() {}
	//매개변수 생성자
	public Car(int wheel, int seat, String fuel) {
		super();
		this.wheel = wheel;
		this.seat = seat;
		this.fuel = fuel;
	}
	//getter/setter
	public int getWheel() {
		return wheel;
	}

	public void setWheel(int wheel) {
		this.wheel = wheel;
	}

	public int getSeat() {
		return seat;
	}

	public void setSeat(int seat) {
		this.seat = seat;
	}

	public String getFuel() {
		return fuel;
	}

	public void setFuel(String fuel) {
		this.fuel = fuel;
	}


	//alt+shift+s->o  : 생성자 자동완성
	//alt+shift+s->r  : getter/setter자동완성
	
	//Object의 toString()메서드
	//-개체의 문자열 표현을 반환
	//-객체가 가지고 있는 필드 정보를 하나의 문자열로 반환 할 수 있도록 Java에서 제공해주는 메서드
	//-자식 클래스에서 오버라이딩 해서 사용
	
	@Override
	public String toString() {
		
		return "wheel : " + wheel + " / seat : " + seat + " / feul : " + fuel;
		
		//wheel : 4 / seat : 5 / fuel : 경유
	}
}
