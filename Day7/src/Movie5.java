
import java.util.Scanner;

public class Movie5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int [] seat = new int [10];
		int i = 0;

		for(;;) {
			for(i=0 ; i<seat.length; i++) {

				System.out.print(i+1 + " ");}

			System.out.print("\n");

			for(i=0 ; i<seat.length; i++) {

				System.out.print(seat[i] + " ");}

			System.out.print("\n");
			System.out.print("원하시는 좌석번호를 입력하세요(종료는-1) : ");

			i = scan.nextInt();

			if( seat[i-1] == 0) {
				seat[i-1] = 1; 
				System.out.println("예약되었습니다.");
			}





		}

	}

}




