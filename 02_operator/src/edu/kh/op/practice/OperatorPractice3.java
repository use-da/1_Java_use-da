package edu.kh.op.practice;

import java.util.Scanner;

public class OperatorPractice3 {
	public static void main(String[]args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		String result = input==0 ? "0" : (input>0 ? "양수" : "음수" );
		
		System.out.println(result + "입니다.");
		
		//0이 뒤의 조건에 들어가나 안들어가나가 중요(앞,뒤 오류 안나게) 
		//어떤 걸 제외를 먼저해야 속도가 빠른가
		
		
		
		
		
	}
}
