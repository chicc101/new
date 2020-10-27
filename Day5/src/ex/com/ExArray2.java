package ex.com;

import java.util.Scanner;

public class ExArray2 {

	public static void main(String[] args) {
		int[] arr = new int[5]; //5개의 인트형을 만들거야
		int sum = 0;
		Scanner scan = new Scanner(System.in);

		for (int i=0 ; i<5 ; i++) {
			System.out.println((i+1) + ".정수 입력 : ");
			arr[i] = scan.nextInt();}

		for (int i=0 ; i<5 ; i++) {
			sum = sum + arr[i] ;
		}
			System.out.println(sum);
	}

}
