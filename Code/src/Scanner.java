import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int [] num = new int[5];
		int sum = 0;


		System.out.println("5���� ������ �Է��ϼ���");
		for (int i=0; i<num.length; i++) {
			System.out.print((i+1) +"�� ����� �Է��ϼ��� ");
			num[i] = scan.nextInt();
			sum += num[i];

		}

		double avg = (double) sum / num.length;
		System.out.println("����� " + sum/num.length);
		scan.close();

	}

}



