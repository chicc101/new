package Project02;
import java.util.Scanner;

public class Student {
	//Student 클래스 필드
	String name; 
	int classNumber = -1;

	//메인 메소드
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); //스캐너 받을거야

		String[] subject = new String[3]; //subject라는 배열 3개 만들거야
		subject[0] = "java";
		subject[1] = "python";
		subject[2] = "c++";

		Student[] stu = new Student[10]; //stu라는 클래스 배열 10개 만들거야


		int menu = 1; 
		int i = 0;

		while(true) {


			System.out.println("1. 학생 이름 추가");
			System.out.println("2. 학생 목록 표시");
			System.out.println("3. 프로그램 종료");

			menu = scan.nextInt();

			if(menu == 1) {

				System.out.println("과목을 입력하세요. ");
				String subject1 = scan.next();

				if(subject1.equals(subject[0])) {
					for(i=0; i<3; i++) {
						System.out.println("학생 이름을 추가해주세요.");
						stu[i] = new Student();
						stu[i].name = scan.next();
						stu[i].classNumber = 0;
					}
				}

				if(subject1.equals(subject[1])) {
					for(i=0; i<3; i++) {
						System.out.println("학생 이름을 추가해주세요.");
						stu[i] = new Student();
						stu[i].name = scan.next();
						stu[i].classNumber = 1;
					}
				}
				if(subject1.equals(subject[2])) {
					for(i=0; i<3; i++) {
						System.out.println("학생 이름을 추가해주세요.");
						stu[i] = new Student();
						stu[i].name = scan.next();
						stu[i].classNumber = 2;
					}
					i++; //학생 한명 추가 완료
				}

				if(menu == 2) {
					System.out.println("과목을 입력하세요. ");
					String subject1 = scan.next();
					for(i=0; i<3; i++) {
						if(subject1.equals(subject))
							System.out.println(stu[i].name);   
					}
				}

				if(menu == 3) {
					System.out.println("프로그램 종료");
				}
			}
		}

	}
}
