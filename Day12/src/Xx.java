import java.util.Scanner;
public class Xx {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int subject;
		String name;
		int sub [] = new int [3];
		String stu[] = new String[10];


		for(;;) {
		System.out.println("�޴��� ������ �ּ��� 1.���� ���� �� �̸� �Է� / 2.��� ��ȸ / 3.����");
		int menu ;
		menu = scan.nextInt();
		
			for(int i=0 ; i<3 ; i++) {

				if(menu == 1) {
					System.out.println("������ ������ �ּ��� 1.���� 2.���� 3.����");
					sub[i] = scan.nextInt();
					subject = sub[i];

					System.out.println("�̸��� �Է����ּ���");
					name = scan.next();
					stu[i] = name;  }


				if (menu == 2) {
					System.out.print(subject +"," + sub[i]); }

				if(menu == 3) {
					System.out.println("����Ǿ����ϴ�."); }
				scan.close();
			}
		}
	}
}
