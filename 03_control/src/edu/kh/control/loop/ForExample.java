package edu.kh.control.loop;

import java.util.Scanner;

public class ForExample {

	
	//조건식이 만족하는 동안 반복
	//운동장을 10바퀴 도세요 -끝이 정해짐-for문	
	//운동장을 지칠 때까지 도세요 -끝을 알 수 없지만 끝이 있음 -while문
	
	/* for문
	 * 끝이 정해져 있는 경우 사용하는 반복문
	 * 반복 횟수 지정되어 있는 경우
	 * 
	 * [작성법]
	 * for( 초기식; 조건식; 증감식){수행할 코드;}
	 *  
	 * 초기식 : for문을 제어하는 용도의 변수선언
	 * 조건식 : for문의 반복 여부를 지정하는 식
	 * 		  조건식이  true인 경우에 반복을 수행
	 * 		  보통 초기식에 사용된 변수를 이용해서 조건식을 작성
	 * 증감식 : for문이 끝날 때 마다 특정 값을 변화시키는 식
	 * 		  보통 초기식에 사용된 변수를 증가/감소시켜 조건식의 결과를 변하게 함
	 * 
	 * */
	
	
	//for문 기초 사용법 1
	//1~10까지 반복 출력
	//for(초기식; **조건식; 증감식){}
	public void ex1() {
		for(int i=1;  i <=10;   i++) {
		// 1)초기식;  2,5)조건식;  4,7)증감식
		// 3,6)반복 수행할 코드
			System.out.println(i+"출력");
		// 1출력	
			
		//1,2,3,4수행 후 5~7반복	
		}	
	}
	//for문 기초 사용법 2
	//5~12 1씩 증가하면서 출력
	public void ex2() {
		for(int i=5; i<=12; i++) {
			System.out.println(i+"출력");
		}
		
		System.out.println("===========");
		
		//1부터 100까지의 모든 정수의 합
		
		int sum=0; 
		//합계 저장용 변수
		//->0은 더하거나 뺄 때 영향이 없어 누적이 필요한
		//  상황에서 기준점으로 사용하기 적합하다					
		for(int i=1; i<=100; i++) {
			
			//i 값이 1~100 1씩 증가
			//->i값이 sum변수에 계속 누적
			sum+=i; //sum=sum+i;
			System.out.println
			("1에서 100까지의 합 : "+sum);
		}
		
	}	
	
	//for문 기초 사용법3
	//두 정수를 입력 받아
	//두 정수사이의 모든 정수 합을 출력(num1~num2)
	//단, 첫번째 입력이 두 번째 입력보다 작아야 한다.
	public void ex3() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수1 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("정수2 입력 : ");
		int num2 = sc.nextInt();		
		
		int sum=0; //합계 저장용 변수
		for(int i=num1; i<=num2; i++) {
			sum+=i; //누적
			}
		System.out.printf("%d부터 %d까지의 합 : %d \n",num1,num2,sum);
}	
	
	
	//for문 기초 사용법4
	//1부터 100까지 3씩 증가하며 출력
	public void ex4() {
		for(int i=1; i<=100; i+=3) { 
			System.out.print(i+" ");
			//1씩증가 == i++ == i=i+1
		}
			System.out.println("\n=====================");
			
		//10부터 20까지 0.5씩 증가
		for(double i=10.0; i<=20.0; i+=0.5) {
			System.out.print(i + " ");
			//inti=10으로 하면
			//10 + 0.5
			//10.0+0.5(자동 형변환)
			//10.5(double)
			//(int)10.5 ->10
			
		}
			
		}

	//for문 응용1
	//for문 +char+강제 형변환 응용
	//A~Z까지 출력
	public void ex5() {
//		for(int i='A'; i<='Z'; i++ ) {
//			System.out.print((char)i + " " );
	
		for(char i='A'; i<= 'Z'; i++) {
			System.out.print(i+" ");
		}
		
		}
		
		
	//for문 응용2
	//10부터 1까지 1씩 감소하면서 출력
	public void ex6() {
		for(int i=10; i>0; i--) {
			System.out.print(i + " ");
		}
}	
	//for문 응용3
	//입력, sum, for문
	//정수 5개를 입력 받아서 합계 구하기 
	public void ex7() {
	    Scanner sc = new Scanner(System.in);
//	System.out.println("입력1 : ");
//	int num1 = sc.nextInt();
//	System.out.println("입력2 : ");
//	int num2 = sc.nextInt();
//	       ...
	    int sum= 0;
	    for(int i=1; i<=5; i++) {
	    	System.out.print("입력 " +i+ " : ");
	    	sum += sc.nextInt();	    	
	    	//입력 버퍼에서 다름 정수를 얻어와 sum변수에 누적
	    }
	    System.out.println("합계 : "+ sum);	       
}	
	//for문 응용예제1
	// 정수를 몇 번 입력 받을지 먼저 입력 받고
    // 입력된 정수의 합계를 출력
    // ex)
    // 입력 받을 정수의 개수 : 3
    // 입력 1 : 10
    // 입력 2 : 20
    // 입력 3 : 30
    // 합계 : 60
    // ex)
    // 입력 받을 정수의 개수 : 2
    // 입력 1 : 10
    // 입력 2 : 20
    // 합계 : 30
	public void ex8() {
		Scanner sc = new Scanner(System.in);
		System.out.println("입력 받을 정수의 개수 : ");
		int num1 = sc.nextInt();

		int sum = 0;
		for (int i = 1 ; i<=num1; i++ ) {
			System.out.print("입력" +i+ " : ");
			sum += sc.nextInt();
		}
		System.out.println("합계 : "+sum);				
}		

	//for문 기초 예제1
	//for, %(나머지), if-else
	//1부터 20까지 1씩 증가하며 출력하면서
	//단, 5의 배수에는 ()를 붙여서 출력 
	//ex)1 2 3 4 (5) 6 7 8 9 (10) ...
	public void ex9() {
		for(int i=1; i<=20; i++) {
			if(i%5==0) {System.out.print(" "+"("+i+")");
			}else{System.out.print(" "+i);}		
		}		
}	
	
	//for문 응용예제2
	//for, if, Scanner, 논리연산자
	//구구단 출력
	//2~9사이의 수를 하나 입력 받아 해당하는 수의 단을 출력
	//단, 입력 받은 수가 2~9사이가 아니라면 "잘못 입력하셨습니다."출력
	public void ex10() {
		Scanner sc = new Scanner(System.in);
		System.out.print("단(2~9) 입력 : ");
		int dan = sc.nextInt();
		
		if(dan>9 || dan<2) {System.out.println("잘못 입력하셨습니다.");
		//!(dan>=2 && dan<=9) 
		}else {for(int i=1; i<10; i++) {
			System.out.printf("%d X %d = %d \n", dan,i,dan*i);}}
		
		System.out.println("===============");
		
		//역순 출력
		//2 X 9 =18 ...
		if(dan>9 || dan<2) {System.out.println("잘못 입력하셨습니다.");
		//!(dan>=2 && dan<=9) 
		}else {for(int i=9; i>0; i--) {
			System.out.printf("%d X %d = %d \n", dan,i,dan*i);}}
		
}		
	//outline 이용 
	//window-show view-out line
	
	//================================================================
	//================================================================
	
	//중첩 반복문 기초1
	//12345	
	//12345
	//12345
	//12345
	public void ex11() {
		for(int x=1; x<5 ; x++){
			for(int i=1; i<=5; i++){
				System.out.print(i);
			}
			System.out.println(); //괄호 안의 식을 수행하고 줄 바꿈 (개행)
		}		
	}	
	
	//중첩 반복문 응용
	//구구단 2단부터 9단까지 모두 출력
	public void ex12() {
		for(int dan=2; dan<=9; dan++) {
			for(int i=1; i<=9;i++) {
				System.out.printf("%dX%d=%2d ",dan,i,dan*i);
			}        //%2d:정수가 출력될 칸을 2칸 확보하고 오른쪽 정렬하여 출력
			System.out.println();//개행
		}
	}
	//dan i
	//2	  1~9
	//3	  1~9 ... 	
	
	//2중 for문 예제1
	//1                              x 			i
	//12							 1			1~1
	//123							 2			1~2
	//1234							 3			1~3
	//								 4			1~4
	public void ex13() {
		for(int x=1;x<=4;x++) {
			for(int i=1;i<=x;i++) {	
				System.out.print(i);
			}			
			System.out.println();		
		}
	}		
	
	//2중 for문 예제2
	//4
	//43
	//432
	//4321
	public void ex14() {
		for(int x=4; x>0; x--){
			for(int y=4;y>=x;y--){
				System.out.print(y);
			}
			System.out.println();
		}
	}
//	for(int x=1; x<5; x++){
//		for(int y=4;y>=5-x;y--){
	
	
	//2중 for문 예제3
	//입력된 정수 : 4
	//4321
	//321
	//21
	//1
	public void ex15() {
		Scanner sc = new Scanner(System.in);
		System.out.print("입력된 정수 : ");
		int input = sc.nextInt();
			for(int x=input;x>0;x--) {
				for(int y=x; y>=1; y--) {
					System.out.print(y);					
				}
			System.out.println();	
			}		
	}		
	
	//2중 for문 예제4
	//*
	//**
	//***
	//****
	//*****
	
	//row:행 column:열
	public void ex16() {
		for(int row=1; row<=5; row++) {
			for(int col=1; col<=row; col++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	//2중 for문 예제5
	//합계 : sum  개수 : count
	//*count, %, for문을 이용한 검색
	//1부터 20사이의 3의 배수의 개수 출력
	public void ex17() {
		int sum=0;
		int count=0;//수를 셀 때는 0부터 1씩 증가시키면서 세는 것이 보통
		for(int i=1; i<=20; i++) {
			if(i%3==0) {
				System.out.print(i+" ");
				sum+=i;     //누적
				count++;	//1증가	
			}
		}
		System.out.println("\nsum : "+sum);		
		System.out.println("count : "+count);
	}		
	
	//2중 for문 예제6
	//1  2  3  4 
	//5  6  7  8             -> 3행 4열
	//9 10 11 12
	public void ex18() {		
		int count=1;		
		for(int row=1; row<=3; row++) {
			for(int col=1; col<=4; col++) {
				//System.out.printf("%3d",count);
				//count++;
				System.out.printf("%3d",count++);
				//후위 증감 연산을 이용해 출력 후 count값을 1증가시킨다.
			}
			System.out.println();
		}		
	}		
	
		
}