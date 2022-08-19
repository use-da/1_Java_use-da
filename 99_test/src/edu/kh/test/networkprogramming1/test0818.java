package edu.kh.test.networkprogramming1;

import java.util.Scanner;

public class test0818 {
	public static void main(String[]args) {
		
		//소수 판별
		//1과 자기 자신(x) 외에는 나누어 떨어지지 않는 수
		
		//나눴을 때 0이 두개 나와야된다
		//2,3,5,7,11,13.....
		
		//-> x%2~x-1 까지 나머지가 0인 경우가 있다면 소수 아님
        //나머지가 0인 경우가 없다면 소수
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요");
		int x=sc.nextInt();
		
		if(x==1) {
			System.out.println(x+"는 소수가 아닙니다");
			return;
		}
		
		boolean flag=true;  //true==소수가 맞다
		
		for(int i=2; i<x; i++) {
			
			if(x%i==0) {
				System.out.println(x+"는 소수가 아닙니다.");
				flag=false;
				
				break;
				
			}
		}
		
		if(flag) {
			System.out.println(x+"는 소수입니다");
			
		}
		
		
		
		
	}
	
	
	
}
