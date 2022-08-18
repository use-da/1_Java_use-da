package edu.kh.test.networkprogramming;

import java.util.Scanner;

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


