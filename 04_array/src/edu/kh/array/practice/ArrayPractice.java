package edu.kh.array.practice;

import java.util.Scanner;

public class ArrayPractice {
	Scanner sc = new Scanner(System.in);

	
	
	
//	길이가 9인 배열을 선언 및 할당하고, 1부터 9까지의 값을 반복문을 이용하여
//	순서대로 배열의 각 인덱스 요소에 대입하고 출력한 후
//	짝수 번째 인덱스 값의 합을 출력하세요. (0 번째 인덱스는 짝수로 취급)
	public void practice1() {
		int[]arr= new int[9];
		
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			arr[i]=i+1;
			System.out.print(arr[i]+" ");
			
			if(arr[i]%2!=0) {
			sum+=arr[i];
			}
		
		}
		System.out.println("\n짝수 번째 인덱스 합 : "+sum);
	}
	//practice 1,2 조건문이 이해가 안됨
	
	
	
	
//	길이가 9인 배열을 선언 및 할당하고, 9부터 1까지의 값을 반복문을 이용하여
//	순서대로 배열의 각 인덱스 요소에 대입하고 출력한 후
//	홀수 번째 인덱스 값의 합을 출력하세요. (0 번째 인덱스는 짝수로 취급)
	public void practice2() {
		int[]arr= new int[9];
		
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			arr[i]=arr.length-i;
			System.out.print(arr[i]+" ");
			
			if(arr[i]%2==0) {
			sum+=arr[i];
			}
		}
		System.out.println("\n 홀수 번째 인덱스 합 : "+sum);
		
	}
	
	
//	사용자에게 입력 받은 양의 정수만큼 배열 크기를 할당하고
//	1부터 입력 받은 값까지 배열에 초기화한 후 출력하세요
	public void practice3() {
		System.out.print("양의 정수 : ");
		int num=sc.nextInt();
		int[]arr=new int[num];
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(i+1+" ");
		}
		
	}

	
//	정수 5개를 입력 받아 배열을 초기화 하고
//	검색할 정수를 하나 입력 받아 배열에서 같은 수가 있는 인덱스를 찾아 출력.
//	배열에 같은 수가 없을 경우 “일치하는 값이 존재하지 않습니다“ 출력
	public void practice4() {
	//-----몰랐던거-------------------------------
		int[]arr=new int[5];
		for(int i=0;i<arr.length;i++) {
			System.out.printf("입력%d : ", i);
			arr[i]=sc.nextInt();
			
		}
	//------------------------------------------	
		System.out.println("검색할 값 : ");
		int search=sc.nextInt();
		
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
	
//	문자열을 입력 받아 문자 하나 하나를 char배열에 대입하고
//	검색할 문자가 문자열에 몇 개 들어가 있는지, 몇 번째 인덱스에 위치하는지 인덱스를 출력하세요.
	public void practice5() {
		
		System.out.println("문자열 : ");
		String str=sc.next();
		
		//----------몰랐던거------------
		
		// 사용자가 입력한 문자열(str)을 문자 하나하나를 char배열에 넣기
		char[]arr=new char[str.length()];
		
		//반복문을 통해 str.charAt(i)값을 arr[i]에 담는 과정
		for(int i=0;i<arr.length;i++) {
			arr[i]=str.charAt(i);
		}
		
		System.out.print("문자 : ");
		char ch=sc.nextLine().charAt(0);
		
		  // 3. 검색할 문자가 문자열에 몇개가 들어있는지와 어느 인덱스에 있는지 파악

        int count = 0;    // 검색할 문자가 문자열에 몇개가 들어있는지를 세어줄 변수
        // 문자열에서 동일한 문자가 발생할 때마다 1씩 증가

        // 반복문 수행전 문자열 출력
        System.out.print(str + "에 " + ch + "가 존재하는 위치(인덱스) : ");

        // 인덱스마다 접근하기 위해 반복문 사용
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == ch) { // 해당 인덱스 값이 검색될 문자와 같을 경우
                System.out.print(i + " ");    // 해당 인덱스 이어서 출력

                count++;    // 그리고 count 1증가
            }
        }

        // 위에서 print()를 사용했기 때문에 개행이 되어있지 않음
        System.out.println();    // 줄바꿈

        System.out.println(ch + "개수 : " + count);
	//----------------------------------------------------------	
	}
	
	
//	사용자가 배열의 길이를 직접 입력하여 그 값만큼 정수형 배열을 선언 및 할당하고
//	배열의 크기만큼 사용자가 직접 값을 입력하여 각각의 인덱스에 값을 초기화 하세요.
//	그리고 배열 전체 값을 나열하고 각 인덱스에 저장된 값들의 합을 출력하세요.
	public void practice6() {
		int num=sc.nextInt();
		int[]arr=new int [num];
		System.out.println("정수 : "+num);
		
		
	}
	
//	주민등록번호를 입력 받아 char 배열에 저장한 후 출력하세요.
//	단, char 배열 저장 시 성별을 나타내는 숫자 이후부터 *로 저장하세요.
	public void pratice7() {}
	
	
//	3이상인 홀수를 입력 받아 배열의 중간까지는 1부터 1씩 증가하여 오름차순으로 값을 넣고,
//	중간 이후부터 끝까지는 1씩 감소하여 내림차순으로 값을 넣어 출력하세요.
//	단, 입력한 정수가 홀수가 아니거나 3 미만일 경우 “다시 입력하세요”를 출력하고
//	다시 정수를 받도록 하세요
	public void pratice8() {}
	
//	10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고,
//	1~10 사이의 난수를 발생시켜 배열에 초기화한 후 출력하세요
	public void pratice9() {}
	
//	10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고,
//	1~10 사이의 난수를 발생시켜 배열에 초기화 후
//	배열 전체 값과 그 값 중에서 최대값과 최소값을 출력하세요
	public void pratice10() {}
	
	
//	10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고
//	1~10 사이의 난수를 발생시켜 중복된 값이 없게 배열에 초기화한 후 출력하세요
	public void pratice11() {}

	
//	로또 번호 자동 생성기 프로그램을 만들기.
//	(중복 값 없이 오름차순으로 정렬하여 출력하세요.)
	public void pratice12() {}
	
//	문자열을 입력 받아 문자열에 어떤 문자가 들어갔는지 배열에 저장하고
//	문자의 개수와 함께 출력하세요. (중복 제거)
	public void pratice13() {}

//	사용자가 입력한 배열의 길이만큼의 String 배열을 선언 및 할당하고
//	배열의 인덱스에 넣을 값 역시 사용자가 입력하여 초기화 하세요.
//	단, 사용자에게 배열에 값을 더 넣을지 물어보고 몇 개를 더 입력할 건지,
//	늘린 곳에 어떤 데이터를 넣을 것인지 받으세요.
//	사용자가 더 이상 입력하지 않겠다고 하면 배열 전체 값을 출력하세요.
//	(배열의 얕은 복사, 깊은 복사를 이용하는 문제)
//	얕은 복사 : 배열의 시작 주소만을 복사하여 두 참조 변수가 하나의 배열을 참조.
//	깊은 복사 : 원본 배열이 가지고 있는 데이터를 그대로 복사한 새로운 배열 (복제)
//	 tip : 깊은 복사를 위한 새로운 배열은 꼭 원본 배열과 같은 크기일 필요는 없다!

	public void pratice14() {}
	
//	3행 3열짜리 문자열 배열을 선언 및 할당하고
//	인덱스 0행 0열부터 2행 2열까지 차례대로 접근하여 “(0, 0)”과 같은 형식으로 저장 후 출력하세요.
	public void pratice15() {}

//	4행 4열짜리 정수형 배열을 선언 및 할당하고
//	1) 1 ~ 16까지 값을 차례대로 저장하세요.
//	2) 저장된 값들을 차례대로 출력하세요.
	public void pratice16() {}

//	4행 4열짜리 정수형 배열을 선언 및 할당하고
//	1) 16 ~ 1과 같이 값을 거꾸로 저장하세요.
//	2) 저장된 값들을 차례대로 출력하세요.
	public void pratice17() {}
	
//	4행 4열 2차원 배열을 생성하여 0행 0열부터 2행 2열까지는 1~10까지의 임의의 정수 값 저장 후
//	아래의 내용처럼 처리하세요.
	public void pratice18() {}

//	2차원 배열의 행과 열의 크기를 사용자에게 직접 입력받되, 1~10사이 숫자가 아니면
//	“반드시 1~10 사이의 정수를 입력해야 합니다.” 출력 후 다시 정수를 받게 하세요.
//	크기가 정해진 이차원 배열 안에는 영어 대문자가 랜덤으로 들어가게 한 뒤 출력하세요.
//	(char형은 숫자를 더해서 문자를 표현할 수 있고 65는 A를 나타냄, 알파벳은 총 26글자)
	public void pratice19() {}
	
//	사용자에게 행의 크기를 입력 받고 그 수만큼의 반복을 통해 열의 크기도 받아
//	문자형 가변 배열을 선언 및 할당하세요.
//	그리고 각 인덱스에 ‘a’부터 총 인덱스의 개수만큼 하나씩 늘려 저장하고 출력하세요.
	public void pratice20() {}

//	1차원 문자열 배열에 학생 이름 초기화되어 있다.
//	3행 2열 짜리 2차원 문자열 배열 2개를 새로 선언 및 할당하여
//	학생 이름을 2차원 배열에 순서대로 저장하고 아래와 같이 출력하시오.
//	(첫 번째 2차원 배열이 모두 저장된 경우 두 번째 2차원 배열에 저장 진행)
//	String[] students = {"강건강", "남나나", "도대담", "류라라", "문미미", "박보배", 
//	"송성실", "윤예의", "진재주", "차천축", "피풍표", "홍하하"};
	public void pratice21() {}

//	위 문제에서 자리 배치한 것을 가지고 학생 이름을 검색하여
//	해당 학생이 어느 자리에 앉았는지 출력하세요.
	public void pratice22() {}
	
//	String 2차원 배열 6행 6열을 만들고 행의 맨 위와 제일 앞 열은 각 인덱스를 저장하세요.
//	그리고 사용자에게 행과 열을 입력 받아 해당 좌표의 값을 “X”로 변환해 2차원 배열을 출력하세요
	public void pratice23() {}

//	실습문제9와 내용은 같으나 행 입력 시 99가 입력되지 않으면 무한 반복이 되도록 구현하세요.
	public void pratice24() {}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
