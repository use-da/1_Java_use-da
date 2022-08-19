package edu.kh.test.networkprogramming1;

import java.util.Scanner;

public class test081802 {

	public static void main(String[]args) {
		
		//n이하의 소수를 모두 구하기
		
	Scanner sc=new Scanner(System.in);
	System.out.print("0이상의 숫자를 입력하세요 : ");
	
	int n=sc.nextInt();

	if(n>=0) {
		if(n==0) {System.out.println("소수가 없습니다");
		}else {
		for(int i=1;i<=n;i++) {
			int number=i;
			if(n<2) {System.out.println("소수가 없습니다");
			continue;
			}
			if(i<2) {
			continue;
			}

			boolean flag=true;
			for(int x=2;x<number;x++) {
				if(number%x==0) {
					flag=false;
				break;	
				}
				
			}
			if(flag) {
			System.out.print(number+" ");}
		}
		}
	}else {
		System.out.println("숫자를 잘못 입력했습니다");
	}
		
	}
}
