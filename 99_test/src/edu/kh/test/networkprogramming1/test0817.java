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

public class test0817 {

	public static void main(String[]args) {
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
	
}


