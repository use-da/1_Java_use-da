package edu.kh.control.loop.practice;

import java.util.Scanner;

public class LoopPractice {

	public void ex1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int input1=sc.nextInt();
			if(input1<1){System.out.println("1이상의 숫자를 입력해주세요.");
			}else{
				for(int i=1;i<=input1;i++){System.out.print(i+" ");
				}
			}					
	}
	
	public void ex2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int input2=sc.nextInt();	
		if(input2<1) {System.out.println("1이상의 숫자를 입력해주세요.");
		}else{
			for(int i=input2; i>=1; i--){System.out.print(i+" ");
			}
		}
	}
	
	
	public void ex3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 하나 입력하세요 : ");
		int input3=sc.nextInt();
		int sum=0;
		for(int i=1; i<=input3; i++) {
			if(i != 1) {
				System.out.print(" + ");
			}			
			System.out.print(i);
			sum+=i;
		}
		System.out.print("= "+sum);
	}
	//for문 안에 if문 사용해 걸러내기
	
	
	public void ex4() {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번쨰 숫자 : ");
		int x=sc.nextInt();
		System.out.print("두 번째 숫자 : ");
		int y=sc.nextInt();
		if(x<1 || y<1) {System.out.println("1 이상의 숫자를 입력해주세요.");
		}else{
			if(x < y){
				for(int i=x; i<=y; i++){
					System.out.print(i+" ");
				}
			}else{
				for(int i=y; i<=x; i++){
					System.out.print(i+" ");
				}
			}			
		}
	}
	//if-else안에 if-else를 한 번 더 사용하기
	
	
	public void ex5() {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 : ");
		int input5=sc.nextInt();
		System.out.print("===== "+ input5 +"단 =====");
			for(int i=1;i<=9;i++){
				System.out.println();
				System.out.printf("%d*%d=%d",input5,i,input5*i);
			}		
	}
	
	
	public void ex6() {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 : ");
		int input6=sc.nextInt();
		if(input6>9||input6<2) {System.out.println("2~9 사이 숫자만 입력해주세요.");
		}else{
			for(int x=1; x<=9; x++) {
				System.out.print("===== "+ input6 +"단 =====");
				for(int i=1;i<=9;i++){
				System.out.println();
				System.out.printf("%d*%d=%d",input6,i,input6*i);
				}
			}
		}	
	}
	
	public void ex7() {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 입력 : ");
		int input7=sc.nextInt();
		for(int row=1; row<=input7; row++) {
			for(int col=1; col<=row; col++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public void ex8() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int input8=sc.nextInt();
		for(int x=input8; x>0; x--) {        //12345
			for(int y=1; y<=x; y++) {        //1234 

//		for(int x=input8; x>0; x--) {		 //54321
//			for(int y=x; y>=1; y--) {		 //4321		
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	
	
	public void ex9() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int input9=sc.nextInt();
	}
	
	
	
	
	public void ex10() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int input10=sc.nextInt();
		for(int x=1; x<=input10; x++) {
			for(int y=1; y<=x; y++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	
	public void ex11() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int input11=sc.nextInt();
	}
	
	
	
	public void ex12() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int input12=sc.nextInt();
	}
	
	
	
	public void ex13() {
		Scanner sc = new Scanner(System.in);
		System.out.print("자연수 하나를 입력하세요 : ");
		int input13=sc.nextInt();
		for(int i=1; i<=input13;i++) {
			if(i%2==0 || i%3==0) {System.out.print{i+" ";
		}
		}	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}