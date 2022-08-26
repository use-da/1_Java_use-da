package edu.kh.collection.model.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import edu.kh.collection.model.vo.Student;

public class MapService {

	//Map : key와 value 한 쌍이 데이터가 되어 이를 모아둔 객체
	//-key : Map에 저장된 데이터를 구분하는 용도 -> Set의 특징을 지님(순서x, 중복x, equals(), hashCode()오버라이딩 필요)
	//-value : Map에 실제 저장된 값을 의지 -> List의 특징을 지님(중복o)
	
	public void ex1() {
		Map<Integer, String>map=new HashMap<Integer,String>();
		
		//Map.put(k,v) : Map에 추가
		map.put(1, "홍길동");
		map.put(2, "고길동");
		map.put(3, "김길동");
		map.put(4, "이길동");
		map.put(5, "박길동");
		map.put(6, "최길동");
		
		//key중복 ->value값을 덮어쓴다
		map.put(1,"홍홍홍");
		
		//value중복 o
		map.put(7, "최길동");
		
		System.out.println(map);
		
	}
	
	public void ex2() {
		//Map은 언제 사용하면 좋은가?
		//1) 재사용이 적은 VO를 대체하는 경우
		//2) 한 번에 다량의 데이터를 전달하는 경우 데이터의 명확한 구분을 위해서 사용
		
		//Student ->Map으로 변경해서 사용
		
		Student std=new Student();
		Map<String, Object> student=new HashMap<String,Object>();
		
		//값 추가
		std.setName("홍길동");
		student.put("name", "홍길동");
		
		std.setAge(15);
		student.put("age",15);
		
		std.setAddress("서울시 중구");
		student.put("address","서울시 중구");
		
		std.setGender('남');
		student.put("gender",'남');
		
		std.setScore(100);
		student.put("score",100);
		
		System.out.println(std);
		System.out.println(student);
		
		//value각각 얻어와서 출력하기
		//std
		System.out.println(std.getName());
		System.out.println(std.getAge());
		System.out.println(std.getAddress());
		System.out.println(std.getGender());
		System.out.println(std.getScore());
		
		System.out.println("--------------------");
		
		//student(map)
//		System.out.println(student.get("name"));
//		System.out.println(student.get("age"));
//		System.out.println(student.get("address"));
//		System.out.println(student.get("gender"));
//		System.out.println(student.get("score"));	
		
		//keySet() : Map에서 key부분만을 추출해 Set형태로 반환
		for(String key:student.keySet()) System.out.println(student.get(key));
						//Set<String>
		//for문, while문, if문 작성시 { } 없다면 다음 한 줄(다음 세미콜론까지)에만 영향을 미친다.
		
	}
	
	public void ex3() {
		Map<String,Set<Integer>> map=new TreeMap<>(); 
		//타입 추론 : 참조변수의 제네릭을 보고 생성되는 컬렉션 객체의 제네릭을 추측
		
		Scanner sc= new Scanner(System.in);
		
		System.out.print("횟수 입력 : ");
		int count=sc.nextInt();
		
		for(int i=1; i<=count;i++) {
			//TreeSet을 이용한 로또번호 생성
			Set<Integer>lotto=new TreeSet<>();
			
			while(lotto.size()<6) {
				
				int ran=(int)(Math.random()*45+1);
				lotto.add(ran);		
			}
			map.put(i+"회", lotto);
		}
		//출력
		for( String key : map.keySet()) {
			System.out.println(key + " : " +map.get(key));
		}
		
		
		
		
	}
	
}
