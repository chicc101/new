import java.util.Scanner;
public class SampleExample {

	public static void main(String[] args) {
		int menu;
		int sbj;
		Scanner scan = new Scanner(System.in);
		Sample d = new Sample();

		for(;;) {

			System.out.println("�޴��� �����϶� : 1.�Է� 2.ȣ�� 3.����");
			menu = scan.nextInt();
			
			if (menu == 1) {
				System.out.println("������ �����϶� : 1.���� 2.���� 3.����");
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
				System.out.println("ȣ�� ������ �����϶� : 1.���� 2.���� 3.����");
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
				System.out.println("���α׷�����");
				break;

			}
			
		}
	}
}