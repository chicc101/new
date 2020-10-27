package Practice;
import java.util.Scanner;


public class Movie2 {
	static int seat[] = new int [10];
	static int reserved;
	

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		while(true) {
			System.out.print("좌석을 예약하시겠습니까? (1또는 0)");
			int q = input.nextInt();
			
			if (q == 0) break;
			System.out.println("현재의 예약상태는 다음과 같습니다.");
			System.out.println("==========================");
			for (int i = 0; i<10 ; i++) {
				System.out.prinln();
				for (int i : seat)
					System.out.print(i + "");
				
				System.out.println();
				System.out.println("몇 번째 좌석을 예약하시겠습니까?");
				reserved = input.nextInt();
				
				seat [reserved - 1] = 1;
				System.out.println("예약되었습니다.");
			}
			System.out.println("프로그램을 종료합니다.");
			intput.close();
		
 		}
		
		

	}

}
