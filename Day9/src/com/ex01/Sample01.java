package com.ex01;

class Test{
	
	private String name = "�������";
	int age = -1;
	
	void setName(String n) {
		 name = n;
		 
	}
	public Test() {
		System.out.println("Test()������ ����");
		
	}

	void print () {
		System.out.println("name" + "," + age);
	
	}
}
public class Sample01 {
	public static void main(String[] args) {
		Data d = new Data();
		d.setAge(35);
		d.setName("���ѳ�");
		d.name = "�̹ο�";
		d.age = 20;
		System.out.println(d.getAge());
		System.out.println(d.getName());
		Test t = new Test();
		t.print();
		//t.name = "�̹ο�";
		t.setName("�̹ο�");
		t.age = 35 ;
		t.print();
		
	}

}
