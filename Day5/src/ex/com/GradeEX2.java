package ex.com;
import java.util.Scanner;

public class GradeEX2 {

	public static void main(String[] args) {
		
		int[] arr = new int[5];
		int sum=0;

		Scanner scan = new Scanner(System.in);
		System.out.print("정수 다섯개를 입력하세요");

		for (int i=0 ; i<5 ; i++) {
			arr[i] = scan.nextInt();
			if(arr[i] > 100) {
				System.out.println("잘못입력");
				i--;}
				continue;
			}
		

		for (int i=0 ; i<5 ; i++) {
			sum = sum+arr[i];
		}


		System.out.println("sum은? : " + sum);
		System.out.print("avg는? : " + sum/5);
		
	}
}
