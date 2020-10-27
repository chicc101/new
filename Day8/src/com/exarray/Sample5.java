package com.exarray;
//Info in = new Info();

import java.util.Scanner;

class Info {
	String name = "비어있음";
	int age = 0;
	
	public Info() {
		System.out.println("생성자 : " + name + "," + age);
		input();//추가
		
	}
	
	void input() {
		Scanner scan = new Scanner(System.in);
		System.out.println("이름 입력 : ");
		name = scan.next();
		System.out.println("나이 입력 : ");
		age = scan.nextInt();
		print(); //추가
		
		
	}
	
	void print() {
		System.out.println("print():" + name + ", "+ age);
	}
}
class Sample5 {
	public static void main(String[] args) {
		 new Info();
	
	}
}
	