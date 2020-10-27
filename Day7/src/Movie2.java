
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
			System.out.println("원하시는 좌석번호를 입력하세요(종료는 -1): ");

			Scanner scan = new Scanner(System.in);
			int s = scan.nextInt();
			if(s == -1)
				break;
			if(a[s-1] == 0) {
				a[s-1] = 1;
				System.out.println("예약되었습니다.");
			}
			else {
				System.out.println("이미 예약된 자리입니다");

			}
		}

	}
}
