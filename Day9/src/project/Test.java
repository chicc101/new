

package project;
import java.util.Scanner;

public class Test {



	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String [] name = new String [3];
		int [] age = new int [3];
		String [] num = new String [3];

		String [] all = new String [3];
		int i = 0;
		int search = 0;

		for( i = 0 ; i<3; i++) {
			System.out.println(i+1 + ". �̸�, ����, ��ȭ��ȣ �Է��϶�");
			name[i] = scan.next();
			age[i] = scan.nextInt();
			num[i] = scan.next();

			all[i] = name[i] + " "+ age[i]+ " " + num[i];

		}
		System.out.println("�˻��Ͻ÷��� ���̸� �Է��Ͻÿ�");

		for( i = 0 ; i<3; i++) {


			search = scan.nextInt();
			if(search == age[i]) {
				System.out.print(all[i]); }
			else { System.out.println("�˻��������");}


		}
	}
}


