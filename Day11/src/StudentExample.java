import java.util.Scanner;


public class StudentExample {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		Student t;
		t = new Student();
		
		System.out.println("이름 : ");
		t.name = keyboard.next();
		System.out.println("학번 : ");
		t.rollno = keyboard.nextInt();
		System.out.println("나이 : ");
		t.age = keyboard.nextInt();
		
		System.out.println("이름은 : " + t.name + " 학번은 : " + t.rollno + " 나이는 " + t.age);
		
		
		
		
		
		
	}

}
