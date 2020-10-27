import java.util.Scanner;
public class Almond1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		int num[] = new int [5];
		int max = 0;
		int min = 0;
		
		System.out.println("양수 5개를 입력하세요.");

		for(int i = 0 ; i<num.length; i++) {
			num[i] = scan.nextInt();
			if(num[i]>max) { 
				max = num[i]; }
			
			}
		
		for(int i = 0 ; i<num.length; i++) {
			num[i] = scan.nextInt();
			if(num[i]<min) { 
				min = num[i]; }
			
			}
			
		System.out.println("가장 큰 수는 " + max + "입니다.");
		System.out.println("가장 작은 수는 " + min + "입니다.");
		}
		

		
		
	}

