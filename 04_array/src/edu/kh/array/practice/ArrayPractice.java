package edu.kh.array.practice;

import java.util.Scanner;

public class ArrayPractice {

	public void practice1() {
		int[]arr= {1,2,3,4,5,6,7,8,9};
		
		int sum=0;
		for(int i=0;i<=8;i++) {
			System.out.print(arr[i]+" ");
			
			if(arr[i]%2!=0) {
			sum+=arr[i];
			}
		
		}
		System.out.println("\n짝수 번째 인덱스 합 : "+sum);
	}
	//practice 1,2 조건문이 이해가 안됨
	
	
	
	
	public void practice2() {
		int[]arr= {9,8,7,6,5,4,3,2,1};
		
		int sum=0;
		for(int i=0;i<=8;i++) {
			System.out.print(arr[i]+" ");
			
			if(arr[i]%2==0) {
			sum+=arr[i];
			}
		}
		System.out.println("\n 홀수 번째 인덱스 합 : "+sum);
		
	}
	
	
	
	public void practice3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("양의 정수 : ");
		int num=sc.nextInt();
		int[]arr=new int[num];
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(i+1+" ");
		}
		
	}

	
//작동안함	
	public void practice4() {
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		int[]arr=new int[num];
		System.out.println("입력 0 : ");
		System.out.println("입력 1 : "+num);
		System.out.println("입력 2 : "+num);
		System.out.println("입력 3 : "+num);
		System.out.println("입력 4 : "+num);
		
		int search=sc.nextInt();
		System.out.println("검색할 값 : "+search);
		
		boolean flag=true;
		
		
		for(int i=0;i<arr.length; i++) {
			if(arr[i]==search) {
				System.out.println("인덱스 : "+i);
				
				flag=false;
				break;
			}
			
		}
		if(flag) {
			System.out.println("일치하는 값이 존재하지 않습니다.");
		}
	}
	
	
	
//  *문자열.length() : 문자열의 길이
//	ex) String str = “abcd”;
//	System.out.println(str.length()); // 4 출력
//	* 문자열.charAt(인덱스번호) : 
//	문자열에서 해당 인덱스 번째 문자 하나를 얻어옴(char 자료형)
//	ex) String str = “abcd”;
//	char ch = str.charAt(3); // ‘d’
//	System.out.println(ch); // ‘d’ 출력	
	public void practice5() {
		Scanner sc = new Scanner(System.in);
		String str=sc.next();
		System.out.println("문자열 : "+str);
		
		char search=str.charAt(0);
		System.out.println("문자 : "+search);
		System.out.printf("%s에 %s가 존재하는 위치(인덱스)",str,search);
		
		
		
		
	}
	
	public void practice6() {
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		int[]arr=new int [num];
		System.out.println("정수 : "+num);
		
		
	}
	
	
	
}
