package edu.kh.variable.ex1;

public class VariableExample4 {

	public static void main(String[]args) {
		
		/* 형변환 (Casting) : 값의 자료형을 변환하는 것
		 * 
		 * 형변환은 왜 필요한가? 
		 * -> 컴퓨터의 값 처리 원칙을 위배하는 경우 해결하기 위해
		 * 
		 *  자동 형변환
		 *  -자료형의 [값의 범위]가 서로 다른 두 값의 연산 시 
		 *  
		 *  [컴파일러]가 자동으로 [값의 범위]가 작은 자료형을 큰 자료형으로 변환
		 * */
		
		// 자동 형변환 확인 1)
        int num1 = 10;
		long num2 = 100l;
		System.out.println("num1+num2 = " + (num1 + num2));
		
		// 자동 형변환 확인 2)
		int num3 = 300;
		double num4 = 1.1;
		
		System.out.println(num3+num4);
		
		//int result = num3 + num4;
					//300 + 1.1 
					//300.0 + 1.1 -> 301.1
		 			//double + double -> double
		double result = num3 + num4;
		
		//Type mismatch: cannot convert from double to int
		
		System.out.println(result);
		
		//자동 형변환 확인 3)
		// char -> int 자동 형변환
		
		int num5 = 'a'; //대입도 연산이다
		//int = char
		
		System.out.println(num5);
		
		char ch = 97; // 형 변환 예외 상황(큰 쪽이 작은쪽으로 자동 형변환)
		
		System.out.println("ch:" + ch);
		
		char ch2 = 'ㄱ';
		int result2 = ch2;
				
		System.out.println(ch2 + "Unicode Number : " + result2);
		
		System.out.println("--------------------------------------");
		
		System.out.println("***강제 형변환***");
		
		double temp = 3.14;
		int result3 = (int)temp;       //큰 자료형을 작은 자료형으로 강제 형변환
		
		System.out.println(result3);   //소수점 버림 처리
        
		int temp2 =290;
		byte result4 = (byte)temp2;    //int -> byte 강제 형변환
		
		System.out.println("result4 : "+result4);
		
		//강제 형변환의 다른 사용 예시
		
		// ** 강제 형변환은 값의 범위 관계 없이 원하는 자료형으로 변환 가능**
		
		int iNum1 = 1;
		int iNum2 = 2;
		
		System.out.println(iNum1/iNum2);         // 1/2 = 0.5
		                                         // int/int = int 소수점 버림
		
		System.out.println((double)iNum1/iNum2); // 1.0/2 -> 1.0/2.0 =0.5
		                                         // double/int = double
				 								 //      -> double
		
		System.out.println((char)65);           //int -> char 강제 형변환
		System.out.println((int)'A');			//char-> int  강제 형변환
		
		
	}
}