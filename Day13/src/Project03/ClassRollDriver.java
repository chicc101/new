package Project03;
import java.util.Scanner;

public class ClassRollDriver {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		int choice; //사용자 선택
		String coursename; //교과목명
		String name; //이름
		int number; //학번
		Student student; //Student 객체 참조변수

		ClassRoll sbook = new ClassRoll();
		System.out.println("교과목명을 입력하세요 :");
		coursename = scan.next();
		sbook.coursename = coursename;

		do {//실행문
			System.out.println("원하는 연산을 선택하세요 : "); System.out.println("(1) 추가");
			System.out.println("(2) 찾기"); System.out.println("(3) 종료");
			choice = scan.nextInt();
			if (choice == 1) {
				System.out.println("추가하는 학생의 학번을 입력하세요 : ");
				number = scan.nextInt();
				System.out.println("추가하는 학생의 학번을 입력하세요 : ");
				name = scan.next();
				student = new Student(number, name);
				sbook.add(student);
			}
			else if (choice == 2) {
				//찾는 학생의 학번을 입력 받은 후 그 학생의 이름을 출력한다.
			} 
		} while (choice != 3); //조건문
	}
}
