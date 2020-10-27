
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
			System.out.println("\n원하는 좌석을 입력하세요.");

			i = scan.nextInt();

			if(a[i-1] == 0)
			{
				a[i-1] = 1 ;
				
			System.out.println("예약되었습니다.");
			}
			else {System.out.println("이미 예약된 자리입니다.");
			}
		}



	}
}








