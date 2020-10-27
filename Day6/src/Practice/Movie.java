package Practice;

import java.util.Scanner;

public class Movie {

	public static void main(String[] args) {
		
		int[] seat = new int [10];
		Scanner in = new Scanner(System.in);
		int i ;
		
		System.out.println(" LAB : 극장 예약 시스템 ");
		for(i=0 ; i<10 ; i++) {
			
		System.out.println("--------------------");
		System.out.println("1 2 3 4 5 6 7 8 9 10");
		System.out.println("--------------------");
		System.out.println("0 0 0 0 0 0 0 0 0 0");
		System.out.print("원하시는 좌석번호를 입력하세요 (종료는 -1) : ");
	
		seat [i] = in.nextInt();
		System.out.println(seat [i] + "번 자리가 예약되었습니다.");
		
		System.out.println("--------------------");
		System.out.println("1 2 3 4 5 6 7 8 9 10");
		System.out.println("--------------------"); 
		System.out.println("0 0 0 0 0 0 0 0 0 0");

		
	}

}
