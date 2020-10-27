package com.ex01;

public class Data {
	private String name;
	private int age;

	public Data() {
		System.out.println("Data 클래스 생성자 동작");
		System.out.println(getName());
	}

	private String getName() {
	return name;
}


public void setName(String name) {
	this.name = name;
}


public int getAge() {
	return age;
}


public void setAge(int age) {
	this.age = age;
}


	public static void main(String[] args) {

	}

}
