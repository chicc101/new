import java.util.Scanner;


public class StudentExample {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		Student t;
		t = new Student();
		
		System.out.println("�̸� : ");
		t.name = keyboard.next();
		System.out.println("�й� : ");
		t.rollno = keyboard.nextInt();
		System.out.println("���� : ");
		t.age = keyboard.nextInt();
		
		System.out.println("�̸��� : " + t.name + " �й��� : " + t.rollno + " ���̴� " + t.age);
		
		
		
		
		
		
	}

}
