package edu.kh.oop.constructor.model.vo;

public class Member {

	// 추상화 -> 아이디, 비밀번호, 전화번호, 나이
	
	// 캡슐화 -> 추상화 결과를 묶고 데이터 직접 접근 제한
	private String memberId;
	private String memberPw;
	private String memberPhone;
	private int memberAge;
	
	//생성자(객체를 생성할 때 사용하는 기능)
	//생성자 작성 규칙1 클래스명==생성자명
	//생성자 작성 규칙2 반환형x
	
	//기본 생성자 : ( ) 내에 아무것도 없는 생성자
	public Member() {
		
		//생성자 사용 목적 1. 필드 초기화
		memberId="member01";
		memberPw="pass01!";
		memberPhone="010-1234-1234";
		memberAge=25;
		
		//생성자 사용 목적 2. 객체 생성 시 특정 기능 수행
		System.out.println("Member 객체가 생성 되었습니다.");
		
		//한 번 만들어둔 생성자를 계속 재사용
		//->코드길이 감소, 재사용성 증가
	}
	 //기본 생성자가 없어도 Member() 구문에서 에러가 발생하지 않는다
	 //-> 클래스에 생성자가 하나도 작성되지 않으면
	 //   컴파일러가 자동으로 기본생성자를 추가해준다
	 //public Member(){} //Member클래스에 자동 추가
	 
	
	//매개변수 생성자
	public Member(String memberId, String memberPw, String memberPhone, int memberAge) {
		         //매개 변수(Parameter)
				 //*매개 : 둘 사이에 관계 형성
		
		System.out.println(memberId);
		System.out.println(memberPw);
		System.out.println(memberPhone);
		System.out.println(memberAge);
	}
	
	//오버로딩(OverLoading, 과적)
	//    *loading : SSD, HDD에 있는 데이터를 RAM으로 옮김
	//->이름 하나로 여러 기능을 수행할 수 있게 하는 것
	//==동일한 메서드(또는 생성자)명으로 여러 메서드를 작성하는 것
	
	//오버로딩의 조건
	//1. 메서드(생성자) 이름이 같아야 한다.
	//2. 매개변수가 타입, 개수, 순서 중 하나라도 달라야 한다.
	
	public Member(String memberId, String memberPw) {
		//매개변수 개수가 달라서 오버로딩 성립
		
	}
	//**오버로딩 주의사항**
	//매개변수의 자료형의 타입,개수,순서 중 하나라도 달라야한다.
	//매개변수명은 사용자가 보기 편하게 하기위해 의미를 부여하는 것 뿐 
	//컴퓨터한테는 불필요한 요소라서 오버로딩 검사 시 인식되지 않음
//	public Member(String memberPw,String memberId) {}
	       //Duplicate method Member(String, String) in type Member
	
	
	//메서드(기능)
}
