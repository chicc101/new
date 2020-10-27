package hanna.exarr;
import java.util.Scanner;

public class Sample1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int [] test ;
		test = new int[5];
		int sum = 0 ;
		
		
		
		for (int i=0 ; i<5 ; i++) {
			System.out.println((i+1) + ".정수 입력 : ");
			test[i] = scan.nextInt();}

		for (int i=0 ; i<5 ; i++) {
			sum = sum + test[i] ;
		}
			System.out.println(sum);
	}

}
