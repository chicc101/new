
import java.util.Scanner;

public class Movie3 {


	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int [] a = new int[10];
		int i = 0 ;

		for(;;) {
			for (i = 0 ; i < a.length ; i++ ) {

				System.out.print(i+1 + " ");}

			System.out.print("\n");

			for ( i = 0 ; i < a.length ;  i++) {

				

			System.out.print(a[i] + " "); }
			System.out.println("\n���ϴ� �¼��� �Է��ϼ���.");

			i = scan.nextInt();

			if(a[i-1] == 0)
			{
				a[i-1] = 1 ;
				
			System.out.println("����Ǿ����ϴ�.");
			}
			else {System.out.println("�̹� ����� �ڸ��Դϴ�.");
			}
		}



	}
}








