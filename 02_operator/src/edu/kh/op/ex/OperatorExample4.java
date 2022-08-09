package edu.kh.op.ex;

public class OperatorExample4 {

	public static void main(String[]args) {

	//논리 연산자 : &&(AND) , ||(OR)
		
	//&&(AND) 연산자 : 둘 다 true일 때만 true, 나머진 false
	//와, 그리고(이고), ~이면서(~면서), ~부터 ~까지, ~사이
	
	int a =101;
	//a는 100 이상 이면서 짝수인가?
	
	boolean result1 = a>= 100; //a는 100이상?
	boolean result2 = a%2==0;  //a는 짝수인가?
	
	System.out.println("a는 100 이상 이면서 짝수인가?" + (result1&&result2));
	//산술 연산자가 우선순위가 높아 괄호가 필요하다
	
	int b=5;
	//b는 1부터 10사이의 정수인가?
	
	boolean result3 = 1 <= b;    //b는 10이상인가?
	boolean result4 = b <= 10;   //b는 10이하인가?
	
	System.out.println("b는 1부터 10사이의 정수인가?" + (result3&&result4));
	
	//||(OR) 연산자 : 둘 다 false이면 false, 나머진 true
	//또는, ~거나, ~이거나 
	
	int c =10;
	//c는 홀수이거나 10을 초과한 숫자인가?

	System.out.print("c는 홀수이거나 10을 초과한 수인가?");
	System.out.println((c%2==1 || c>10 ));
	
	int d =20;
	//d는 1부터 100사이의 숫자 또는 음수인가?
	
	boolean result5 = (1<=d && d<=100) || (d<0);
	//&&가 ||보다 우선순위 높음 
	
	System.out.println(result5);

	//논리 부정 연산자 : !(NOT)
	//논리 값을 반대로 바꾸는 연산자
	System.out.println("!result5 : " + !result5);  //!true = false
	
	int e=3;
			
	boolean result6 = e>=1 && e<5;  
	//e는 1이상 5미만 인가?
	//e는 1미만 또는 5이상인가
	boolean result7= e<1 || e>=5;
	//result6과 result7은 서로 반대
	System.out.println(!result6==result7);
	}
}