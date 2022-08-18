package edu.kh.oop.basic;

public class BasicRun {
	public static void main(String[]args) {
		LYH lyh=new LYH();
		//heap영역에 LYH클래스에 정의된 내용을 이용하여
		//LYH 객체 생성(할당)
		
		System.out.println("이름 : "+lyh.name);
		System.out.println("나이 : "+lyh.age);
		System.out.println("생년월일 : "+lyh.birthday);
		
//		System.out.println("비밀번호 : "+lyh.password);
	    //The field LYH.password is not visible
		
		//비밀번호를 볼 수 있는 기능을 호출 == 간접 접근 방법
		lyh.showPassword();
		
		lyh.eat();
		lyh.study();
		lyh.plus(50,100);
		
		
	}
}

