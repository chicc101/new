package src.com.chap04;

class Info {
	String name;
	int age;

	public Info() {
		this("test",11); //tihs(); ���� �����ڸ� ����Ű�°� 
		name = "�ʱⰪ";	age = -1;
		System.out.println("������()�����Ϸ�");
	}

	public Info(String n, int a) {
		 //this();
		name = n;	age = a;
		System.out.println("������(Str, int) �����Ϸ�");
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

