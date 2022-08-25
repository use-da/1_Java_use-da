package edu.kh.collection.model.service;

import java.util.HashSet;
import java.util.Set;

public class SetService {

	/* Set(집합)
	 * 순서를 유지하지 않음(인덱스x)
	 * 중복 데이터 저장 불가(null도 1개만 저장 가능)
	 * 
	 * 
	 * */
	
	public void ex1() {
		Set<String>set=new HashSet<String>();
		
		set.add("네이버");
		set.add("카카오");
		set.add("라인");
		set.add("쿠팡");
		set.add("배달의민족");
		set.add("당근마켓");
		set.add("토스");
		set.add("직방");
		set.add("야놀자");
		set.add("야놀자");
		set.add("야놀자");
		set.add("야놀자");
		set.add("야놀자");
		set.add("야놀자");
		set.add("null");
		set.add("null");
		set.add("null");
		
		//remove(Object value) : Set에 저장된 객체 중 value가 같은 객체 제거
		//->boolean반환 : 제거되면 true 안되면 false
		set.remove("직방");
		
		System.out.println(set/*.toString()*/);
	}
	
}
