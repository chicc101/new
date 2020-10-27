import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int [] num = new int[5];
		int sum = 0;


		System.out.println("5개의 정수를 입력하세요");
		for (int i=0; i<num.length; i++) {
			System.out.print((i+1) +"번 양수를 입력하세요 ");
			num[i] = scan.nextInt();
			sum += num[i];

		}

		double avg = (double) sum / num.length;
		System.out.println("평균은 " + sum/num.length);
		scan.close();

	}

}



