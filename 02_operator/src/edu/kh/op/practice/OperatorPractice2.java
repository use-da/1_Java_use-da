package edu.kh.op.practice;

import java.util.Scanner;

public class OperatorPractice2 {
	public static void main(String[]args) {
	

	Scanner sc=new Scanner(System.in);
	
	System.out.print("이름 : " );
	String aa = sc.next();
	
	System.out.print("학년(정수) : " );
	int bb = sc.nextInt();	
	
	System.out.print("반(정수) : " );
	int cc = sc.nextInt();
	
	System.out.print("번호(정수) : " );
	int dd = sc.nextInt();
	
	System.out.print("성별(남학생/여학생) : " );
	String ee = sc.next();
	
	System.out.print("성적(소수점 아래 둘째 자리까지) : " );
	double ff = sc.nextDouble();
	
	System.out.printf("%d학년 %d반 %d번 %s %s의 성적은 %.2f점 입니다. \n",
			          bb, cc, dd, aa, ee, ff );
	
			
	//sc.next() : 한 단어 입력, 띄어쓰기 미포함
	//            -> 띄어쓰기, 엔터가 입력 종료를 의미
	
	//sc.nextLine() : 한 문장(한 줄) 입력, 띄어쓰기 포함
	//                -> 엔터가 입력 종료를 의미
	//키보드   입력버퍼      프로그램
	//3\n	  3\n4\n10\n       3nextInt()    
	//4\n					 \n4nextInt()
	//10\n					 \n10nextInt()
	//				\n남음	   nextLine()	
	//남학생   버퍼에 맨 앞에 \n(엔터)가 남아있어 문자열 입력이 안되고 넘어간다
	
	//**해결방법**
	//입력버퍼 맨 앞에 있는 엔터(개행문자)를 제거 
	//[맨 앞에 엔터(개행문자)가 남는 경우
	//-> next(), nextInt(), nextFloat(), nextDouble() 등...
	//	 nextLine()을 제외한 모두]
	//   뒤에 sc.nextLine() 을 한 번 더 작성하기 
	//[sc.nextLine(): 입력 버퍼 맨 앞에 남은 엔터를 꺼내옴->입력버퍼 청소]
	
	
	}
}
