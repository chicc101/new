package src.com.chap04;

class Info {
	String name;
	int age;

	public Info() {
		this("test",11); //tihs(); 나의 생성자를 가르키는것 
		name = "초기값";	age = -1;
		System.out.println("생성자()생성완료");
	}

	public Info(String n, int a) {
		 //this();
		name = n;	age = a;
		System.out.println("생성자(Str, int) 생성완료");
	}

	void print() {
		System.out.println(name);
		System.out.println(age);
	}
}

public class Ex32 {
	public static void main(String[] args) {
		Info in = new Info();
		in.print();

		Info fo = new Info();
		fo.print();
	}
}

