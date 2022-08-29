package edu.kh.test.networkprogramming1;

import java.util.Scanner;

//[요구사항]
//1. 사용자로 부터 가위 바위 보 중 하나의 문자열을 입력 받고, 난수를 발생시켜 랜덤하게 가위 바위 보 를 지정한다.
//2. 랜덤한 컴퓨터의 가위 바위 보 문자열과 입력한 문자열이 같으면 아래 실행 결과처럼 비겼다고 출력하고 가위 바위 보 게임을 반복한다.
//3 입력한 가위 바위 보 문자열이 컴퓨터의 랜덤한 가위 바위 보 문자열과 비교하여 가위 바위 보 게임의 룰 대로 이긴 경우 이겼다고 출력, 진 경우 졌다고 출력 후 종료
//정상 실행 결과 예시
//----------- 컴퓨터에게 지는 경우 -------------
//가위 바위 보 게임을 시작합니다.
//가위 바위 보 중 한 개를 입력하세요 : 가위
//당신은 가위를 냈습니다.
//컴퓨터는 바위를 냈습니다.
//당신이 졌습니다!
//-----------컴퓨터에게 이기는 경우 --------------
//가위 바위 보 게임을 시작합니다.
//가위 바위 보 중 한 개를 입력하세요 : 보
//당신은 보를 냈습니다.
//컴퓨터는 바위를 냈습니다.
//당신이 이겼습니다!
//-------- 컴퓨터와 비기는 경우 ------------
//가위 바위 보 게임을 시작합니다.
//가위 바위 보 중 한 개를 입력하세요 : 가위
//당신은 가위를 냈습니다.
//컴퓨터는 가위를 냈습니다.
//비겼습니다. 다시 시작합니다.
//가위 바위 보 중 한 개를 입력하세요 : <-- 출력하며 반복됨

public class Test1 {

	/**
	 * 가위바위보 게임
	 */
	public void test081701() {
		Scanner sc = new Scanner(System.in);
		System.out.println("가위 바위 보 게임을 시작합니다.");
		
		while(true) {
			System.out.print("가위 바위 보 중 한 개를 입력하세요 : ");
			
			String input=sc.next();
			
			int random=(int)(Math.random()*3);
			
			String com=null;
			
			switch(random) {
			case 0 :
				com="가위";
				break;
			case 1 :
				com="바위";
				break;
			case 2 :
				com="보";
				break;
			}
			System.out.println("당신은 "+input+"를 냈습니다.");
			System.out.println("컴퓨터는 "+com+"를 냈습니다.");
			
			if(input.equals(com)) {
				System.out.println("비겼습니다. 다시 시작합니다.\n");
			}else {
				boolean win1 =input.equals("가위")&&com.equals("보");
				boolean win2 =input.equals("바위")&&com.equals("가위");
				boolean win3 =input.equals("보")&&com.equals("바위");
				
				if(win1||win2||win3) {
					System.out.println("당신이 이겼습니다.");
				}else {
					System.out.println("당신이 졌습니다.");
				}
				break;
			}
		}
	}
	/**
	 * 입력한 수의 소수판별
	 */
	public void test0818ex1() {
		
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
	
		
	/**
	 * 입력한 수 n이하의 소수 모두 구하기
	 */
	public void test0818ex2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("0이상의 숫자를 입력하세요 : ");

		int n = sc.nextInt();

		if (n >= 0) {
			if (n == 0) {
				System.out.println("소수가 없습니다");
			} else {
				for (int i = 1; i <= n; i++) {
					int number = i;
					if (n < 2) {
						System.out.println("소수가 없습니다");
						continue;
					}
					if (i < 2) {
						continue;
					}

					boolean flag = true;
					for (int x = 2; x < number; x++) {
						if (number % x == 0) {
							flag = false;
							break;
						}

					}
					if (flag) {
						System.out.print(number + " ");
					}
				}
			}
		} else {
			System.out.println("숫자를 잘못 입력했습니다");
		}

	}

	/**
	 * 0 ~ N 까지 수 중 소수를 구하는 반복문 
	 */
	public void test0818ex3() {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		// 0 ~ N 까지 수 중 소수를 구하는 반복문        
		for(int i = 0; i <= N; i++) {
			make_prime(i);
		}
	}
	// 소수 생성 메소드 
	public static void make_prime(int number) {
		// 0 과 1 은 소수가 아니므로 종료
		if(number < 2) {
			return;
		}
		// 2 는 소수다
		if(number == 2) {
			System.out.println(number);
			return;
		}
		for(int i = 2; i < number; i++) {
			// 소수가 아닐경우 종료
			if(number % i == 0) {
				return;
			}
		}
		// 위 반복문에서 약수를 갖고 있지 않는경우 소수다.
		System.out.println(number);
		return;
	}
 

}


