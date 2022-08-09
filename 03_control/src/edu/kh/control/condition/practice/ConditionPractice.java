package edu.kh.control.condition.practice;

import java.util.Scanner;

public class ConditionPractice {

	public void practice1() {
//		 Scanner sc = new Scanner(System.in);
//		 System.out.print("숫자를 한 개 입력하세요 : ");
//		 int input=sc.nextInt();
//		
//		 if(input%2==0) {System.out.println("짝수입니다.");
//		 }if (input%2==1){System.out.println("홀수입니다.");
//		 }else {System.out.println("양수만 입력해주세요");}
		 
		 Scanner sc = new Scanner(System.in);
		 System.out.print("숫자를 한 개 입력하세요 : ");
		 int input = sc.nextInt();
		 
		 String result;
		 if(input>0){
			 if(input%2==0) {
				 System.out.println("짝수입니다.");
			 } else {
				 System.out.println("홀수입니다.");
			 }
			 
		 }else {
			 System.out.println("양수만 입력해주세요."); 
		 }
	}
		
		
		
		 
	
	public void practice2() {
		 Scanner sc = new Scanner(System.in);
	
		 System.out.print("국어점수 : " );
		 int a = sc.nextInt();
		 System.out.print("수학점수 : " );
		 int b = sc.nextInt();
		 System.out.print("영어점수 : " );
		 int c = sc.nextInt();
		 
		 int sum = a+b+c;
		 double avg = sum/3.0;
		 
//		 String result=a>=40&&b>=40&&c>=40&&avg>=60?
//				 "축하합니다,합격입니다!":"불합격입니다.";
//		if (result=="축하합니다,합격입니다!") {System.out.println("국어 : "+ a +
//				"수학 : "+ b +"영어 : "+ c+ "합계 : " +sum +"평균 : "+ avg + result 
//		);}
		 if(a>=40 && b>=40 && c>=40 && avg>=60) {
			 System.out.println("국어 : "+a);
			 System.out.println("수학 : "+b);
			 System.out.println("영어 : "+c);			 
			 System.out.println("합계 : "+sum);
			 System.out.println("평균 : "+avg);
		
			 System.out.println("축하합니다, 합격입니다.");
		 }else {
			 System.out.println("불합격입니다.");
		 }
		 
		 
	}
	
	
	public void practice3() {
		 Scanner sc = new Scanner(System.in);
		 System.out.print("1~12 사이의 정수 입력 : ");
		 int month=sc.nextInt();

		 
		 switch(month) {
		 case 1 : case 3 : case 5 : case 7 : case 8 : case 10 : case 12 : 
				System.out.println(month+"월은 31일까지 있습니다."); break;
		 case 4 : case 6 : case 9 : case 11 : 
			    System.out.println(month+"월은 30일까지 있습니다."); break;
		 case 2 : System.out.println(month+"월은 28일까지 있습니다."); break;
		 default : System.out.println(month+"월은 잘못 입력된 달입니다.");
		 
		
		}
		
		
	}
	public void practice4() {
	  Scanner sc = new Scanner(System.in);
	  System.out.print("키(m)를 입력해 주세요 : ");
	  double m =sc.nextDouble();
	  System.out.print("몸무게(kg)를 입력해 주세요 : ");
	  double kg = sc.nextDouble();
	  double bmi = kg/(m*m);
	  System.out.println("BMI 지수 : " + bmi);
	  
	  if(bmi>=30) {System.out.println("고도 비만");
	  }else if(bmi>=25){System.out.println("비만");
	  }else if(bmi>=23){System.out.println("과체중");
	  }else if(bmi>=18.5){System.out.println("정상체중");
	  }else{System.out.println("저체중");
	  
	  }
	  //String result;
	  //if(bmi<18.5) {result="저체중";
	  //}else if(bmi<23) {result=:"정상체중";
	  //}else if(bmi<25) {result=:"과체중";
	  //}else if(bmi<30) {result=:"비만";
	  //}else {result=:"고도비만";
	  
			  
	  }
	  
	  
	  
    
	public void practice5() {
		 Scanner sc = new Scanner(System.in);
		 System.out.print("중간 고사 점수 : ");
		 double wnd = sc.nextInt();               //int로 입력 받아도 대입 연산 시 double 자동 형변환
		 System.out.print("기말 고사 점수 : ");
		 double rl = sc.nextInt();
		 System.out.print("과제 점수 : ");
		 double rhk = sc.nextInt();
		 System.out.print("출석 횟수 : ");
		 double cnf = sc.nextInt();
		 
		 System.out.println("=============결과===========");
		 
		 //각각의 점수를 비율에 맞게 변경
		 wnd*=0.2;//wnd=wnd*0.2; 
		 rl*=0.3;
		 rhk*=0.3;
		 cnf*=5*0.2; //cnf=cnf*5*0.2 1회당 1점
		 
		 if(cnf<=14) {System.out.println("[출석 횟수 부족 ("+(int)cnf+"/20)]");
		 												//소수점버림		
		 }else {
			 System.out.printf("중간 고사 점수(20) : %.1f \n", wnd);
			 System.out.printf("기말 고사 점수(30) : %.1f \n", rl);
			 System.out.printf("과제 점수(30) : %.1f \n", rhk);
			 System.out.printf("출석 점수(20) : %.1f \n", cnf);
			
			double sum = wnd + rl+ rhk+ cnf;
			 
			 System.out.printf("총점 : %.1f \n", sum);
			 if(sum>70.0) {System.out.println("PASS");
		     }else {
			 System.out.println("Fail[점수 미달]");
		     }
		 }  
		 
	} 
		 
    }
	
