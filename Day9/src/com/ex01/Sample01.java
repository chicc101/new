package com.ex01;

class Test{
	
	private String name = "비어있음";
	int age = -1;
	
	void setName(String n) {
		 name = n;
		 
	}
	public Test() {
		System.out.println("Test()생성자 시작");
		
	}

	void print () {
		System.out.println("name" + "," + age);
	
	}
}
public class Sample01 {
	public static void main(String[] args) {
		Data d = new Data();
		d.setAge(35);
		d.setName("이한나");
		d.name = "이민영";
		d.age = 20;
		System.out.println(d.getAge());
		System.out.println(d.getName());
		Test t = new Test();
		t.print();
		//t.name = "이민영";
		t.setName("이민영");
		t.age = 35 ;
		t.print();
		
	}

}
