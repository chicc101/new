
import java.util.Scanner;
public class Movie2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int[] a = new int [10];
		int i = 0 ;


		while (true) {


			for (i = 0 ; i<a.length; i++) 
				a[i] = i ;
			System.out.println("=====================");
			System.out.print(i+1 + " " );
			System.out.print("\n");

			for (i = 0 ; i<a.length; i++)
				System.out.print(a[i] + " ");

			System.out.println("\n==================");
			System.out.println("���Ͻô� �¼���ȣ�� �Է��ϼ���(����� -1): ");

			Scanner scan = new Scanner(System.in);
			int s = scan.nextInt();
			if(s == -1)
				break;
			if(a[s-1] == 0) {
				a[s-1] = 1;
				System.out.println("����Ǿ����ϴ�.");
			}
			else {
				System.out.println("�̹� ����� �ڸ��Դϴ�");

			}
		}

	}
}
