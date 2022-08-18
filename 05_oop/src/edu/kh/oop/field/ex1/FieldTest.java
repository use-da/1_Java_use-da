package edu.kh.oop.field.ex1;

public class FieldTest {

	
	//접근 제한자 확인 예제
	public    int v1 = 10;
	
	protected int v2 = 20;
	
	          int v3 = 30;  //(default)
	          
	private   int v4 = 40;
	
	public void ex() {
		System.out.println("같은 클래스 내부 직접 접근");
		System.out.println(v1);
		System.out.println(v2);
		System.out.println(v3);
		System.out.println(v4);
		
	}
	
	
}
