import java.util.Scanner;
public class Almond2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		int num[] = new int [5];
		double avg = 0;
		int sum = 0 ;
		
		System.out.println("양수 5개를 입력하세요.");

		for(int i = 0 ; i<num.length; i++) {
			num[i] = scan.nextInt();
			sum = sum + num[i];
			
		
			
		}
		
		System.out.println("평균은 " + sum/num.length + "입니다.");
		
		
		
	}

}
