package edu.kh.oop.cls.ex1;

import edu.kh.oop.cls.ex2.Test2;
//
//
//import :다른 패키지에 존재하는 클래스를 현재 클래스로 가져오는 것

public class TestRun {
	public static void main(String[]args) {
		//Test1 클래스를 이용해서 객체를 생성
		//==Test1 클래스에 정의된 내용을 이용해서
		//heap영역에 새로운 객체 생성(할당)
		Test1 t1=new Test1();
		
		Test2 t2=new Test2();
		//import 해야지만 에러가 발생하지 않음
		//->public class : 어디서든 접근 가능
		//                ==어디서든 import가능
		
		//클래스 접근 제한자 사용처
		//public : 언제 어디서든지 사용 가능한 클래스를 만들 때 사용
		//         (기본적으로 public사용)
	}
}
