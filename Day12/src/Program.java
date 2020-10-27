import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String [] sbj = new String [3];
		String [] stu = new String [10];

		int choice;


		System.out.println("1과목을 입력해 주세요.");
		sbj[0] = scan.next();
		System.out.println("2과목을 입력해 주세요.");
		sbj[1] = scan.next();
		System.out.println("3과목을 입력해 주세요.");
		sbj[2] = scan.next();

		for(;;) {

			System.out.println("원하는 작업을 입력하세요");
			System.out.println("1.학생 이름 입력");
			System.out.println("2.학생 목록 표시");
			System.out.println("3.종료");


			if (choice == 1) {

				System.out.println("이름을 입력해주세요");




			}
		}








	}

}


