package edu.kh.inheritance.model.vo;

public class Person {

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
}
