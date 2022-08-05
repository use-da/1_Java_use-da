package edu.kh.variable.ex1;

public class VariableExample5 {

	public static void main(String[]args) {
		
		// 인텔HD 그래픽 -> 그래픽 옵션 -> 바로가기 키 사용안함
		
		// Ctrl + Alt + 방향키 위 or 아래 : 해당 줄 복사
		
		
		/* 출력 메서드
		 * System.out.print("내용")
			-> ()안의 내용 출력 (줄바꿈 X)
		 * System.out.println("내용")
			-> ()안의 내용 출력 (줄바꿈 O)
		 * System.out.printf("내용 + 패턴", 패턴에 들어갈 값)
		    
		 * */
		
		System.out.print("aaaaa");
		System.out.print("bbbbb");
		System.out.println("ccccc");
		System.out.println("ddddd");
		
		String name = "김철수";
		int age = 20;
		char gender = '남';
		double height = 180.1;
		boolean tf = true;
		
		//김철수님은 20세 남성, 키는 180.1cm입니다 (true)
		System.out.println(name+"님은 "+age+"세 "+gender+"성, 키는 "+height+"cm입니다 ("+tf+")");
		
		System.out.printf( "%s님은 %d세 %c성, 키는 %fcm 입니다 (%b)",name,age,gender,height,tf);
		System.out.printf( "%s님은 %d세 %c성, 키는 %.1fcm 입니다 (%b)",name,age,gender,height,tf);

		System.out.printf( "%s님은 %d세 %c성, 키는 %.1fcm 입니다 (%b)\n",name,age,gender,height,tf);		
        // \n : 줄바꿈(개행)을 나타내는 탈출(escape) 문자
	
		
		System.out.println("내가 추가한 내용");		System.out.println();

		//주석
		System.out.println("개인공부");
		
	}
}