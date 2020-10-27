package com.exmethod;

class Test {//멤버필드

	String[] string = new String[3];
	public Test() { //생성자
		
		string [0] = "hello";
		string [1] = "java";
		string [2] = "world";
		print();
		}

	void print() {//출력
		for (int i = 0 ; i < string.length ; i++) 
		{
			System.out.println(string[i]); }
	}
}

public class Sample6
{
	public static void main(String[] args)
	{
		
		 new Test();
		//t.print();
	}
}


