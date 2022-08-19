package edu.kh.test.networkprogramming1;

import java.util.Scanner;

public class test11111 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("가위바위보 게임을 시작합니다");
		while (true) {
			System.out.println("가위바위보중 한 개를 입력하세요");
			String person = sc.next();
			int ran = (int) (Math.random() * 3);

			String com = null;

			switch (ran) {
			case 0:
				com = "가위";
				break;
			case 1:
				com = "바위";
				break;
			case 2:
				com = "보";
				break;
			}
			if (person.equals(com)) {
				System.out.println("비겼습니다.다시 시작합니다");

			} else {
				boolean win1 = person.equals("가위") && com.equals("보");
				boolean win2 = person.equals("바위") && com.equals("가위");
				boolean win3 = person.equals("보") && com.equals("바위");

				if (win1 || win2 || win3) {
					System.out.println("당신이 이겼습니다");
				} else {
					System.out.println("당신이 졌습니다");
				}

				break;
			}

		}
	}

}
