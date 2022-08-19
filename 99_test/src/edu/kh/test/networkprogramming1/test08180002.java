package edu.kh.test.networkprogramming1;
import java.util.Scanner;
public class test08180002 {

		public static void main(String[] args) {
	 
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

