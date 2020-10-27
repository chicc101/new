import java.util.Scanner;
public class SampleExample {

	public static void main(String[] args) {
		int menu;
		int sbj;
		Scanner scan = new Scanner(System.in);
		Sample d = new Sample();

		for(;;) {

			System.out.println("메뉴를 선택하라 : 1.입력 2.호출 3.종료");
			menu = scan.nextInt();
			
			if (menu == 1) {
				System.out.println("과목을 선택하라 : 1.수학 2.과학 3.영어");
				sbj = scan.nextInt();
				if (sbj == 1 ) {
					d.math();
				}
				if (sbj == 2 ) {
					d.science();
				}
				if (sbj == 3 ) {
					d.eng();
				}

			}
			if (menu == 2) {
				System.out.println("호출 과목을 선택하라 : 1.수학 2.과학 3.영어");
				sbj = scan.nextInt();
				if (sbj == 1 ) {
					d.mathAll();
				}
				if (sbj == 2 ) {
					d.ScienceAll();
				}
				if (sbj == 3 ) {
					d.engAll();
				}

			}
			if (menu == 3) {
				System.out.println("프로그램종료");
				break;

			}
			
		}
	}
}