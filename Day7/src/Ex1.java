import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int [] num = new int[5];
		int max = 0;


		System.out.println("��� 5���� �Է��ϼ���");
		for (int i=0; i<5; i++) {
			System.out.print((i+1) +"�� ����� �Է��ϼ��� ");
			num[i] = scan.nextInt();
			if(num[i]>max) {
				max = num[i]; }
		}

		System.out.println("���� ū ����� " + max + "�Դϴ�.");
		scan.close();

	}

}



