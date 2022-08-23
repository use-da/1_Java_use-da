package edu.kh.inheritance.model.vo;

public class Person extends Object{  
	//extends Object->상속 구문이 작성되지 않으면 컴파일러가 자동 추가
	private String name;
	private int age;
	
	
	// ctrl+space bar+enter
	
	public Person() { }

	// alt + shift+ s -> o
	// Generate Constructor Using Fields...
	
	public Person(String name, int age) {
		this.name=name;
		this.age=age;
		
	}
	
	
	

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void introduce() {
		System.out.println("이름 : "+name);
		System.out.println("나이 : "+age);

		
	}
}
